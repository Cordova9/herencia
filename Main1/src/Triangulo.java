
public class Triangulo extends FiguraGeometrica {

	public Triangulo(int medida) {
		super(medida, 3);

	}

	public double ObtenerArea() {
		return medida_lado * Math.sqrt(Math.pow(medida_lado, 2) - Math.pow(medida_lado / 2, 2)) / 2;
	}

	public void Imprimir() {

		int numFilas = medida_lado;

		System.out.println();
		for (int altura = 1; altura <= numFilas; altura++) {
			// Espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
