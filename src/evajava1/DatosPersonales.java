/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//Paquete para usar ventana - Paso 1 
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Octubre 31 del 2017
 * Programa: Corrección Prueba1
 * Responsabilidad: Calcular el area de un rectangulo
 */
public class DatosPersonales 
{
    public static void main(String[] args)
    {
        //paso 2
        String Nombre;
        int Edad;
        int incremento;
        
        //paso 3
        //El showInput recibe datos de entrada por ventana
        Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
        incremento=Edad+20;
        
        JOptionPane.showMessageDialog(null, "Bienvenido "+Nombre+" en 20 años su edad sera "+incremento+" años");
        
    }
}
