/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leovi
 */
import javax.swing.*;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones miObjeto = new Operaciones();
        int opcion = 0;
        double n1 = 0, n2 = 0;
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("**MENU ***\n"
                    + "Seleccione una opción"
                    + "\n1- ingresar datos"
                    + "\n2 - sumar"
                    + "\n3 - restar"));
            
            switch(opcion)
            {
                case 1:  n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                         n2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2"));
                        break;
                case 2: JOptionPane.showMessageDialog(null, miObjeto.sumar(n1, n2));
                        break;
            }
                    
            
        }while(opcion != 6);
        
    }
    
}
