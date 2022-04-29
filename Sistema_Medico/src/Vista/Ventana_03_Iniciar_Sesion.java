package Vista;
import Controlador.Controlador_Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ventana_03_Iniciar_Sesion extends javax.swing.JFrame {
    private Controlador_Usuario usuarios = new Controlador_Usuario();
    private Ventana_03_Iniciar_Sesion ventana;
    private JFrame ventanaAnterior;
    private Ventana_01_Inicio inicio;
    private Ventana_02_Registrar_Usuario registrar;
    public Ventana_03_Iniciar_Sesion() {
        initComponents();
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_03_Iniciar_Sesion ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }
    
    public void setVentanaAnterior(Ventana_01_Inicio ventanaAnterior){
        this.inicio = ventanaAnterior;
        this.ventanaAnterior = ventanaAnterior;
    }
    public void setVentanaAnterior(Ventana_02_Registrar_Usuario ventanaAnterior) {
        this.registrar = ventanaAnterior;
        this.ventanaAnterior = ventanaAnterior;
    }
    public void setVentanaAnterior(JFrame ventanaAnterior){
        this.ventanaAnterior = ventanaAnterior;
    }

    public Ventana_01_Inicio getInicio() {
        return inicio;
    }

    public Ventana_02_Registrar_Usuario getRegistrar() {
        return registrar;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 390));

        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel2.setText("Corrreo Electronico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        correoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        correoElectronico.setBorder(null);
        jPanel1.add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, -1));

        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 160, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 160, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 170));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel5.setText("INGRESAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 30));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel7.setText("REGRESAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 130, 30));

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel6.setText("LIMPIAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 130, 30));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setText("jPasswordField1");
        contraseña.setBorder(null);
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

        this.limpiar();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        this.iniciarSesion();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MousePressed

    public void iniciarSesion(){
       String busqueda_usuario = usuarios.BuscarUsuarioRegistrado(correoElectronico.getText(), contraseña.getText());
            if (!"".equals(correoElectronico.getText()))
                if (!"".equals(contraseña.getText())) {
                    if ("".equals(correoElectronico.getText()) == true && "".equals(contraseña.getText()) == true) {
                        JOptionPane.showMessageDialog(this, " los campos estan vacios, favor de llenarlos para continuar");
                    } 
                    else {
                        if (busqueda_usuario.equals("Usuario encontrado") == true) {
                            if ("especialista".equals(usuarios.BuscarOcupacion(correoElectronico.getText(), contraseña.getText()))) {
                                JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como especialista(Administrador)");
                                String valor = usuarios.BuscarEspecialidad(correoElectronico.getText(), contraseña.getText());
                                Ventana_15_Menu_Especialista menu1 = new Ventana_15_Menu_Especialista(valor);
                                menu1.setVentana(menu1);
                                menu1.setVentanaAnterior(this.ventana);
                                menu1.setVisible(true);
                                this.dispose();
                            }
                            else 
                                if ("asistente".equals(usuarios.BuscarOcupacion(correoElectronico.getText(), contraseña.getText()))) {
                                    JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como asistente");
                                    Ventana_04_Menu_Asistente menu = new Ventana_04_Menu_Asistente();
                                    menu.setVentana(menu);
                                    menu.setVentanaAnterior(this.ventana);
                                    menu.setVisible(true);
                                    this.dispose();
                            } 
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(this, " Usuario no registrado, favor de darse de alta");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese la contraseña");
                }
            else {
                JOptionPane.showMessageDialog(rootPane, "Ingrese el correoElectronico");
            }
    }
    public void limpiar(){
        this.correoElectronico.setText("");
        this.contraseña.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
