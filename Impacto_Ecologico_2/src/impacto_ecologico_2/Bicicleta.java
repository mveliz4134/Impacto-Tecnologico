
package impacto_ecologico_2;

public class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private boolean electrica;

    public Bicicleta(String tipo, boolean electrica) {
        this.tipo = tipo;
        this.electrica = electrica;
    }

    public void obtenerImpactoEcologico() {
    System.out.println("Identificación: Bicicleta");
    System.out.println("Tipo: " + tipo);
    System.out.println("Eléctrica: " + (electrica ? "Sí" : "No"));

    if (electrica) {
            System.out.println("La bicicleta es eléctrica, se debe considerar el impacto de la generación de electricidad.");
            // Realiza el cálculo específico para bicicletas eléctricas
            int impactoEco = 10; // Ejemplo de cálculo
            System.out.println("Impacto ecológico de la bicicleta eléctrica: " + impactoEco);
        } else {
            System.out.println("La bicicleta es convencional y no produce emisiones directas de carbono.");
            // Realiza el cálculo específico para bicicletas convencionales
            int impactoEco = 5; // Ejemplo de cálculo
            System.out.println("Impacto ecológico de la bicicleta convencional: " + impactoEco);
        }
}
}