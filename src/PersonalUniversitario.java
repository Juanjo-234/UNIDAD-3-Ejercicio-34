public abstract class PersonalUniversitario {
    String nombre;
    String legajo;
    int añosServicio;

    public PersonalUniversitario(String nombre, String legajo, int añosServicio){
        this.nombre = nombre;
        this.legajo  =legajo;
        this.añosServicio = añosServicio;

    }
    public abstract double calcularSalarioBruto();

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Años de servicio: " + añosServicio);
    }
}
