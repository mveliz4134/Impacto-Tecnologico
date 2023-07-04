
package impacto_ecologico_3;


public class Edificio implements ImpactoEcologico {
    private int numeroPisos;
    private boolean tieneEnergiaRenovable;

    public Edificio(int numeroPisos, boolean tieneEnergiaRenovable) {
        this.numeroPisos = numeroPisos;
        this.tieneEnergiaRenovable = tieneEnergiaRenovable;
    }

    public void obtenerImpactoEcologico() {
        System.out.println("Identificación: Edificio");
        System.out.println("Número de pisos: " + numeroPisos);
        System.out.println("Energía renovable: " + (tieneEnergiaRenovable ? "Sí" : "No"));

        if (!tieneEnergiaRenovable) {
            System.out.println("El edificio no utiliza energía renovable, se debe considerar su impacto ecológico.");
            // Realiza el cálculo específico para edificios sin energía renovable
            int impactoEco = numeroPisos * 100; // Ejemplo de cálculo
            System.out.println("Impacto ecológico del edificio: " + impactoEco);
        } else {
            System.out.println("El edificio utiliza energía renovable y contribuye menos al impacto ecológico.");
            // Realiza el cálculo específico para edificios con energía renovable
            int impactoEco = numeroPisos * 50; // Ejemplo de cálculo
            System.out.println("Impacto ecológico del edificio: " + impactoEco);
        }
    }
}
