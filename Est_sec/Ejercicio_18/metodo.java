/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_18;


public class metodo {
    public static double salarioB(double horasTrabajadas,double valorxHora){
        double salarioB;
        salarioB = horasTrabajadas * valorxHora;
        return salarioB;
    }  
    public static double salarioN(double salarioB,double retencion){
        double salarioN = salarioB * (1 - retencion / 100);
        return salarioN;
    }
    
    
}
