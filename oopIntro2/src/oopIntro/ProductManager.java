package oopIntro;

// �zellik tutucu Class, �� Yapan (Maneger, Services) Class olmak �zere iki t�r class.
public class ProductManager {
	public void addToCart(Product product) { // i� yapan class metodu (void-yap)
		System.out.println("Sepete Eklendi :" + product.getName());

	}

	public void delFromCart(Product product) {
		System.out.println("Sepetten Kald�r�ld� :" + product.getName());
	}
}