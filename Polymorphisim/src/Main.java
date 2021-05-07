
public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsolLogger()};
		for (BaseLogger logger:loggers) {
			logger.log("Log Mesajý");	
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
