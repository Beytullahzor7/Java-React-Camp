package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String message;

	public Result(boolean success) {
		this.success = success;

	}

	public Result(boolean success,String message) {
		this(success); // do not repeat yourself
		this.message = message;

	}

	public boolean isSuccess() { //getter
		return this.success;
	}

	public String getMessage() {
		return this.message;
	}

}
