/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minticcl2;
import javax.swing.JOptionPane; 
import java.lang.Math;

/**
 *
 * @author Alejandra Rivera
 */
public class MinticCl2 { 

    public static void main(String[] args) {
                
        menuprincipal();
        
        
        
        
        
        
        
    }
public static void menuprincipal(){
    String option = "";
    option = JOptionPane.showInputDialog(null, "Seleccione una opción: \n" 
                                                + "1. Realizar una operación \n"
                                                + "2. Salir", "Menú principal", JOptionPane.QUESTION_MESSAGE);
    try {
            int optionSelected = Integer.parseInt(option);
            if (optionSelected==1){
            menuOperaciones();
            } 
    } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor ingresado no es numérico por favor escribir 1 o 2");
                menuprincipal();
    }
}

public static void menuOperaciones(){
    String operations = "";
            operations = JOptionPane.showInputDialog(null, "Seleccione una operación: \n" 
                                                + "1. Suma \n"
                                                + "2. Resta \n"
                                                + "3. Multiplicación \n"
                                                + "4. División \n"
                                                + "5. Potencia \n"
                                                + "6. Raíz cuadrada \n"
                                                + "7. Salir", "Menú operaciones", JOptionPane.QUESTION_MESSAGE);
            
        try{    
            int election = Integer.parseInt(operations);
            if(election==6){
                raizCuadrada();
                menuOperaciones();
            }            
            else if(election<6){
                String num_1 = "";
                String num_2 = "";
                num_1 = JOptionPane.showInputDialog(null, "Ingrese el primer número: " 
                                                , "Ingresar números", JOptionPane.QUESTION_MESSAGE);
                   
                num_2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: " 
                                                , "Ingresar números", JOptionPane.QUESTION_MESSAGE);
                    
                double number1 = Double.parseDouble(num_1);
                double number2 = Double.parseDouble(num_2);
                    
                    
                        if(operations.equals("1")){
                            suma(number1, number2);
                            menuOperaciones();
                        }
                
                        else if (operations.equals("2")){
                            resta(number1, number2);
                            menuOperaciones();
                        }
                        
                        else if (operations.equals("3")){
                            multiplicacion(number1, number2);
                            menuOperaciones();
                    
                        }
                        else if (operations.equals("4")){
                            
                            division(number1,number2);
                            menuOperaciones();     
                          
                            
                        }
                        else if (operations.equals("5")){
                            potencia(number1, number2);
                            menuOperaciones();        
                        }
      
            }
            else if (election>7){
                   JOptionPane.showMessageDialog(null, "Opción no valida. Intente de nuevo." );
                   menuOperaciones();
            }
        }  catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor ingresado no es numérico por favor ingrese un número válido");
                 menuOperaciones();
        }
}
public static void raizCuadrada(){
    String num_1 = "";
    num_1 = JOptionPane.showInputDialog(null, "Ingrese el número: " 
                                                , "Ingresar números", JOptionPane.QUESTION_MESSAGE);
    double number1 = Double.parseDouble(num_1); 
    double raiz = Math.sqrt(number1);
    JOptionPane.showMessageDialog(null, "La raíz cuadrada del número ingresado es : " 
                                                + String.format("%.2f",raiz)
                                                );
}
public static void suma(double number1, double number2){
    double suma = number1 + number2;
                            JOptionPane.showMessageDialog(null, "El resultado de la suma es : " 
                                                + String.format("%.2f",suma)
                                                );
                           
}
public static void resta(double number1, double number2){
    double resta = number1 - number2;
                            JOptionPane.showMessageDialog(null, "El resultado de la resta es : " 
                                                + String.format("%.2f",resta)
                                                );
                           
}
public static void multiplicacion(double number1, double number2){
    double multiplicacion = number1 * number2;
                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es : " 
                                                + String.format("%.2f",multiplicacion)
                                                );
}
public static void division(double number1, double number2){
    String num3;
    
    if (number2 != 0) {
        double division1 = number1/number2;
        JOptionPane.showMessageDialog(null, "El resultado de la división es : " 
                                                + String.format("%.2f",division1)
                                                ); 
    }
    else {
        JOptionPane.showMessageDialog(null, "No es posible dividir por cero" 
                                               
                                                );
        
    } 
       
   
}   

public static void potencia(double number1, double number2){
    double potencia = Math.pow(number1,number2);
                            JOptionPane.showMessageDialog(null, "El resultado es : " 
                                                + String.format("%.2f",potencia)
                                                );
}

}
    
        
    




