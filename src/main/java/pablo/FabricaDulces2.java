/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class FabricaDulces2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables de la opcion a elegir=Calcular
        String opcion;
        
        String menu = """
                        Escriba lo quiere hacer.
                  --------------------------------------
                       Calcular=="Viabilidad de Productos"
                       Salir== "Salir del programa"
                  --------------------------------------
                  
                  
                  
                  """;        
        
        do {
            opcion = JOptionPane.showInputDialog(null, menu);
            //Si elegimos calcular 
            if (opcion.equalsIgnoreCase("calcular")) {
                //Si elegimos calcular 
                JOptionPane.showInputDialog(null,"Has elegido calcular producto ");
                //Sale el menu con las opciones y si escribimos salir nos salimos si no 
                if (opcion.equalsIgnoreCase("salir") == false){
                 
                    
                 
                }
                 
                 
                
                 
                
                
            
            }
            //Escribir para que cuando ponga otra cosa se repita
        } while (opcion.equalsIgnoreCase("salir") == false);
        
    }
    
}
