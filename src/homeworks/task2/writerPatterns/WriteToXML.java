package homeworks.task2.writerPatterns;


public class WriteToXML implements WriteTo {
	
	private List<Student> studentList;

    	public WriteToXML(List<Student> studentList) {
        	this.studentList = studentList;
    	}

	public void write(){
		try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//studentList.xml", true)) {
		
		String text = makeText();
          	fileWriter.write(text);
             fileWriter.append('\n');
             fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}
	
	public StringBuilder makeText() {
		StringBuilder sb = new StringBuilder();
		
		Iterator<Student> iter = studentList.iterator();
		
		String[] fields = studentClassFields();
		
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
		sb.append(String.format("<%ss>", fields[0]));
		while(iter.hasNext()) {
			Student st = iter.next();
			sb.append(String.format("\n\t<%s>\n", fields[0]));
			sb.append(String.format("\t\t<%s>%s</%s>\n", fields[1], st.getName(), fields[1]));
			sb.append(String.format("\t\t<%s>%s</%s>\n", fields[2], st.getSurname(), fields[2]));
			sb.append(String.format("\t\t<%s>%s</%s>\n", fields[3], st.getAvgGrade(), fields[3]));
			sb.append(String.format("\t</%s>", fields[0]));
		}
		sb.append(String.format("\n<%ss>", fields[0]));
		return sb;
	}
	
	private String[] studentClassFields() {
	
		Class myClass = Student.class;
		Field[] fields = myClass.getDeclaredFields();
		
		String[] fieldsArray = new string[fields.length];
		
		fieldsArray[0] = myClass.getName().toLowerCase();
		fieldsArray[1] = fields[0].getName().toLowerCase();
		fieldsArray[2] = fields[1].getName().toLowerCase();
		fieldsArray[3] = fields[2].getName().toLowerCase();
		
		return fieldsArray;
	}
}



