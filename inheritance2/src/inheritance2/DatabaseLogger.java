package inheritance2;

public class DatabaseLogger extends Logger {
	@Override // kendi kodumu yazabilmek i�in basedeki kodu eziyorum
	public void log() {
		System.out.println("Database logland�");
	}

}
