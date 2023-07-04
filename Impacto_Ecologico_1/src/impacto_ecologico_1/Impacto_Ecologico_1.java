
package impacto_ecologico_1;


import java.util.ArrayList;


public class Impacto_Ecologico_1 {

   
    public static void main(String[] args) {
      ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        Edificio edificio = new Edificio(5, true);
        Auto auto = new Auto("Sedan", 150);
        Bicicleta bicicleta = new Bicicleta("Montaña", false);

        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            objeto.obtenerImpactoEcologico();
        }
    }
    
}
