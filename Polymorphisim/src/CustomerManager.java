
public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;

	}

	public void add() {
		System.out.println("Müþteri Eklendi");
		this.logger.log("log mesajý");

	}

}
