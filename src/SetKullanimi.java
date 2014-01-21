import java.util.Set;
import java.util.TreeSet;

public class SetKullanimi {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Set<String> treeSet = new TreeSet<String>();// Set nesnesi
															// olusturulur
		// Set aslinda List'e cok benzer , en onemli fark ise ayni elemanin
		// birden fazla eklenmesine izin vermez

		treeSet.add("Osman");
		treeSet.add("Ayse");
		treeSet.add("Osman");
		// eleman olarak 2 defa "Osman" degeri girilmesine ragmen sadece bir
		// kere yazilir
		for (final String str : treeSet) {
			System.out.println(str);
		}
	}

}
