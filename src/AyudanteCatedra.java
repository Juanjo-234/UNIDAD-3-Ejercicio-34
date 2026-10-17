public class AyudanteCatedra extends  PersonalUniversitario{
    private String asignacionPracticas;

    public AyudanteCatedra(String nombre, String legajo, int añosServicio, String asignacionPracticas) {
        super(nombre, legajo, añosServicio);
        this.asignacionPracticas = asignacionPracticas;
    }

    @Override
    public double calcularSalarioBruto() {
        double sueldoBase = 280000.0;
        double bonoAntiguedad = añosServicio * 8000.0;
        return sueldoBase + bonoAntiguedad;
    }

    public void mostrarReporte() {
        System.out.println("--- CATEGORÍA: AYUDANTE DE CÁTEDRA ---");
        mostrarDatos();
        System.out.println("Asignación de prácticas: " + asignacionPracticas);
        System.out.println("Salario Bruto Calculado: $" + calcularSalarioBruto());
        System.out.println("----------------------------------------");
    }
}
