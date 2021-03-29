/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicioum;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      double salarioMinimo,salario,total;
               
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o salario do funcionario: "); 
        salario = teclado.nextDouble();
        System.out.println("Digite o salario minimo: ");
        salarioMinimo = teclado.nextDouble();
        total = salario / salarioMinimo;
     
     System.out.printf("O seu salario minimo recebidos sao de: %.2f %n",+total); 
    
    
    
    
    
    
    
    
    }
    
}
