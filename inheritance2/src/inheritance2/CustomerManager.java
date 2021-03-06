package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		// M??teri ekleme kodlar?
		
		System.out.println("M?steri eklendi");
		
		// Bir ?? yapan s?n?f ba?ka bir i? yapan s?n?f? kullanacaksa asla somut s?n?ftan
		// gidilmez. (Yani DataBaseLogger bu ?ekilde kullan?lmamal?. Bir i? yapan s?n?f
		// i?inde ba?ka bir i? yapan s?n?f new lenirse s?rd?r?lebilir olmaz. 
		// ?stte add()fonksiyonunda parametre olarak add(Logger logger) yaz?lmal?
		
		// DataBaseLogger logger = new DataBaseLogger();
		
		logger.log(); // buradaki .log() somut s?n?f i?indeki log() lara Logger s?n?f? i?inden ulasabiliyor (extends)
	}
}
