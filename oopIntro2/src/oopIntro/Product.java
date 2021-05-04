package oopIntro;

public class Product {

	// deðiþkenler bu þekilde býrakýlmaz. Encapsulation Getter Setter gerekli.
	// *************** 1-Deðiþkenler tanýmlandý
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	// private double unitPriceAfterDiscount; //gerek kalmadý

	// final ifadesi dýsarýdan eriþimi kýsýtlar. sadece Constructor da set etmeye
	// izin verir.
	// private ifadesi özel. Sadece Bu Classta kullanýlabilir. Dýsarýdan eriþime
	// engellenir.

	public Product() {

	}

	// *************** 2- üstteki deðiþkenlerden constructor olusturduk
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		// this.unitPriceAfterDiscount = unitPriceAfterDiscount; //buna gerek kalmadý
		// getter ile hesaplama yaparak hallettik 	
		
	//  *************** 3- Constructordan Encapsulation yaptýk-Getter setter yapýldý. ilk deðiþkenler private yapýldý.

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100); // ** 3- Hespalama yapýlýp gösterildi. veri girlmeyecek.
	}

	
}
