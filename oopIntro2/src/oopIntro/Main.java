package oopIntro;

public class Main {

	public static void main(String[] args) {

		// Product product1 = new Product(1, "Lenovo 14", 15000, "16 Gb Ram", 10); // ?rnek-referans-intance
																						// olu?turma.
		// Product class?ndaki imzaya uyduk.
		// product1.id=1;
		// product1.name="Lenovo 14";
		// product1.unitPrice = 15000;
		// product1.detail ="16 Gb Ram";

		Product product2 = new Product(); // ?rnek-referans-intance olu?turma.(Product t?r?nde bir de?i?ken olusturduk)
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1= new Category();
		//category1.id=1;
		//category1.name="Yiyecek";
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2= new Category();
		//category2.id=2;
		//category2.name="??ecek";
		category2.setId(2);
		category2.setName("??ecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}
}