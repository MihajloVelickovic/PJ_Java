public class Pravougaonik implements GeometrijskaSlika{
	private double m_A, m_B;
	public Pravougaonik(double a, double b) {
		m_A = a;
		m_B = b;
	}
	@Override
	public double getPovrsina() {
		return m_A*m_B;
	}
	@Override
	public double getObim() {
		return 2*m_A+2*m_B;
	}
	public void test() {
		System.out.println("Test");
	}
}
