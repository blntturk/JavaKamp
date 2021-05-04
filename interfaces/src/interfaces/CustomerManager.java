package interfaces;

public class CustomerManager {
	private Logger[] loggers; // neye kat� bagl�ysak onun private de�i�kenini yapt�k. ve de�i�kenin �zerine
								// gelip source menusunden >Constructor olusturduk.

	public CustomerManager(Logger[] loggers) { // Constructor blogu olustu

		this.loggers = loggers;
	}

// 	loosly -tightly coupled ( gevsek ve kat� ba�l�l�k). K�t� kodda Databaselogger a kat� bag�ml� olduk. 
//  Gevsek bag�ml�l�ga gecmek i�in neye bag�ml�ysak onun private de�i�kenini yapar�z.�stteki gibi( private Logger logger;)

	public void add(Customer customer) {
		System.out.println("M��teri eklendi :" + customer.getFirstName());
//		DataBaseLogger logger = new DataBaseLogger();
//		logger.log(customer.getFirstName() + " veritaban�na logland�");

		// this.logger.log(customer.getFirstName()); aray yap�nca h�km� kalmad�.
//		for (Logger logger : loggers)
//			logger.log(customer.getFirstName());
		// Utils utils=new Utils();
		// utils.runLoggers(loggers, customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("M��teri silindi :" + customer.getFirstName());
//		DataBaseLogger logger = new DataBaseLogger();
//		logger.log(customer.getFirstName() + " veritaban�na logland�");
//		for (Logger logger : loggers)
//			logger.log(customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());

	}
}
