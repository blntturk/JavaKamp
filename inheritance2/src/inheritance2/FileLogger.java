package inheritance2;

public class FileLogger extends Logger {
	@Override // bu �ekilde base s�n�ftaki imzay� ezmi� oluyoruz.
	public void log() {
		System.out.println("Dosya Logland�");
	}
}
