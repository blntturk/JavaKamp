package interfaces;

public class CustomerManager {
	private Logger[] loggers; // neye katý baglýysak onun private deðiþkenini yaptýk. ve deðiþkenin üzerine
								// gelip source menusunden >Constructor olusturduk.

	public CustomerManager(Logger[] loggers) { // Constructor blogu olustu

		this.loggers = loggers;
	}

// 	loosly -tightly coupled ( gevsek ve katý baðlýlýk). Kötü kodda Databaselogger a katý bagýmlý olduk. 
//  Gevsek bagýmlýlýga gecmek için neye bagýmlýysak onun private deðiþkenini yaparýz.üstteki gibi( private Logger logger;)

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi :" + customer.getFirstName());
//		DataBaseLogger logger = new DataBaseLogger();
//		logger.log(customer.getFirstName() + " veritabanýna loglandý");

		// this.logger.log(customer.getFirstName()); aray yapýnca hükmü kalmadý.
//		for (Logger logger : loggers)
//			logger.log(customer.getFirstName());
		// Utils utils=new Utils();
		// utils.runLoggers(loggers, customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi :" + customer.getFirstName());
//		DataBaseLogger logger = new DataBaseLogger();
//		logger.log(customer.getFirstName() + " veritabanýna loglandý");
//		for (Logger logger : loggers)
//			logger.log(customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());

	}
}
