import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	List<Persona> listapersonas = new ArrayList<Persona>();
	System.out.println("Datos del cliente");
	Cliente c =new Cliente(1, "sadabs","44687",32);
	listapersonas.add(c);
	
	
	Cliente c1= new Cliente (2,"ghrrj","5467",45);
	listapersonas.add(c1);
	
	Cliente c2= new Cliente (3,"regr","4564",54);
	listapersonas.add(c2);
	
	Administrador a1 = new Administrador(1,"hdhtt","468746",87);
	listapersonas.add(a1);
	
	Administrador a2 = new Administrador(2,"yyjnyfj","468746",89);
	listapersonas.add(a2);
	
	Administrador a3 = new Administrador(3,"bgfbgf","4687",56);
	listapersonas.add(a3);
	
	for (Persona variable : listapersonas) {
		System.out.println(variable.getClass() + "-"+c.getClass());
		if(variable.getClass().equals(c.getClass())) {
			if (variable.getEdad()>30) {
				variable.Imprimir();
			}
			
		}else {
			if (variable.getEdad()>50) {
		variable.Imprimir();
			}
		}
	}
	}
}








//	String var = "Juan|perez";
//	String array[] =var.split("|");

// "Juan|perez" =["Juan" , "perez"]
