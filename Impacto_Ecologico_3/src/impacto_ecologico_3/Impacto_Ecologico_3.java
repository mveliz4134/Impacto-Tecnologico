
package impacto_ecologico_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Impacto_Ecologico_3 {

   
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

       //variables empleadas para el ingreso de los datos de Edificio, Auto y Bicicleta 
       // Edificio
       int Num_piso=0;
       String booleanEnergia_R="";
       boolean Energia_R=true;
       // Auto
       String modelo="";
       int emisiones=0; //g/km
       //Bicicleta
       String tipo="";
       String booleanElectrica="";
       boolean electrica=true;
       
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
                    
                    Num_piso =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Numero de pisos del edificio"));
                    
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
                    modelo =JOptionPane.showInputDialog(null,"Ingrese el Modelo del Auto");
                    
                    emisiones =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad prevista de emiciones de carbodo por kilometro de su auto"));
                    
                    Auto auto = new Auto(modelo, emisiones);
                    objetos.add(auto);
                    
                    break;
                case 3:
                    tipo =JOptionPane.showInputDialog(null,"Ingrese tipo de bicibleta empleada, ejem: Montaña");
                    
                    booleanElectrica =JOptionPane.showInputDialog(null,"Emplea energia renovable?");
                    
                    if (booleanElectrica.equals("SI")) {
                        electrica=true;
                        Bicicleta bicicleta = new Bicicleta(tipo, electrica);
                        objetos.add(bicicleta);
                    } else  { 
                        if (booleanElectrica.equals("NO")) {
                        electrica=false;
                        Bicicleta bicicleta = new Bicicleta(tipo, electrica);
                        objetos.add(bicicleta);
                        } else {
                            JOptionPane.showInputDialog(null, "Dato incorrecto vualva a intentar");
                            break;
                        }
                    } 
                    
                    break; 
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "A continuacion se muestra el impacto generado\n"
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
