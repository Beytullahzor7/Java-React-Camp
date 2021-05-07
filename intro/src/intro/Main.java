package intro;

public class Main {

	public static void main(String[] args) {

		// camel case
		// don't repeat yourself

		String internetSubeButonu = "Ýnternet Subeye Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düstü resmi");

		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");

		}

		else {
			System.out.println("Dolar esittir resmi");
		}

		String kredi1 = "Hýzlý Kredi";

		System.out.println(kredi1);

		String[] krediler = {

				"Hýzlý Kredi", "Emekli Kredisi", "Meb Kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "ankara";
		String sehir2 = "izmir";
		sehir1 = sehir2;
		System.out.println(sehir1);

	}

}
