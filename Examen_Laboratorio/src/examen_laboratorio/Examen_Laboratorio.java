/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_laboratorio;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Examen_Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
       
        int opcion = 0;
        
        
        
        while(opcion != 5){
            System.out.println("--MENU--");
            System.out.println("(1)Piramide");
            System.out.println("(2)Mayor");
            System.out.println("(3)Venta Television");
            System.out.println("(4)Caracteres Vocales");
            System.out.println("(5)Salir");
        
        
            System.out.print("=");
            opcion = lea.nextInt();
            
            if(opcion == 1){
                System.out.println("--Piramide--");
                System.out.print("Ingrese la cantidad de fila en la piramide: ");
                int fila =lea.nextInt();
                int filas = 1;
                
                
                for (int i = 1; i <= fila; i++) {
                     int suma = 0;
                     int num = filas;
                     
                    for (int j = 0; j < i; j++) {
                        
                        System.out.print(num + " ");
                        suma += num;
                        num += 2;
                        
                    }
                    
                    filas = num;
                    
                    System.out.println("= "+ suma);
                }
                
             
            }
            
            if(opcion == 2){
                System.out.println("--El mayor--");
                int mayor = 0;
                int suma = 0;
                int contador = 0;
                
                while(true){
                    System.out.println("Ingrese un numero entero: ");
                    int num = lea.nextInt();
                    
                    if(contador == 0){
                        mayor = num;  
                    }else if(num > mayor){
                        mayor = num;
                    }     
                    
                    suma += num;
                    contador++;
                    
                    System.out.println("Quieres ingresar otro numero? (si/no)");
                    String in = lea.next().toLowerCase();
                    
                    if(in.equals("no")){  
                        break;
                        }
                    
                    }   
                
                    
                    double promedio = suma/contador;
                    System.out.println("El numero mayor ingresado fue: " + mayor);
                    System.out.println("El promedio de numero ingresados es: " + promedio);
                    
                    
            } 
            
            if(opcion == 3){
                
                int HD = 0, normal = 0, subtotal = 0;
                    String salida = "SI";
                    System.out.println("Ingrese el nombre de cliente: ");
                    String nombre = lea.next();
                    boolean estadocliente = true;
                    while(estadocliente){
                        System.out.println("Tipo de canal:"
                                + " HD o Normal");
                        String canal =lea.next().toUpperCase();
                        if(canal.equals("HD")){
                            HD++;
                            subtotal+= 30;
                        }else if(canal.equals("NORMAL")){
                            normal++;
                            subtotal+= 20;
                        }else{
                            System.out.println("Canal no valido");
                            
                        }
                        
                        System.out.println("Desea ingresar otro canal(SI/NO):");
                        salida = lea.next().toUpperCase();
                        
                        if(salida.equals("NO")){
                            estadocliente = false;
                            
                        }
                        
                    }
                    System.out.println("Cajas digitales: ");
                        System.out.println("LIGHTBOX");
                        System.out.println("HDBOX");
                        System.out.println("DVRBOX");
                        System.out.println("Seleccione una opcion: ");
                        String caja = lea.next().toUpperCase();
                        
                        if(caja.equals("LIGHTBOX")){
                            subtotal += 50;
                            
                        }else if(caja.endsWith("HDBOX")){
                            subtotal += 100;
                        }else if(caja.equals("DVRBOX")){
                            subtotal += 150;
                        }
                    
                    System.out.println("----FACTURA----");
                    if(HD>0){
                        System.out.println("Canales HD:"+ HD);
                    }
                    if(normal>0){
                        System.out.println("Canales normales: "+ normal);
                    }
                    double impuesto = subtotal*0.15 + subtotal;
                    System.out.println("Subtotal: "+ subtotal);
                    System.out.println("Total a pagar (15% impuesto): " + String.format("%.2f", impuesto));
                    
                
            }
        }  
    }
}
