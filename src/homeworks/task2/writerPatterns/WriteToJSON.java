package homeworks.task2.writerPatterns;

import homeworks.task2.Student;

public class WriteToJSON implements WriteTo {
	
	private List<Student> studentList;

    public WriteToText(List<Student> studentList) {
        this.studentList = studentList;
    }


    public void write() {
		
	try (FileWriter fileWriter = new FileWriter("src//homeworks//task2//studentList.json", true)) {
		
		String text = makeText();
          	fileWriter.write(text);
             fileWriter.append('\n');
             fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}
	
	private StringBuilder makeText() {
		StringBuilder sb = new StringBuilder();
		
		Iterator<Student> iter = studentList.iterator();
		
		sb.append("{\n");
		while(iter.hasNext()) {
			Student st = iter.next();
			sb.append(String.format("\"%s %s\": %s",st.getName(), st.getSurname(), st.getAvgGrade()));
			if (iter.hasNext()) {
				sb.append(",\n");
			}
		}
		sb.append("\n}");
		return sb;
	}
}



