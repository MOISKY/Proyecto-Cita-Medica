package Vista;
import Controlador.Controlador_Paciente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ventana_05_Registrar_Paciente extends javax.swing.JFrame {
    private Controlador_Paciente pacientes = new Controlador_Paciente();
    private JFrame ventana;
    private JFrame ventanaAnterior;
    public Ventana_05_Registrar_Paciente() {
        initComponents();
    }
    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JFrame getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(JFrame ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 450));

        jLabel1.setText("REGISTRAR PACIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setBorder(null);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, -1));

        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        apellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaterno.setBorder(null);
        jPanel1.add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, -1));

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        apellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaterno.setBorder(null);
        apellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoMaternoActionPerformed(evt);
            }
        });
        jPanel1.add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, -1));

        jLabel5.setText("Edad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setBorder(null);
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        jLabel6.setText("Sexo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel7.setText("Estatura");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        estatura.setBackground(new java.awt.Color(255, 255, 255));
        estatura.setBorder(null);
        jPanel1.add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 110, -1));

        jLabel8.setText("Curp");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        curp.setBackground(new java.awt.Color(255, 255, 255));
        curp.setBorder(null);
        jPanel1.add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, -1));

        jLabel9.setText("Dni");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setBorder(null);
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 150, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 150, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 130, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 150, 10));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 150, 10));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 150, 10));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel13.setText("REGRESAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, 30));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel12.setText("LIMPIAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 120, 30));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel11.setText("GUARDAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 120, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen1.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 190, 190));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hombre", "mujer", "indefinido" }));
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

        if (!"".equals(nombre.getText()))
            if (!"".equals(apellidoPaterno.getText()))
                if (!"".equals(apellidoMaterno.getText()))
                    if (!"".equals(edad.getText()))
                        if (sexo.getSelectedItem().toString() != null)
                            if (!"".equals(estatura.getText()))
                                if (!"".equals(curp.getText()))
                                    if (!"".equals(dni.getText())) {
                                        pacientes.guardar(nombre.getText(), apellidoPaterno.getText(), apellidoMaterno.getText(), edad.getText(), sexo.getSelectedItem().toString(), estatura.getText(), curp.getText(), dni.getText());
                                        Ventana_06_Registrar_CitaMedica registrarCitaMedica = new Ventana_06_Registrar_CitaMedica(nombre.getText(),apellidoPaterno.getText(),apellidoMaterno.getText());
                                        registrarCitaMedica.setVentana(registrarCitaMedica);
                                        registrarCitaMedica.setVentanaAnterior(this.ventana);
                                        registrarCitaMedica.setVisible(true);
                                        this.dispose();
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "Escriba el dni");
                                    }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "Escriba el curp");
                                }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "Escriba el estatura");
                            }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Selecciona el sexo");
                        }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Escriba la edad");
                    }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Escriba apellido Materno");
                }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Escriba apellido Paterno");
            }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Escriba Nombre");
        }
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        this.dispose();
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_jPanel3MousePressed

    private void apellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMaternoActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        this.nombre.setText("");
        this.apellidoPaterno.setText("");
        this.apellidoMaterno.setText("");
        this.edad.setText("");
        this.sexo.setSelectedIndex(0);
        this.estatura.setText("");
        this.curp.setText("");
        this.dni.setText("");
    }//GEN-LAST:event_jPanel4MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMaterno;
    private javax.swing.JTextField apellidoPaterno;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField estatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> sexo;
    // End of variables declaration//GEN-END:variables
}
