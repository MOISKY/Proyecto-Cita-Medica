package Vista;
import Conexion.Conexion_BaseDatos_RecetaMedica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Ventana_13_VerRecetaMedica extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private Conexion_BaseDatos_RecetaMedica citasMedicas = new Conexion_BaseDatos_RecetaMedica();
    private Connection conexion = citasMedicas.getConexion();
    private JFrame ventana;
    private JFrame ventanaAnterior;
    public Ventana_13_VerRecetaMedica() {
        initComponents();
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
    
    public void cargar(){
        String[] informacionPedido = {"tituloDiagnostico","medicamentos","dia","mes","año","nombrePaciente","apellidoPaternoPaciente","apellidoMaternoPaciente"};
        String[] registros = new String[50];
        String sql ="SELECT *FROM receta";
        modelo = new DefaultTableModel(null,informacionPedido);
        Conexion_BaseDatos_RecetaMedica conexion = new Conexion_BaseDatos_RecetaMedica();
        Connection conexion1 = conexion.getConexion();
        try{
            Statement st = (Statement) conexion1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("tituloDiagnostico");
                registros[1] = rs.getString("medicamentos");
                registros[2] = rs.getString("diaFecha");
                registros[3] = rs.getString("mesFecha");
                registros[4] = rs.getString("añoFecha");
                registros[5] = rs.getString("nombrePaciente");
                registros[6] = rs.getString("apellidoPaternoPaciente");
                registros[7] = rs.getString("apellidoMaternoPaciente");
                modelo.addRow(registros);
            }
            tabla.setModel(modelo);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void limpiar(){
            int fila2 = tabla.getSelectedRow();
            if (fila2 >= 0) {
                modelo.removeRow(fila2);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 420));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 90, 420));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 630, 270));

        jLabel1.setText("RECETAS MEDICAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel5.setText("REGRESAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 30));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel4.setText("ACEPTAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 120, 30));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel2.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 120, 30));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel3.setText("MODIFICAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed

        int fila = tabla.getSelectedRow();
        try{
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "RECETA MEDICA NO SELECCIONADA");
            }
            else
            {
                modelo.removeRow(fila);
                PreparedStatement pst = conexion.prepareStatement("delete from receta where fecha="+tabla.getValueAt(1, 0));
                Conexion_BaseDatos_RecetaMedica citaMedica = new Conexion_BaseDatos_RecetaMedica();
                Connection conexion = citaMedica.getConexion();
                Statement st = conexion.createStatement();
                int numero = st.executeUpdate(pst.toString());
                if (numero >= 0) {
                    JOptionPane.showMessageDialog(null, "ELIMINADO");
                }
                JOptionPane.showMessageDialog(null, "ELIMINADO");
                limpiar();
            }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed

        try {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                PreparedStatement punto = conexion.prepareStatement("Update receta set tituloDiagnostico= '" +"medicamentos= '" +"dia= '" +"mes= '" +"año= '" +"nombrePaciente= '" +"apellidoPaternoPaciente= '" +"apellidoMaternoPaciente= '" +"'");
                punto.setString(1, tabla.getValueAt(i, 0).toString());
                punto.setString(2, tabla.getValueAt(i, 1).toString());
                punto.setString(3, tabla.getValueAt(i, 2).toString());
                punto.setString(4, tabla.getValueAt(i, 3).toString());
                punto.setString(5, tabla.getValueAt(i, 4).toString());
                punto.setString(6, tabla.getValueAt(i, 5).toString());
                punto.setString(7, tabla.getValueAt(i, 6).toString());
                punto.setString(8, tabla.getValueAt(i, 7).toString());
                punto.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jPanel7MousePressed
    public void eliminarRegistro(){
        try{
            int fila = tabla.getSelectedRow();
            String sql = "delete from receta where tituloDiagnostico=" + tabla.getValueAt(fila, 0);
            Statement st = conexion.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Titulo Diagnostico eliminado Satisfactoriamente");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar diagnostico"+e);
        }
    }
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
