/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * esta parte pide lo sdatos y los igualos a los set de la clase
         */
        parte1 persona= new parte1(); 
        String cantidad1 = JOptionPane.showInputDialog("Indique la cantidad de facturas a digitar:");
        int u = Integer.parseInt(cantidad1);
        for (int i = 1; i < u; i++) {
            String id = JOptionPane.showInputDialog("Indique su id:");
            int h = Integer.parseInt(id);
            String nombre = JOptionPane.showInputDialog("Indique su nombre:");
            String monto = JOptionPane.showInputDialog("Indique el monto:");
            int d = Integer.parseInt(monto);
            String mes = JOptionPane.showInputDialog("Indique el mes:");
            String idFactura = JOptionPane.showInputDialog("Indique el id de la factura:");
            int p = Integer.parseInt(idFactura);
            String anio = JOptionPane.showInputDialog("Indique el anio:");
            int y = Integer.parseInt(anio);
            JOptionPane.showMessageDialog(null, "" + nombre + "");
            JOptionPane.showMessageDialog(null, "" + h + "");
            JOptionPane.showMessageDialog(null, "" + d + "");
            JOptionPane.showMessageDialog(null, "" + mes + "");
            JOptionPane.showMessageDialog(null, "" + p + "");
            JOptionPane.showMessageDialog(null,"" + y +"");
            persona.setAnio_de_la_factura(y);
            persona.setId(h);
            persona.setMes_de_la_factura(mes);
            persona.setNombre(nombre);
            persona.setNumero_de_factura(p);
            persona.setMonto_de_la_factura(d);
            
            
            if(p==persona.getNumero_de_factura()){
                JOptionPane.showMessageDialog(null, "su factura ya fue pagada");
            }
            else{
                JOptionPane.showMessageDialog(null, "su factura no esta pagada");
            }
            
        }
            
        
       /**
        * esta parte realiza el interes del 5%
        */

        String cantidad2 = JOptionPane.showInputDialog("Indique la cantidad de facturas a calcular:");
        int j = Integer.parseInt(cantidad2);
        double montoFinal = 0.0;
        for (int i = 1; i <= j; i++) {
            String factura1 = JOptionPane.showInputDialog("indiqueel monto de la factura a pagar " + i + ":");
            double factura2 = Double.parseDouble(factura1);

            double interes = factura2 * 0.05 / j;
            montoFinal += interes;

        }
        JOptionPane.showMessageDialog(null, " deberá pagar  el monto de ₡" + montoFinal + " con intereses del 0.05 ya agregados y de los anteriores" + cantidad2 + "meses");

    }
}
