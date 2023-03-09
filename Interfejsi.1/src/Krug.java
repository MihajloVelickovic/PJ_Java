public class Krug implements GeometrijskaSlika{
	private double m_Radius;
	public Krug(double r) {
		m_Radius = r;
	}
	@Override
	public double getPovrsina() {
		return Math.pow(m_Radius, 2) * Math.PI;
	}
	@Override
	public double getObim() {
		return Math.PI * 2 * m_Radius;
	}
}
