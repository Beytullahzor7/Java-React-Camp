package inheritance2;

public class EmailLogger extends Logger {
	@Override // kendi kodumu yazabilmek i�in basedeki kodu eziyorum
	public void log() {
		System.out.println("Email logland�");
	}
}
