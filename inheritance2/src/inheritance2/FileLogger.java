package inheritance2;

public class FileLogger extends Logger {
	@Override // kendi kodumu yazabilmek i�in basedeki kodu eziyorum
	public void log() {
		System.out.println("Dosya logland�");
	}

}
