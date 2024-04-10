/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_sobrecarga_constructores;

/**
 *
 * @author Michelle
 */
public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objeto tipo persona
        persona perso1 = new persona();
        perso1.imprimirDatos();
        
        persona perso2 = new persona ("pedro ", "paramo ", 70);
        perso2.imprimirDatos();
        //al usar los set, se borran los datos previos y son reemplazados
        //con los agignados por los métodos
        perso2.setNombre("Juan");
        perso2.setApellidos("Paramo");
        perso2.setEdad(70);
        perso2.imprimirDatos();
        
    }
    
}
