package homeworks.task1.vending;

import homeworks.task1.products.Product;
import java.util.*;

public abstract class VendingMachine {
    private Map<Integer, Product> productMap;
	
    public VendingMachine(Map<Integer, Product>) {
       this.productMap = productMap;
    }

	public void showAllProduct() {
   		System.out.println("Список продуктов: ");
   		for (Map.Entity<Integer, Product> entry : productMap.entrySet()) {
	   		System.out.printf("Номер %d - Название: %s", entry.getKey(), entry.getValue().getTitle());
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
}
