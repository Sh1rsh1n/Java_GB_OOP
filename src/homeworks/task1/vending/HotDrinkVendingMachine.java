package homeworks.task1.vending;

import homeworks.task1.products.Product;

public class HotDrinkVendingMachine extends VendingMachine{
	
	public HotDrinkVendingMachine(Map<Integer, Product> productMap) {
		super(productMap);
	}
	
   	public void showAllProduct() {
	   	System.out.println("Список горячих напитков: ");
   		for (Map.Entity<Integer, Product> entry : productMap.entrySet()) {
		   	if (!(entry.getValue() instanceof HotDrink)) {
			   	continue;
			 }
	   		System.out.printf("Номер %d - Название: %s, Цена: %d", entry.getKey(), entry.getValue().getTitle(), entry.getValue().getPrice());
		}
		
	}
	
	public Product getProductById(int productId) {
		for (Map.Entity<Integer, Product> entry : productMap.entrySet()) {
			if (entry.getKey() == productId) {
				return entry.getValue();
			}
		}
		throw new NoProductException("Продукт не найден");
	}
}
