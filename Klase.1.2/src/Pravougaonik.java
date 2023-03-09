public class Pravougaonik extends GeometrijskaSlika{ 
	public Pravougaonik(double a) {
		super(a);
	}
	@Override
	public double getPovrsina() {
		return Math.pow(super.getLine(),2);
	}
	@Override
	public double getObim() {
		return 4*super.getLine();
	}
}
