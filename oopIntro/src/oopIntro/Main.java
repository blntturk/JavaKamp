package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo 14", 15000, "16 Gb Ram"); // ?rnek-referans-intance olu?turma.
																			// Product class?ndaki imzaya uyduk.

		// product1.id=1;
		// product1.name="Lenovo 14";
		// product1.unitPrice = 15000;
		// product1.detail ="16 Gb Ram";

		Product product2 = new Product(); // ?rnek-referans-intance olu?turma.(Product t?r?nde bir de?i?ken olusturduk)
		product2.id = 2;
		product2.name = "Lenovo 15";
		product2.unitPrice = 16000;
		product2.detail = "32 Gb Ram";

		Product product3 = new Product(); // ?rnek-referans-intance olu?turma.
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 10000;
		product3.detail = "8 Gb Ram";

		Product[] products = { product1, product2, product3 }; // Array

		for (Product product : products) { // d?ng?

			System.out.println(product.name);
		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahce";

		Category category3 = new Category(3, "Oyuncak"); // Category class taki imzaya uygun di?er yaz?m sekli

		Category[] categorys = { category1, category2, category3 };

		for (Category category : categorys) {
			System.out.println(category.name);
		}

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);

		productManager.addToCart(product2);

		productManager.addToCart(product3);

		productManager.delFromCart(product3);
	}

}
