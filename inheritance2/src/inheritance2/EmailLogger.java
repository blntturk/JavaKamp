package inheritance2;

public class EmailLogger extends Logger {
	@Override // bu �ekilde base s�n�ftaki imzay� ezmi� oluyoruz.
	public void log() {
		System.out.println("Email Yolland�");
	}
}
