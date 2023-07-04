
package impacto_ecologico_2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Impacto_Ecologico_2 {

    public static void main(String[] args) {
       ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        
        Auto auto = new Auto("Sedan", 150);
        Bicicleta bicicleta = new Bicicleta("Montaña", false);

        
        //objetos.add(auto);
        //objetos.add(bicicleta);

        
        
       //variables empleadas para el ingreso de los datos de Edificio, Auto y Bicicleta 
       int Num_piso=0;
       String booleanEnergia_R="";
       boolean Energia_R=true;
        //Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Emplea energia renovable?"));
        int selector=0;
        do{
         
            selector = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Panel de Opcines para calcular emiciones de carbono\n\n"
                           +"1.Calcular impacto ecologico de un EDIFICIO\n"
                           +"2.Calcular impacto ecologico de un AUTO\n"
                           +"3.Calcular impacto ecologico de una BICICLETA\n"
                           +"4.Obtener impacto ecologico\n"          
                           +"5.Salir\n\n"));

            switch (selector) {
                case 1:
                    
                    Num_piso =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese prioridad"));
                    
                    booleanEnergia_R =JOptionPane.showInputDialog(null,"Emplea energia renovable?");
                    
                    if (booleanEnergia_R.equals("SI")) {
                        Energia_R=true;
                        Edificio edificio = new Edificio(Num_piso, Energia_R);
                        objetos.add(edificio);
                    } else  { 
                        if (booleanEnergia_R.equals("NO")) {
                        Energia_R=false;
                        Edificio edificio = new Edificio(Num_piso, Energia_R);
                        objetos.add(edificio);
                        } else {
                            JOptionPane.showInputDialog(null, "Dato incorrecto vualva a intentar");
                            break;
                        }
                    } 
                      
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break; 
                case 4:
                    
                    JOptionPane.showInputDialog(null, "A continuacion se muestra el impacto generado\n"
                           +"al ambiente de los siguientes objetos:");
                    
                    for (ImpactoEcologico objeto : objetos) {
                        objeto.obtenerImpactoEcologico();
                    }
                    break;    
                case 5:
                    selector=5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion Incorrecta Vuelva a Intentarlo Nuevamente");
                    break;
            }
        } while (selector!=5); 
    }
    
}
