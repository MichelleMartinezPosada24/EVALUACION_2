/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_vehiculo;

/**
 *
 * @author invitado
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MARCA, MODELO, AÑO, COLOR, MÉTODO GET AND SET, IMPRIMIR DATOS
       
        vehiculo carrito = new vehiculo();
        carrito.ImprimirDatos();
        carrito.setModelo("Civic");
        carrito.setMarca("Honda");
        carrito.setAño(2020);
        carrito.setColor("Gris");
        vehiculo carrito2 = new vehiculo("Civic" , "Honda", 2020 , "Gris" );
        carrito2.ImprimirDatos();
               
        
       
        
    }
}
