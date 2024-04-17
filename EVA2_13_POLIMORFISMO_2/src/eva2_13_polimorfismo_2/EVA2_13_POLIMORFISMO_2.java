/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author Michelle
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona("Juan", "Perez");
        Persona perso2 = new Persona("Jose", "Agusto");
        Persona perso3 = new Persona("Beto", "Ramirez");
        
        Estudiante estu1 = new Estudiante("1100", "Jose", "Valencia");
        Estudiante estu2 = new Estudiante("1101", "Pedro", "Valencia");
        Estudiante estu3 = new Estudiante("1111", "Alfredo", "Valdez");
        
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        imprimirDatos(estu1);
        imprimirDatos(estu2);
        imprimirDatos(estu3);
    }
    public static void imprimirDatos(MostrarDatos datos){
     datos.imprimirDatos();
        Estudiante estu;
        Persona perso;
     //Casting
     if(datos instanceof Estudiante)
      estu = (Estudiante)datos;
     
     else 
         perso = (Persona)datos;
     
    }
}
