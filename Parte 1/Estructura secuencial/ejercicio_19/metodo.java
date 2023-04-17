/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_19;

public class metodo {
    public static double Perimetro(double lado){
        double Peri;
        Peri = 3*lado;
        return Peri;
    }  
    public static double Area(double lado){
        double Area = Math.sqrt(3)*Math.pow(lado,2)/4;
        return Area;
    }
    public static double Altura(double lado){
        double Altura=Math.sqrt(3)*lado/2;
        return Altura;
    }
}