
package impacto_ecologico_4;

import javax.swing.JOptionPane;

public class Auto implements ImpactoEcologico {
    private String modelo;
    private int emisiones;

    public Auto(String modelo, int emisiones) {
        this.modelo = modelo;
        this.emisiones = emisiones;
    }

    public void obtenerImpactoEcologico() {
        JOptionPane.showMessageDialog(null,"Identificación: Auto"+"\n"
                + "Modelo: " + modelo+"\n"
                +"Emisiones de carbono: " + emisiones + " g/km");

        if (emisiones > 200) {
            // Realiza el cálculo específico para autos con altas emisiones
            int impactoEco = emisiones * 5; // Ejemplo de cálculo
            JOptionPane.showMessageDialog(null,"->El auto tiene bajas emisiones de carbono y contribuye menos al impacto ecológico.<-\n"
                    + "Impacto ecológico del auto: " + impactoEco+"\n");
        } else {
            // Realiza el cálculo específico para autos con bajas emisiones
            int impactoEco = emisiones * 2; // Ejemplo de cálculo
            JOptionPane.showMessageDialog(null,"->El auto tiene altas emisiones de carbono, lo cual contribuye significativamente al impacto ecológico.<-\n"
                    + "Impacto ecológico del auto: " + impactoEco+"\n");
        }
    }
}

