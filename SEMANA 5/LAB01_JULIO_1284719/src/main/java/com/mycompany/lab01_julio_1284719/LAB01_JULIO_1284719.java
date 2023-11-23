/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab01_julio_1284719;
import javax.swing.*;

/**
 *
 * @author JULIORUIZ
 */
public class LAB01_JULIO_1284719 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                FORM1 menu = new FORM1(); //CREO UNA INSTACIA DE FORM1 para que sea visible 
                menu.setVisible(true);
            }
        });
    }
}
