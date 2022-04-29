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
public class Ventana_18_ConsultarCitaMedicoEspecialista extends javax.swing.JFrame {
    private Conexion_BaseDatos_CitaMedica citaMedica = new Conexion_BaseDatos_CitaMedica();
    private Connection conexion = citaMedica.getConexion();
    private DefaultTableModel modelo;
    private JFrame ventana;
    private JFrame ventanaAnterior;
    private String especialidad;
    public Ventana_18_ConsultarCitaMedicoEspecialista(String especialidad) {
        initComponents();
        this.especialidad = especialidad;
        this.cargar();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        continuarPanel = new javax.swing.JPanel();
        continuarTexto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 770, 310));

        jLabel1.setText("Consultar Cita Medica");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

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

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel2.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, 30));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel3.setText("MODIFICAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

        this.eliminarRegistro();
        this.cargar();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed

        
    }//GEN-LAST:event_jPanel6MousePressed

    public void entrar(int fila){
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "CITA MEDICA NO SELECCIONADA");
        } else if (fila >= 0) {
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

    public void cargar(){
        String[] informacionPedido = {"dia","mes","año","especialidad","horaInicio","minutosInicio","horaFinal","minutosFinal","nombrePaciente","apellidoPaternoPaciente","apellidoMaternoPaciente"};
        String[] registros = new String[50];
        String sql ="SELECT dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente FROM citaMedica WHERE especialidad = '" + this.especialidad + "'";
        
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
    private javax.swing.JPanel continuarPanel;
    private javax.swing.JLabel continuarTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
