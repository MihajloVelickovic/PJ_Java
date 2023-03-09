public class Main {
	public static void main(String[] args) {
		/*Na pokazivace osnovne klase mogu se kaciti
		  objekti izvedenih*/ 
		GeometrijskaSlika [] gs = new GeometrijskaSlika[2];
		gs[0] = new Krug(3);
		gs[1] = new Pravougaonik(2);
		System.out.println(gs[0].getPovrsina());
	}
}
