
public class FiguraGeometrica {
	int medida_lado = 10;
	int cantidad_lados = 4;

	public FiguraGeometrica(int medida, int cantidad) {
		medida_lado = medida;
		cantidad_lados = cantidad;
	}

	public double ObtenerPerimetro() {
		return medida_lado * cantidad_lados;
	}

	public double ObtenerArea() {

		return 0;
	}

	public void Imprimir() {
	
		
	}

}

