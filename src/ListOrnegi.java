import java.util.ArrayList;
import java.util.List;

public class ListOrnegi {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final List<String> liste = new ArrayList<String>();

		liste.add("Akku�");// ilk elemana deger atama..
		liste.add("Bilgisayar M�hendisi");// ikinci elemana deger atama..

		/*
		 * Listeyi ekrana yazdirma , Cikti --> Akku� Bilgisayar M�hendisi
		 */
		for (final String str : liste) {
			System.out.println(str + "  ");
		}

		liste.add(0, "Alican");// Listenin tekrar en basina eleman ekleme

		for (final String str : liste) {
			System.out.println(str + "  ");
		}
		/*
		 * cikti Alican Akku� Bilgisayar M�hendisi
		 */

		// Listede eleman aramak icin constains methodu kullanilir..
		if (liste.contains("Alican")) {
			System.out.println("Alican listede bulundu...");
		}

		// Listenin boyutunu ekrana yazdiralim
		// cikti : 3
		System.out.println(liste.size());
	}

}
