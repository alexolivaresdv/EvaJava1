/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Octubre 31 del 2017
 * Programa: Ejercicio 2
 * Responsabilidad: Calcular el sueldo neto de un empleado 
 */
public class Nomina 
{
   public static void main(String[] args)
   {
       int sueldo;
       int horas;
       int valorhora;
       
       horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas Trabajadas"));
       valorhora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor hora"));
       sueldo=horas*valorhora;
       
       JOptionPane.showMessageDialog(null, "Su sueldo neto es "+(sueldo)+" pesos");
   } 
}
