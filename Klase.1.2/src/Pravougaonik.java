public class Pravougaonik extends GeometrijskaSlika{
	private double m_A, m_B;
	public Pravougaonik(double a, double b) {
		m_A = a;
		m_B = b;
	}
	@Override
	public double getPovrsina() {
		return m_A*m_B;
	}
}
