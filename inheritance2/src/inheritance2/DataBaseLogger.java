package inheritance2;

public class DataBaseLogger extends Logger {
	@Override // bu �ekilde base s�n�ftaki imzay� ezmi� oluyoruz.
	public void log() {
		System.out.println("Database Logland�");
	}
}
