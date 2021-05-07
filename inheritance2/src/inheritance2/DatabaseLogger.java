package inheritance2;

public class DatabaseLogger extends Logger {
	@Override // kendi kodumu yazabilmek için basedeki kodu eziyorum
	public void log() {
		System.out.println("Database loglandý");
	}

}
