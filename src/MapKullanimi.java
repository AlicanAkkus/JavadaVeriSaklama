import java.util.HashMap;
import java.util.Map;

public class MapKullanimi {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final Map<String, String> userMap = new HashMap<String, String>();// userMap
																			// nesnesini
																			// oluþturuyoruz

		userMap.put("email", "alican.akkus94@gmail.com");// Anahtar olarak
															// "email" , deger
															// olarak mail
															// adresi
															// yaziyoruyoz..
		userMap.put("adres", "Ýtanbul/Turkiye");// Anahtar "adres" , deger
												// "Ýtanbul/Turkiye"

		System.out.println("Kullanici Adresi : " + userMap.get("adres"));// get
																			// metoduna
																			// key
																			// degerini
																			// girerek
																			// ,
																			// bu
																			// anahtara
																			// karsilik
																			// gelen
																			// degeri
																			// aliyoruz
		System.out.println("Kullanici E-mail : " + userMap.get("email"));

		System.out.println("Map'i for ile yazdirma..");
		for (final Map.Entry<String, String> pairs : userMap.entrySet()) {

			System.out.println(pairs);

		}
	}

}
