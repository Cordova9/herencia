
public class Administrador extends Persona {

	int id_administrador;

	public Administrador(int id_administrador,String nombre, String dni, int edad) {
		super(dni,nombre,edad);
		this.id_administrador = id_administrador;
	
	}

	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	public void Imprimir() {
	System.out.println("Administrador: "+id_administrador);
	System.out.println("Nombre: "+getNombre());
	System.out.println("DNI: "+getDni());
	System.out.println("Edad: "+getEdad());
	
	}
}
