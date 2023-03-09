/** @date 02/03/2023
 * 	@week 4
 *  @subject Klase.2
 */
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
