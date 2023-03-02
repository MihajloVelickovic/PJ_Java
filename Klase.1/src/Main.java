/** @date 02/03/2023
 * 	@week 3
 *  @subject Klase.1
 */
public class Main {
	public static void main(String[] args) {
		Krug krug = new Krug(5);
		System.out.println(krug.getPovrsina() + krug.getObim() + krug.getRadius());
		Krug krug2 = new Krug();
		System.out.println(krug2.getRadius());
		
	}
}
