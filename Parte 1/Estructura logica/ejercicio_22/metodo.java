/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_22;


public class metodo {
    public static String salario(double valorxhora,double horastrabajadas, String nombre){
        
        double salarioMensual = horastrabajadas * valorxhora;

        if (salarioMensual > 450000) {
            String resultado = "El salario mensual de " + nombre + " es de: $" + salarioMensual;
            return resultado;
        } else {
            return nombre;
        }
    } 
}
