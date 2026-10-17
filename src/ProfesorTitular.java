public class ProfesorTitular extends PersonalUniversitario{
    double horasConAlumnos;
    String categoriaDocencia;

    public ProfesorTitular(String nombre, String legajo, int añosServicio, double horasConAlumnos, String categoriaDocencia){
        super(nombre, legajo, añosServicio);
        this.horasConAlumnos = horasConAlumnos;
        this.categoriaDocencia = categoriaDocencia;
    }

    @Override
    public double calcularSalarioBruto() {
        double sueldoBase = 450000.0;
        double bonoAntiguedad = añosServicio * 15000.0;
        double bonoDocencia = horasConAlumnos * 3500.0;
        return sueldoBase + bonoAntiguedad + bonoDocencia;
    }


    public void mostrarReporte() {
        System.out.println("--- CATEGORÍA: PROFESOR TITULAR ---");
        mostrarDatos();
        System.out.println("Categoría Docencia: " + categoriaDocencia + " | Horas: " + horasConAlumnos);
        System.out.println("Salario Bruto Calculado: $" + calcularSalarioBruto());
        System.out.println("----------------------------------------");
    }
}
