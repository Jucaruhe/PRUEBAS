/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10;


public class metodo {
        public static double Matricula(double Patri,double Estrato) {
        double pagoMatricula = 50000; // Valor base de la matrícula

        if (Patri > 2000000 & Estrato > 3) {
            double incremento = Patri * 0.03;
            pagoMatricula += incremento;
            return pagoMatricula;
        } else {
            return pagoMatricula;
        }
    }
    
}
