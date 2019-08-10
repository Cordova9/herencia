
public class Cliente extends Persona {
	private int id_cliente;

	public Cliente(int id_cliente, String nombre, String dni, int edad) {
		super(dni, nombre, edad);
		this.id_cliente = id_cliente;
	}

	public void registrarCliente() {

	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public void Imprimir() {
		

	}
}
