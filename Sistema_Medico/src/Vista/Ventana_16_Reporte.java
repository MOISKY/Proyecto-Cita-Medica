package Vista;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
public class Ventana_16_Reporte extends javax.swing.JFrame {
    private JFrame ventana;
    private JFrame ventanaAnterior;
    private String nombrePaciente;
    private String apellidoPaternoPaciente;
    private String apellidoMaternoPaciente;
    private String diagnosticoPaciente;
    private String tituloRecetaMedica;
    private String recetaMedica;
    private String dia;
    private String mes;
    private String año;
    private FileWriter archivo;
    private BufferedWriter buffer;
    public Ventana_16_Reporte() {

    }
    
    public void iniciar(){
        initComponents();
        this.nombreTxt.setText(nombrePaciente);
        this.apellidoPaternotxt.setText(apellidoPaternoPaciente);
        this.apellidoMaternotxt.setText(apellidoMaternoPaciente);
        this.diagnosticotxt.setText(diagnosticoPaciente);
        this.tituloDiagnosticotxt.setText(tituloRecetaMedica);
        this.recetatxt.setText(recetaMedica);
        this.diatxt.setText(dia);
        this.mestxt.setText(mes);
        this.añotxt.setText(año);
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

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getDiagnosticoPaciente() {
        return diagnosticoPaciente;
    }

    public void setDiagnosticoPaciente(String diagnosticoPaciente) {
        this.diagnosticoPaciente = diagnosticoPaciente;
    }

    public String getRecetaMedica() {
        return recetaMedica;
    }

    public void setRecetaMedica(String recetaMedica) {
        this.recetaMedica = recetaMedica;
    }

    public String getApellidoPaternoPaciente() {
        return apellidoPaternoPaciente;
    }

    public void setApellidoPaternoPaciente(String apellidoPaternoPaciente) {
        this.apellidoPaternoPaciente = apellidoPaternoPaciente;
    }

    public String getApellidoMaternoPaciente() {
        return apellidoMaternoPaciente;
    }

    public void setApellidoMaternoPaciente(String apellidoMaternoPaciente) {
        this.apellidoMaternoPaciente = apellidoMaternoPaciente;
    }

    public String getTituloRecetaMedica() {
        return tituloRecetaMedica;
    }

    public void setTituloRecetaMedica(String tituloRecetaMedica) {
        this.tituloRecetaMedica = tituloRecetaMedica;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosticotxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recetatxt = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apellidoPaternotxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        apellidoMaternotxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        tituloDiagnosticotxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        diatxt = new javax.swing.JTextField();
        mestxt = new javax.swing.JTextField();
        añotxt = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

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
            .addGap(0, 820, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 820));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 830));

        jLabel1.setText("Diagnostico Paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        diagnosticotxt.setBackground(new java.awt.Color(255, 255, 255));
        diagnosticotxt.setColumns(20);
        diagnosticotxt.setRows(5);
        diagnosticotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diagnosticotxt.setEnabled(false);
        jScrollPane1.setViewportView(diagnosticotxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, 160));

        jLabel2.setText("Reporte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 270, 10));

        jLabel3.setText("Receta Medica");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        recetatxt.setBackground(new java.awt.Color(255, 255, 255));
        recetatxt.setColumns(20);
        recetatxt.setRows(5);
        recetatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        recetatxt.setEnabled(false);
        jScrollPane2.setViewportView(recetatxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 270, 170));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 270, 10));

        nombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreTxt.setEnabled(false);
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 270, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 280, 20));

        jLabel4.setText("Nombre Paciente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel5.setText("GENERAR REPORTE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 150, 30));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel7.setText("REGRESAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 100, 30));

        jLabel6.setText("Apellido Paterno Paciente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        apellidoPaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoPaternotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellidoPaternotxt.setEnabled(false);
        jPanel1.add(apellidoPaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 270, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 280, 20));

        jLabel8.setText("Apellido Materno Paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        apellidoMaternotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidoMaternotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellidoMaternotxt.setEnabled(false);
        jPanel1.add(apellidoMaternotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 10));

        jLabel9.setText("Titulo Diagnostico");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        tituloDiagnosticotxt.setBackground(new java.awt.Color(255, 255, 255));
        tituloDiagnosticotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tituloDiagnosticotxt.setEnabled(false);
        jPanel1.add(tituloDiagnosticotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 300, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 310, 20));

        jLabel10.setText("Fecha de Receta Medica");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel11.setText("dia");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel12.setText("mes");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel13.setText("año");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        diatxt.setBackground(new java.awt.Color(255, 255, 255));
        diatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diatxt.setEnabled(false);
        jPanel1.add(diatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 60, -1));

        mestxt.setBackground(new java.awt.Color(255, 255, 255));
        mestxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mestxt.setEnabled(false);
        jPanel1.add(mestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 70, -1));

        añotxt.setBackground(new java.awt.Color(255, 255, 255));
        añotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        añotxt.setEnabled(false);
        jPanel1.add(añotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 70, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 250, 10));

        jLabel14.setText("Receta");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed

        JOptionPane.showMessageDialog(rootPane, "Generando Reporte");
        try {
            archivo = new FileWriter("Archivo.txt");
            buffer = new BufferedWriter(archivo);
            String texto = "Reporte\n"+"Nombre:"+nombrePaciente+"\nApellido Paterno:"+apellidoPaternoPaciente+"\nApellido Materno"+apellidoMaternoPaciente+"\nDiagnostico\n"+"Titulo Diagnostico: "+tituloRecetaMedica+"\nDescripcion Diagnostico: "+diagnosticoPaciente+"\nReceta\n"+"dia: "+dia+"mes: "+mes+"año: "+ año+"\nMedicamentos:"+recetaMedica;
            buffer.write(texto);
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(Ventana_16_Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMaternotxt;
    private javax.swing.JTextField apellidoPaternotxt;
    private javax.swing.JTextField añotxt;
    private javax.swing.JTextArea diagnosticotxt;
    private javax.swing.JTextField diatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField mestxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextArea recetatxt;
    private javax.swing.JTextField tituloDiagnosticotxt;
    // End of variables declaration//GEN-END:variables
}
