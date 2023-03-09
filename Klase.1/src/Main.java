/** @date 02/03/2023
 * 	@week 3
 *  @subject Klase.1
 */
public class Main {
	public static void main(String[] args) {
		Krug krug = new Krug(5);
		System.out.println(krug.getPovrsina() +"\n"+krug.getObim()+"\n"+krug.getRadius());
		Krug krug2 = new Krug();
		System.out.println(krug2.getRadius());
		Valjak valjak = new Valjak(3,4);
		System.out.println(valjak.getPovrsina()+"\n"+valjak.getZapremina());
		Valjak valjak2 = new Valjak();
		System.out.println(valjak2.getRadius());
	}
}
