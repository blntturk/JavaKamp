package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType == 1) {
			System.out.println("Veritaban?na Logland?");
		} else if (logType == 2) {
			System.out.println("Dosyaya Logland?");
		} else {
			System.out.println("Email G?nderildi");
		}
	}
}
// Bu yanl?? bir kullan?m. Spagetti kod.. Bu Class a gerek yok