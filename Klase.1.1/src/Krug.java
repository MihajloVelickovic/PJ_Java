import java.util.Scanner;

public class Krug {
	private double m_Radius;
	public Krug() {
		//m_Radius = 10 * Math.random();  /*radnom daje broj od 0.0 do 1.0*/
		Scanner scanner = new Scanner(System.in); //Predstavlja tastaturu;
		m_Radius = scanner.nextDouble();
	}
	public Krug(double r) {
		m_Radius = r;
	}
	final public double getRadius() {
		return m_Radius;
	}
	final public double getObim() {
		return Math.PI * 2 * m_Radius;
	}
	public double getPovrsina() {
		return Math.PI * Math.pow(m_Radius, 2);
	}
}
