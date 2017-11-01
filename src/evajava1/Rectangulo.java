/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import java.util.Scanner;//paso 1
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Octubre 31 del 2017
 * Programa: Corrección Prueba1
 * Responsabilidad: Calcular el area de un rectangulo
 */
public class Rectangulo 
{
   public static void main(String[] args)
   {
        float area, base, altura;//paso2
        Scanner sc = new Scanner(System.in);//paso 3
        
        //paso 4
        System.out.println("Ingrese la base del rectangulo");
        base = sc.nextFloat();// Leo y guardo los datos de entrada 
        System.out.println("Ingrese la altura del rectangulo");
        altura = sc.nextFloat();// Leo y guardo los datos de entrada 
        
        //paso 5
        area=base*altura;
        System.out.println("El area de su rectangulo es "+area+"mts2");
        
   } 
}
