
public class Complex {

	private double i;
	private double r;
	private static int count = 0;

	public Complex(double i, double r) {
		this.i = i;
		this.r = r;
	}

	public double Calcul() {
		this.numar = Math.sqrt((this.r * this.r + this.i * this.i));
		return this.numar;
	}

	private double numar = Calcul();

	public void AfisareNumar() {
		Calcul();
		System.out.println("Nr. = " + this.r + " i * " + this.i);
		++count;
	}

	public Complex Suma(Complex com) {
		Complex c = new Complex(com.i, com.r);
		c.i = c.i + i;
		c.r = c.r + r;
		return c;
	}

	public void NumarAfisari() {
		System.out.println("Am afisat de " + count + " ori");
	}
}
