package sistematico1;

public class mainpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Persona p = new Persona();
		    System.out.println("Ingrese el nombre");
		    p.setNombre("");
		    System.out.println("Ingrese la edad");
		    p.setEdad=("");
		    p.setDni("12345678A");
		    p.mostrar();
		    System.out.println("¿Es mayor de edad? " + p.esMayorDeEdad());
		}
	}


