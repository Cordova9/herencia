public class Cuadrado extends FiguraGeometrica {

	public Cuadrado(int medida) {
		super(medida, 4);// clase padre

	}

	public double ObtenerArea() {
		return medida_lado * medida_lado;
	}

	public void Imprimir() {
		
		for (int i = 1; i <= medida_lado; i++) {
			
			
			for (int j = 1; j <= medida_lado; j++) {
				if (j == 1 || j == medida_lado || i == 1 || i == medida_lado) {
					System.out.print("*");
					System.out.print(" ");
					
				} else {

					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
}

