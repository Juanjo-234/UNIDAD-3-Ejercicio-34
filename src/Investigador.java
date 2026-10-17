public class Investigador extends PersonalUniversitario{
    double papersPublicados;
    double subsidioAsignado;

    public Investigador(String nombre, String legajo, int añosServicio, double papersPublicados, double subsidioAsignado){
        super(nombre, legajo, añosServicio);
        this.papersPublicados = papersPublicados;
        this.subsidioAsignado = subsidioAsignado;
    }

    @Override
    public double calcularSalarioBruto() {
        double sueldoBase = 500000.0;
        double bonoPapers = papersPublicados * 25000.0;
        double incentivoSubsidio = subsidioAsignado * 0.05;
        return sueldoBase + bonoPapers + incentivoSubsidio;
    }

    public void mostrarReporte() {
        System.out.println("--- CATEGORÍA: INVESTIGADOR ---");
        mostrarDatos();
        System.out.println("Papers publicados: " + papersPublicados + " | Subsidio asignado: $" + subsidioAsignado);
        System.out.println("Salario Bruto Calculado: $" + calcularSalarioBruto());
        System.out.println("----------------------------------------");
    }
}

