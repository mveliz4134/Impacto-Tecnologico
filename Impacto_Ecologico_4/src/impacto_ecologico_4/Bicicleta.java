
package impacto_ecologico_4;

import javax.swing.JOptionPane;

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
        
            // Realiza el cálculo específico para bicicletas eléctricas
            int impactoEco = 10; // Ejemplo de cálculo
            JOptionPane.showMessageDialog(null,"La bicicleta es: Eléctrica \n"
                    + "->Se considera el impacto de la generación de electricidad<-\n"
                    + "Impacto ecológico de la bicicleta eléctrica: " + impactoEco+"\n");
            
        } else {
            System.out.println("La bicicleta es  y .");
            // Realiza el cálculo específico para bicicletas convencionales
            int impactoEco = 5; // Ejemplo de cálculo
            JOptionPane.showMessageDialog(null,"La bicicleta es: Convencional \n"
                    + "->Este tipo de bicicleta no produce emisiones directas de carbono<-\n"
                    + "Impacto ecológico de la bicicleta convencional: " + impactoEco+"\n");
        }
}
}
