
public class Persona {
	private String nombre;
	private String dni;
	private int edad;

	public Persona() {

		this.nombre = "Error";
		this.dni = "Error";
		this.edad = 0;
	}

	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;

	}

	public String getDni() {
		return dni;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {//obtener
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void Imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Edad: "+edad);
		
	}

}
