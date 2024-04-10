/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_sobrecarga_metodos;

/**
 *
 * @author Michelle
 */
public class EVA2_1_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //POLIMORFISMO -- MUCHAS FORMAS
        //DISTINTOS USOS Y COMPORTAMIENTOS
        /*SOBRECARGA DE METODOS
        Argumentos y el nombre del metodo 
        */
        
        System.out.println("La suma de 5 + 4 = " + sumar(5,4));
        System.out.println("La syma de 3.1 +2.5" + sumar(3.1,2.5));
        System.out.println("La suma de hola + mundo = " + sumar ("hola ","mundo"));
        System.out.println("La suma de 73 + 41 + 15 = " + sumar(73,41,15));
    }
        public static int sumar(int num1, int num2){
            return num1+ num2;
        }//sumar sobre carga de métodos
        //3 diferenes métodos
    //los métodos no se pueden repetir
        public static double sumar(double num1, double num2){
        return num1 + num2;   
        }
        public static String sumar(String num1, String num2){
        return num1 + num2;
        }
        public static void sumar(){
            System.out.println("Método que no hace nada!!!");
        }
        public static int sumar(int num1, int num2, int num3){
            return num1 + num2 +num3 ;
        }
}

