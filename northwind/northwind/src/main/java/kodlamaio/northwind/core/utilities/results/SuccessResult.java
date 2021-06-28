package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result {
	public SuccessResult() { // mesaj bilgisini vermeden sadece true oldugu bilgisini vermek istiyoruz
		super(true);
	}

	public SuccessResult(String message) { // hem mesaj hem dogruluk bilgisi vermek istiyoruz
		super(true, message);
	}

}
