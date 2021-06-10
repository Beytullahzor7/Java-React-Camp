package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	public ErrorResult() { // mesaj bilgisini vermeden sadece false oldugu bilgisini vermek istiyoruz
		super(false);
	}

	public ErrorResult(String message) { // hem mesaj hem dogruluk bilgisi vermek istiyoruz
		super(false, message);
	}

}
