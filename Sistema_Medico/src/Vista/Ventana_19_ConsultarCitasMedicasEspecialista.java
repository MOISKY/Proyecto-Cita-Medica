package Vista;
import Conexion.Conexion_BaseDatos_Diagnostico;
import Conexion.Conexion_BaseDatos_CitaMedica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Ventana_19_ConsultarCitasMedicasEspecialista extends javax.swing.JFrame {
    private Conexion_BaseDatos_CitaMedica citaMedica = new Conexion_BaseDatos_CitaMedica();
    private Connection conexion = citaMedica.getConexion();
    private DefaultTableModel modelo;
    private JFrame ventana;
    private JFrame ventanaAnterior;
    private String especialidad;
    public Ventana_19_ConsultarCitasMedicasEspecialista(String especialidad) {
        initComponents();
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        continuarPanel = new javax.swing.JPanel();
        continuarTexto = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 460));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 70, 460));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 770, 260));

        jLabel1.setText("Consultar Cita Medica");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setText("Buscar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        busqueda.setBackground(new java.awt.Color(255, 255, 255));
        busqueda.setBorder(null);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        jPanel2.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, 20));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel3.setText("BUSCAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 30));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel4.setText("REGRESAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 120, 30));

        continuarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                continuarPanelMousePressed(evt);
            }
        });

        continuarTexto.setText("CONTINUAR");

        javax.swing.GroupLayout continuarPanelLayout = new javax.swing.GroupLayout(continuarPanel);
        continuarPanel.setLayout(continuarPanelLayout);
        continuarPanelLayout.setHorizontalGroup(
            continuarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continuarPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(continuarTexto)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        continuarPanelLayout.setVerticalGroup(
            continuarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(continuarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(continuarTexto)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(continuarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 110, 30));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre", "apellidoPaterno", "apellidoMaterno" }));
        jPanel2.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 120, -1));

        jLabel5.setText("tipo de Busqueda");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        botonEliminar.setEnabled(false);
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEliminarMousePressed(evt);
            }
        });

        jLabel6.setText("ELIMINAR");

        javax.swing.GroupLayout botonEliminarLayout = new javax.swing.GroupLayout(botonEliminar);
        botonEliminar.setLayout(botonEliminarLayout);
        botonEliminarLayout.setHorizontalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEliminarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );
        botonEliminarLayout.setVerticalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEliminarLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 30));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel7.setText("MODIFICAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    private void continuarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarPanelMousePressed
        int fila = tabla.getSelectedRow();
        System.out.println(fila);
        entrar(fila);
    }//GEN-LAST:event_continuarPanelMousePressed

    public void entrar(int fila){
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "CITA MEDICA NO SELECCIONADA");
        } else if (fila == 0) {
            Ventana_10_DiagnosticoPaciente diagnosticoPaciente = new Ventana_10_DiagnosticoPaciente();
            diagnosticoPaciente.setVentana(diagnosticoPaciente);
            diagnosticoPaciente.setVentanaAnterior(this.ventana);
            diagnosticoPaciente.setVisible(true);
            diagnosticoPaciente.setNombrePaciente(modelo.getValueAt(fila,8).toString());
            diagnosticoPaciente.setApellidoPaternoPaciente(modelo.getValueAt(fila,9).toString());
            diagnosticoPaciente.setApellidoMaternoPaciente(modelo.getValueAt(fila,10).toString());
            this.dispose();
        }
    }
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        if (!"".equals(busqueda.getText())) {
            if ("nombre".equals(tipo.getSelectedItem().toString())) {
                this.cargar2("nombrePaciente", busqueda.getText());
                this.botonEliminar.setEnabled(true);
            } else if ("apellidoPaterno".equals(tipo.getSelectedItem().toString())) {
                this.cargar2("apellidoPaternoPaciente", busqueda.getText());
                this.botonEliminar.setEnabled(true);
            } else if ("apellidoMaterno".equals(tipo.getSelectedItem().toString())) {
                this.cargar2("apellidoMaternoPaciente", busqueda.getText());
                this.botonEliminar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un tipo de busqueda");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ingrese palabra a buscar");
        }
    }//GEN-LAST:event_jPanel4MousePressed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void botonEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMousePressed
        this.eliminarRegistro();      
    }//GEN-LAST:event_botonEliminarMousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed

        
    }//GEN-LAST:event_jPanel7MousePressed


    public void cargar2(String texto,String buscar){
        String[] informacionPedido = {"dia","mes","año","especialidad","horaInicio","minutosInicio","horaFinal","minutosFinal","nombrePaciente","apellidoPaternoPaciente","apellidoMaternoPaciente"};
        String[] registros = new String[50];
        String sql ="SELECT dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente FROM citaMedica WHERE "+texto+" = '" + buscar + "' && especialidad = '" + this.especialidad+ "'";
        
        modelo = new DefaultTableModel(null,informacionPedido);
        Conexion_BaseDatos_CitaMedica conexion = new Conexion_BaseDatos_CitaMedica();
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("dia");
                registros[1] = rs.getString("mes");
                registros[2] = rs.getString("año");
                registros[3] = rs.getString("especialidad");
                registros[4] = rs.getString("horaInicio");
                registros[5] = rs.getString("minutosInicio");
                registros[6] = rs.getString("horaFinal");
                registros[7] = rs.getString("minutosFinal");
                registros[8] = rs.getString("nombrePaciente");
                registros[9] = rs.getString("apellidoPaternoPaciente");
                registros[10] = rs.getString("apellidoMaternoPaciente");
                modelo.addRow(registros);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    public void eliminarRegistro(){
        try{
            int fila = tabla.getSelectedRow();
            String sql = "delete from citaMedica where dia=" + tabla.getValueAt(fila, 0);
            Statement st = conexion.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Cita Medica eliminada Satisfactoriamente");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar cita medica"+e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JPanel continuarPanel;
    private javax.swing.JLabel continuarTexto;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
