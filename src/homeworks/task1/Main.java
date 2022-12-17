package homeworks.task1;

import homeworks.task1.products.Coffee;
import homeworks.task1.products.Product;
import homeworks.task1.products.Tea;
import homeworks.task1.vending.HotDrinkVendingMachine;
import homeworks.task1.vending.VendingMachine;

public class Main {
	
	private static void vendingMachineActions(VendingMachine vm) {
		
		Scanner scan = new Scanner(System.in);
		
		if (vm instanceof HotDrinkVendingMachine)
			System.out.println("АВТОМАТ ГОРЯЧИХ НАПИТКОВ");
			
			vm.showAllProduct();
			int enterNum = scan.nextInt();
			
			
		else
			System.out.println("АВТОМАТ СМЕШЕННЫХ ТОВАРОВ");
		
		
	}

    public static void main(String[] args) {
		
       
    }
}
