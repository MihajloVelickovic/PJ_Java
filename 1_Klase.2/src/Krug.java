public class Krug extends GeometrijskaSlika{
	public Krug(double r) {
		/*Poziv konstruktora natklase, 
		 * ako postoji onda mora biti prva naredba*/
		super(r); 
	}
	@Override
	public double getPovrsina() {
		return Math.pow(super.getLine(), 2) * Math.PI;
	}
	@Override
	public double getObim() {
		return Math.PI * 2 * super.getLine();
	}
}
