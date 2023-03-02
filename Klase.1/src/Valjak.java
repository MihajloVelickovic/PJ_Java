
public class Valjak extends Krug {
	private double m_Height;
	
	public Valjak(double r, double h) {
		//Konstruktor nadklase, mora biti prvi poziv u funkciji
		super(r);
		m_Height = h;
	}
	@Override
	public double getPovrsina() {
		return super.getObim() * m_Height + 2 * super.getPovrsina();
	}
	@Override
	public double getObim() {
		
	}
	
}