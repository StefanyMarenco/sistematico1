package sistematico1;

	public class Persona {
	    private String nombre;
	    private int edad;
	    private String DNI;
		public String setEdad;

	    public Persona() {
	        this.nombre = "";
	        this.edad = 0;
	        this.DNI = "";
	    }

	    public Persona(String nombre, int edad, String dni) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.DNI = DNI;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        if (nombre != null && !nombre.isEmpty()) {
	            this.nombre = nombre;
	        }
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        if (edad >= 0) {
	            this.edad = edad;
	        }
	    }

	    public String getDni() {
	        return DNI;
	    }

	    public void setDni(String dni) {
	        if (dni != null && !dni.isEmpty()) {
	            this.DNI = DNI;
	        }
	    }

	    public void mostrar() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("DNI: " + DNI);
	    }

	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }
	}
	


