package inheritance2;

public class FileLogger extends Logger {
	@Override // bu þekilde base sýnýftaki imzayý ezmiþ oluyoruz.
	public void log() {
		System.out.println("Dosya Loglandý");
	}
}
