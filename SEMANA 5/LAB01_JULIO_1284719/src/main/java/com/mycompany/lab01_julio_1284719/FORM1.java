/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab01_julio_1284719;
import java.io.*;
import javax.swing.DefaultListModel; //manejar de mejora manera la listas
import javax.swing.JFileChooser; //ir a buscar la ruta absoluta de un archivo
import javax.swing.JOptionPane; //
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JULIORUIZ
 */
public class FORM1 extends javax.swing.JFrame {
    public FORM1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_nombre = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista_Apellido = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Button_Rutaarchivo = new javax.swing.JButton();
        Button_Grabar = new javax.swing.JButton();
        Button_Obtener = new javax.swing.JButton();
        Button_Salir = new javax.swing.JButton();
        Jtext_ruta = new javax.swing.JTextField();
        Jtext_nombreyapellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jScrollPane1.setViewportView(Lista_nombre);

        jScrollPane2.setViewportView(Lista_Apellido);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("INGRESE LOS DATOS DE ACONTINUACION:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDOS:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NOMBRES:");

        Button_Rutaarchivo.setText("RUTA ARCHIVO");
        Button_Rutaarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RutaarchivoActionPerformed(evt);
            }
        });

        Button_Grabar.setText("GRABAR");
        Button_Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_GrabarActionPerformed(evt);
            }
        });

        Button_Obtener.setText("OBTENER");
        Button_Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ObtenerActionPerformed(evt);
            }
        });

        Button_Salir.setBackground(new java.awt.Color(255, 0, 51));
        Button_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Button_Salir.setText("SALIR");
        Button_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(Button_Obtener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(Jtext_ruta)
                            .addComponent(Jtext_nombreyapellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_Rutaarchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_Grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtext_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Rutaarchivo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtext_nombreyapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Grabar))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Button_Obtener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Button_Salir)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_RutaarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RutaarchivoActionPerformed
        // TODO add your handling code here:
        //ACA ES EL BOTON DE LA RUTA ARCHIVO
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
        File ficheroImagen;
        String rutaArchivo;
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();     
            Jtext_ruta.setText(rutaArchivo);
        }

    }//GEN-LAST:event_Button_RutaarchivoActionPerformed

    private void Button_GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_GrabarActionPerformed
        // TODO add your handling code here:
        //ACA ES EL BOTON DE GRABAR LOS REGISTROS
        if(!"".equals(Jtext_ruta.getText()))
        {
            String strError="";
            if(LlenarArchivo(Jtext_ruta.getText(), Jtext_nombreyapellido.getText(), strError))
            {
                JOptionPane.showMessageDialog(null, "Se ingreso correctamente el registro: " + Jtext_nombreyapellido.getText(), "Guardar", WIDTH);
                Jtext_nombreyapellido.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Se produjo el siguiente error al guardar: " +strError,"Error", WIDTH);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo para guardar los registros ","ERROR!", WIDTH);
        }
    }//GEN-LAST:event_Button_GrabarActionPerformed

    private void Button_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ObtenerActionPerformed
        // TODO add your handling code here:
        //ACA ES EL BOTON DE OBTENER LOS REGISTROS
         if(!"".equals(Jtext_ruta.getText()))
        {
            String strError="";
            if(!Obtener(Jtext_ruta.getText(), strError))
            {
                JOptionPane.showMessageDialog(null, "Se prodrujo un error al cagar los registros: " +strError,"ERROR!", WIDTH);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo para obtener los registros ","ERROR!", WIDTH);
        }
        
    }//GEN-LAST:event_Button_ObtenerActionPerformed

    public boolean Obtener(String strPath,String strError)
    {
        File Archivo = new File(strPath);
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea="";
                try {
                    Linea=LeerArchivo.readLine();
                    String[] split;
                    DefaultListModel modeloNombre= new DefaultListModel(); 
                    DefaultListModel modeloApellido= new DefaultListModel(); 
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split=Linea.split(",");
                            modeloNombre.addElement(split[0]);
                            modeloApellido.addElement(split[1]);
                        }
                        Linea=LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();
                    
                    Lista_nombre.setModel(modeloNombre);
                    Lista_Apellido.setModel(modeloApellido);
                    strError="";
                    return true;
                    
                } catch (IOException ex) {
                    strError= ex.getMessage();
                    return false;
                }
            } catch (FileNotFoundException ex) {
                strError= ex.getMessage();
                return false;
            }            
        }
        else
        {
            strError="No existe el archivo";
            return false;
        }
    }
    
    public boolean LlenarArchivo(String strPath,String strContenido,String strError)
    {
        File Archivo = new File(strPath);
        
        try
        {
                FileWriter Escribir = new FileWriter(Archivo,true);
                BufferedWriter bw = new BufferedWriter(Escribir);
                bw.write(strContenido+ System.getProperty( "line.separator" ));
                bw.close();
                Escribir.close();
                
                return true;
        }
        catch(IOException ex)
        {
            strError= ex.getMessage();
            return false;
        } 
        
    }
    
    private void Button_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SalirActionPerformed
        // TODO add your handling code here:
        //ACA ES EL BOTON DE SALIR DE MI APLICACION
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (iRespuesta == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_Button_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FORM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Grabar;
    private javax.swing.JButton Button_Obtener;
    private javax.swing.JButton Button_Rutaarchivo;
    private javax.swing.JButton Button_Salir;
    private javax.swing.JTextField Jtext_nombreyapellido;
    private javax.swing.JTextField Jtext_ruta;
    private javax.swing.JList<String> Lista_Apellido;
    private javax.swing.JList<String> Lista_nombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
