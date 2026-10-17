//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ProfesorTitular profesor = new ProfesorTitular("Dr. Roberto Sánchez", "1001", 12, 40, "Titular Exclusivo");
    Investigador investigador = new Investigador("Dra. Marcela Torres", "1002", 8, 5, 300000.0);
    AyudanteCatedra ayudante = new AyudanteCatedra("Lucas Gómez", "1003", 2, "Laboratorio de Programación II");

    System.out.println("=== REPORTE INSTITUCIONAL DE RETRIBUCIÓN UNIVERSITARIA ===\n");
    profesor.mostrarReporte();
    investigador.mostrarReporte();
    ayudante.mostrarReporte();
}

