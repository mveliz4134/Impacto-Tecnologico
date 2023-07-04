
package impacto_ecologico_2;

public class Auto implements ImpactoEcologico {
    private String modelo;
    private int emisiones;

    public Auto(String modelo, int emisiones) {
        this.modelo = modelo;
        this.emisiones = emisiones;
    }

    public void obtenerImpactoEcologico() {
        System.out.println("Identificación: Auto");
        System.out.println("Modelo: " + modelo);
        System.out.println("Emisiones de carbono: " + emisiones + " g/km");

        if (emisiones > 200) {
            System.out.println("El auto tiene altas emisiones de carbono, lo cual contribuye significativamente al impacto ecológico.");
            // Realiza el cálculo específico para autos con altas emisiones
            int impactoEco = emisiones * 5; // Ejemplo de cálculo
            System.out.println("Impacto ecológico del auto: " + impactoEco);
        } else {
            System.out.println("El auto tiene bajas emisiones de carbono y contribuye menos al impacto ecológico.");
            // Realiza el cálculo específico para autos con bajas emisiones
            int impactoEco = emisiones * 2; // Ejemplo de cálculo
            System.out.println("Impacto ecológico del auto: " + impactoEco);
        }
    }
}

