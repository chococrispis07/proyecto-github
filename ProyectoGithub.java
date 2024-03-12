/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.github;
import java.math.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int cedula;
    System.out.println("escribe tu cedula");
    Scanner leercedula =new Scanner(System.in);
    cedula=leercedula.nextInt();
    
    double edad;
    System.out.println("escribe tu edad");
    Scanner leeredad =new Scanner(System.in);
    edad=leeredad.nextDouble();
    
    double a,b,c,d,e,f,g;
    a=8;
    b=2;
    c=9;
            
    e=b+a;
    f=c-a;
    g=a*b;
            
      
    double x=Math.max(7.5, 9);
    
    System.out.println("El maximo es= "+x);
       System.out.println("su cedula es= "+cedula);
          System.out.println("su edad es= "+edad);
          System.out.println("la suma es= "+e);
          System.out.println("la resta es= "+f);
          System.out.println("la multiplicacion es= "+g);
    
    }
    
}
