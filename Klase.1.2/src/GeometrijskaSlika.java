/*Apstraktna klasa, sme da ima apstraktne metode
  koje se u nasledjenim klasama definisu
  kljucna rec: abstract
*/
public abstract class GeometrijskaSlika {
	private double m_Line;
	public GeometrijskaSlika() {}
	public GeometrijskaSlika(double x) {
		m_Line = x;
	}
	public double getLine() {
		return m_Line;
	}
	public abstract double getPovrsina();
	public abstract double getObim();
}


