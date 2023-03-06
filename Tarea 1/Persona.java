public class Persona{    
    private String nombre, apellido;
    private int edad;

    public Persona(String nombre, String apelllido, int edad){
        super(); //transmitir a clases hijas
        this.nombre = nombre; //constructor
        this.apellido = apelllido;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

}

class Trabajo extends Persona{

    private String ocupacion;
    private int sueldo;
    
    public Trabajo(String nombre, String apellido, int edad, String ocupacion, int sueldo){
        super(nombre, apellido, edad);
        this.ocupacion = ocupacion;
        this.sueldo = sueldo;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
}

class Area extends Trabajo{
    
    private String departamento, ciudad;
    public Area(String nombre, String apellido, int edad, String ocupacion, int sueldo, String departamento, String ciudad){
        super(nombre, apellido, edad, ocupacion, sueldo); //pasa los atributos que necesita persona
        this.departamento = departamento;
        this.ciudad = ciudad;
    }
    public String getDepartamento(){
        return departamento;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public static int calcularPotencia(int base, int exponente) {
        // condición cuando el exponente es igual a 0
        if (exponente == 0) {
            return 1;
        }
        // condición exponente es mayor que cero
        else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {

        //Potencia de un numero con recursividad
        int base = 4;
        int exponente = 6;
        int potencia = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + potencia);

        //Clasees persona, trabajo y area	
		Area persona1 = new Area("Juan", "Mojica", 20, "front end developer", 1600000, "Diseño", "Bogotá");
        persona1.setNombre("Diego");
        System.out.println("Nombre: " + persona1.getNombre() + 
                        "\nApellido: " + persona1.getApellido() +
                        "\nEdad: " + persona1.getEdad() +
                        "\nOcupación: " + persona1.getOcupacion() +
                        "\nSueldo: $" + persona1.getSueldo() +
                        "\nDepartamento: " + persona1.getDepartamento() +
                        "\nCiudad: " + persona1.getCiudad());
	}
}

