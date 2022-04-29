package Vista;
import java.lang.Character;
import Controlador.Controlador_Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ventana_02_Registrar_Usuario extends javax.swing.JFrame {
    private Character caracter;
    private Controlador_Usuario usuarios = new Controlador_Usuario();
    private Ventana_02_Registrar_Usuario ventana;
    private Ventana_01_Inicio ventanaAnterior;
    private Ventana_03_Iniciar_Sesion iniciar;
    private boolean bandera = false;
    public Ventana_02_Registrar_Usuario() {
        initComponents();
        this.textoEspecialidad.setVisible(false);
        this.especialidad.setVisible(false);
    }
    

    public Ventana_02_Registrar_Usuario getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_02_Registrar_Usuario ventana) {
        this.ventana = ventana;
    }
    
    public Ventana_01_Inicio getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(Ventana_01_Inicio ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public JFrame getIniciar() {
        return iniciar;
    }

    public void setIniciar(Ventana_03_Iniciar_Sesion iniciar) {
        this.iniciar = iniciar;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        ocupacion = new javax.swing.JComboBox<>();
        especialidad = new javax.swing.JComboBox<>();
        textoEspecialidad = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setBorder(null);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, -1));

        jLabel2.setText("Apellido Paterno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        apellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaterno.setBorder(null);
        jPanel1.add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, -1));

        jLabel3.setText("REGISTRARSE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        apellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaterno.setBorder(null);
        jPanel1.add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, -1));

        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setText("Ocupacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 460));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel11.setText("LIMPIAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel9.setText("REGRESAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, 30));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel8.setText("GUARDAR DATOS");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 170));

        jLabel12.setText("Correo Electronico");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        correoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        correoElectronico.setBorder(null);
        jPanel1.add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 10));

        ocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "asistente", "especialista" }));
        ocupacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ocupacionItemStateChanged(evt);
            }
        });
        jPanel1.add(ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, -1));

        especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dentista", "neurolgo" }));
        jPanel1.add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, -1));

        textoEspecialidad.setText("Especialidad");
        jPanel1.add(textoEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setText("jPasswordField1");
        contraseña.setBorder(null);
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        iniciar.limpiar();
        this.guardar();
    }//GEN-LAST:event_jPanel5MousePressed

    public void guardar(){
        if ("".equals(correoElectronico.getText())== false)
        if (noEsAlphanumerico(nombre.getText()) == false)
            if(noEsAlphanumerico(apellidoPaterno.getText()) == false)  
                if (noEsAlphanumerico(apellidoMaterno.getText())== false)
                    if("".equals(contraseña.getText())== false) 
                        if(ocupacion.getSelectedItem().toString() != null ){
                            if (this.bandera == true) {
                                this.usuarios.guardar(correoElectronico.getText(), nombre.getText(), apellidoPaterno.getText(), apellidoMaterno.getText(), contraseña.getText(), ocupacion.getSelectedItem().toString(), especialidad.getSelectedItem().toString());
                                JOptionPane.showMessageDialog(rootPane, "Se a completado su Registro con exito");
                                this.abrirPantalla();
                            }
                            else
                                if (this.bandera == false) {
                                    if (especialidad.getSelectedItem().toString() != null) {
                                        this.usuarios.guardar(correoElectronico.getText(), nombre.getText(), apellidoPaterno.getText(), apellidoMaterno.getText(), contraseña.getText(), ocupacion.getSelectedItem().toString(),"");
                                        JOptionPane.showMessageDialog(rootPane, "Se a completado su Registro con exito");
                                        this.abrirPantalla();
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "Escoja una especialidad");
                                    }
                                }
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Escoja una ocupacion");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Escriba una contraseña");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Escriba una apellido Materno");
                    }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Escriba un apellido Paterno");
                }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Escriba un nombre");
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "Escriba un correo Electronico");
        }
    }
    
    public void abrirPantalla(){
        iniciar.setVentana(iniciar);
        iniciar.setVentanaAnterior(this.ventana);
        iniciar.setVisible(true);
        this.dispose();
    }
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        this.ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MousePressed
    public boolean noEsAlphanumerico(String texto){
        boolean bandera = false;
        for (int i = 0; i < texto.length(); i++) {
            if (!caracter.isLetterOrDigit(texto.charAt(i))) {
                bandera = true;
                break;
            }
        }
        if (bandera == true ) {
            return true;
        }
        else
        {
            return false;
        }
    }
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        this.correoElectronico.setText("");
        this.nombre.setText("");
        this.apellidoPaterno.setText("");
        this.apellidoMaterno.setText("");
        this.contraseña.setText("");
        this.ocupacion.setSelectedIndex(0);
        this.especialidad.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel3MousePressed

    private void ocupacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ocupacionItemStateChanged

        if ("especialista".equals(this.ocupacion.getSelectedItem().toString())) {

            this.textoEspecialidad.setVisible(true);
            this.especialidad.setVisible(true);
            this.bandera = true;
        }
        else
            if ("asistente".equals(this.ocupacion.getSelectedItem().toString())) {
                this.textoEspecialidad.setVisible(false);
                this.especialidad.setVisible(false);
                this.bandera = false;
        }
    }//GEN-LAST:event_ocupacionItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMaterno;
    private javax.swing.JTextField apellidoPaterno;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JComboBox<String> especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> ocupacion;
    private javax.swing.JLabel textoEspecialidad;
    // End of variables declaration//GEN-END:variables
}
