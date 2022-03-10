
public class ClientComplex {

	public static void main(String[] args) {
		Complex c1 = new Complex(11.15, 28.21);
		c1.AfisareNumar();
		Complex c2 = new Complex(12.84, 20.16);
		c2.AfisareNumar();
		c1.Suma(c2);
		c1.AfisareNumar();
		c1.NumarAfisari();
	}

}
