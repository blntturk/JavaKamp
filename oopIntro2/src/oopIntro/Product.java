package oopIntro;

public class Product {

	// de�i�kenler bu �ekilde b�rak�lmaz. Encapsulation Getter Setter gerekli.
	// *************** 1-De�i�kenler tan�mland�
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	// private double unitPriceAfterDiscount; //gerek kalmad�

	// final ifadesi d�sar�dan eri�imi k�s�tlar. sadece Constructor da set etmeye
	// izin verir.
	// private ifadesi �zel. Sadece Bu Classta kullan�labilir. D�sar�dan eri�ime
	// engellenir.

	public Product() {

	}

	// *************** 2- �stteki de�i�kenlerden constructor olusturduk
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		// this.unitPriceAfterDiscount = unitPriceAfterDiscount; //buna gerek kalmad�
		// getter ile hesaplama yaparak hallettik 	
		
	//  *************** 3- Constructordan Encapsulation yapt�k-Getter setter yap�ld�. ilk de�i�kenler private yap�ld�.

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
		return this.unitPrice - (this.unitPrice * this.discount / 100); // ** 3- Hespalama yap�l�p g�sterildi. veri girlmeyecek.
	}

	
}
