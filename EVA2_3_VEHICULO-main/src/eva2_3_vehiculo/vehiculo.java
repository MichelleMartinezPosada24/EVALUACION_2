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
public class vehiculo {
        private String modelo;
        private String marca;
        private int año;
        private String color;
        
        public vehiculo(){
        modelo = "sin nombre";
        marca = "sin apellidos";
        año = 0;
        color = " sin nombre";
    }

    public vehiculo(String modelo, String marca, int año, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void ImprimirDatos(){
        System.out.println("El modelo es " + modelo);
        System.out.println("La marca es " + marca);
        System.out.println("el año es " + año);
        System.out.println("el color es " + color);
    }
}
