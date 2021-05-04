package inheritance2;

public class EmailLogger extends Logger {
	@Override // bu þekilde base sýnýftaki imzayý ezmiþ oluyoruz.
	public void log() {
		System.out.println("Email Yollandý");
	}
}
