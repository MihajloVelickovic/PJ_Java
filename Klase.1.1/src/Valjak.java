import java.util.Scanner;

public class Valjak extends Krug {
	private double m_Height;
	
	public Valjak() {
		super();
		Scanner scanner = new Scanner(System.in); //Predstavlja tastaturu;
		m_Height = scanner.nextDouble();
	}
	public Valjak(double r, double h) {
		//Konstruktor nadklase, mora biti prvi poziv u funkciji
		super(r);
		m_Height = h;
	}
	@Override //marker za preklapanje, funkcija() override u C++
	public double getPovrsina() {
		return super.getObim() * m_Height + 2 * super.getPovrsina();
	}	
	public double getZapremina() {
		return super.getPovrsina() * m_Height;
	}
}
