/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_41;

import java.util.ArrayList;
import java.util.List;


public class metodo {
    public static double mayor(String numeros){
        String[] todos = numeros.split(",");
        double mayor=-9999999;
        for (int i=1;i<todos.length;i++){
            double numero = Double.parseDouble(todos[i]);
            if(numero>mayor){
                mayor=numero;
            }
            
        }
        return mayor;
        
    }
    
}
