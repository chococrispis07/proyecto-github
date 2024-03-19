/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tienda.vagancia;

import java.math.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoTiendaVagancia {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      
        double cantarroz,cantleche,canthuevos,cantazucar,
                cantaceite,cantpanela,arrozprecio,lecheprecio,huevosprecio,azucarprecio,
                aceiteprecio,panelaprecio,Totalpagar,x,totalpagardescuento,totalcondescuento;
   int  numeroganador;
        
                arrozprecio=3000;
        lecheprecio=2000;
        huevosprecio=15000;
        azucarprecio=4000;
        aceiteprecio=5000;
        panelaprecio=8000;
        
        double arroz;
        System.out.println("ingrese la cantidad de arroz");
        Scanner leerarroz=new Scanner(System.in);
        arroz=leerarroz.nextDouble();
    
        
        cantarroz=arrozprecio*arroz;
        
        
       double leche;
        System.out.println("ingrese la cantidad de leche");
        Scanner leerleche=new Scanner(System.in);
        leche=leerleche.nextDouble();
         
        cantleche=lecheprecio*leche;
   
        double huevos;
        System.out.println("ingrese la cantidad de huevos");
        Scanner leerhuevos=new Scanner(System.in);
        huevos=leerhuevos.nextDouble();
        
        canthuevos=huevosprecio*huevos;
        
        double azucar;
        System.out.println("ingrese la cantidad de azucar");
        Scanner leerazucar=new Scanner(System.in);
        azucar=leerazucar.nextDouble();
        
        cantazucar=azucarprecio*azucar;
        
        double aceite;
        System.out.println("ingrese la cantidad de aceite");
        Scanner leeraceite=new Scanner(System.in);
        aceite=leeraceite.nextDouble();
        
        cantaceite=aceiteprecio*aceite;
        
        double panela;
        System.out.println("ingrese la cantidad de huevos");
        Scanner leerpanela=new Scanner(System.in);
        panela=leerpanela.nextDouble();
        
        cantpanela=panelaprecio*panela;
        
     
       
        Totalpagar=cantarroz+cantleche+canthuevos+cantazucar+cantaceite+ cantpanela;
        
        
        System.out.println("la cantidad de arroz es="+cantarroz);
        System.out.println("la cantidad de leche es="+cantleche);
        System.out.println("la cantidad de huevos es="+canthuevos);
        System.out.println("la cantidad de azucar es="+cantazucar);
        System.out.println("la cantidad de aceite es="+cantaceite);
        System.out.println("la cantidad de panela es="+cantpanela);
        System.out.println("el tota es ="+Totalpagar);
        
        
 if(Totalpagar>50000){
      
    System.out.println("participas en una rifa");
    numeroganador=7;
 
            x=(int)(Math.random()*100+1);
    System.out.println("su numero es"+x);
    if(numeroganador==x){
     
     System.out.println("se gano el carro 0km con el numero0"+x);
 }
 else{
        System.out.println("no gano la rifa");
        
            }

 }
 
    else{
        System.out.println("no participas en la riffa");
    }
      
    
 if (Totalpagar>100000){
     
     totalpagardescuento=Totalpagar*0.30;
     totalcondescuento=totalpagardescuento-Totalpagar;
     
     System.out.println("el descuento fue de="+totalpagardescuento);
 System.out.println("el total fue="+totalcondescuento);
 }
 else{
     System.out.println("no obtienes descuneto");
 }
}  
    
}
