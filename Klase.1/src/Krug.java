public class Krug {
	private double m_Radius;
	public Krug() {
		m_Radius = 10 * Math.random();  /*radnom daje broj od 0.0 do 1.0*/
	}
	public Krug(double r) {
		m_Radius = r;
	}
	public double getRadius() {
		return m_Radius;
	}
	public double getObim() {
		return Math.PI * 2 * m_Radius;
	}
	public double getPovrsina() {
		return Math.PI * Math.pow(m_Radius, 2);
	}
}
