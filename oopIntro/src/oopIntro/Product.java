package oopIntro;

public class Product {

	public Product() { // parametresiz Constructor (yap?c?) blogu
		System.out.println("Ben ?al??t?m");
	}

	public Product(int id, String name, double unitPrice, String detail) { // Parametreli Constructor blogu. imza ?rne?i.
																			 

		// ?stteki imzada bulunan de?erler (id, name vs.) d?sar?dan eri?ilemez. eri?mek
		// i?in this ile bu classtaki de?erlerle asa??daki d?sardan eri?ilen de?erlerle e?itleyip
		// eri?ime acar?z.bo? parametresiz Product ?al???r. "Ben ?al??t?m" k?sm?...
		
		// this(); 
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;

	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
