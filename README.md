Este programa está diseñado para modelar un sistema institucional de gestión de recursos humanos universitarios aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para el cálculo de salarios brutos con bonificaciones específicas por docencia, investigación y asistencia pedagógica.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base PersonalUniversitario: Concentra los atributos comunes a cualquier agente de la institución (nombre, legajo y antiguedadAnios), provee un constructor parametrizado centralizado y define la estructura base para la consulta de datos.

Desarrolla las clases hijas (ProfesorTitular, Investigador y AyudanteCatedra): Extienden de PersonalUniversitario incorporando sus atributos particulares y especializados (horas de clase y categoría docente para el titular; papers publicados y subsidio de investigación para el investigador; materia y cantidad de comisiones de trabajos prácticos para el ayudante).

Sobrescribe el cálculo de salario mensual bruto: Cada subclase implementa su propia fórmula retributiva ponderando un sueldo básico institucional, antigüedad acumulada y bonos específicos según su perfil académico.

Ejecuta la prueba en el main: Crea una lista polimórfica de agentes universitarios, invoca dinámicamente sus cálculos de retribución salarial y despliega un reporte institucional consolidado por consola.
