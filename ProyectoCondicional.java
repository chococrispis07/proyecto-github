/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.condicional;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ProyectoCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a,b,c;
    System.out.println("ingresar el dato A");
    Scanner leerdatoa =new Scanner(System.in);
    a=leerdatoa.nextDouble();
    
     System.out.println("ingresar el dato b");
    Scanner leerdatob =new Scanner(System.in);
    b=leerdatob.nextDouble();
   
    if(b>0){
        c=a/b;
    System.out.println("el resultado de la divicion es"+c);
    }
    else{
        System.out.println("no se puede realizar la divicion");
    }
    
    }
    
}
