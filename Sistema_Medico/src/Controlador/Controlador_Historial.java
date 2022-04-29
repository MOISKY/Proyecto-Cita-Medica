package Controlador;
import Conexion.Conexion_BaseDatos_Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_Historial{
    public static Conexion_BaseDatos_Paciente conexion = new Conexion_BaseDatos_Paciente();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String tituloDiagnostico,String descripcionDiagnostico,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO historial (tituloDiagnostico,descricionDiagnostico,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente) VALUES(?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, tituloDiagnostico);
            sentencia_Preparada.setString(2, descripcionDiagnostico);
            sentencia_Preparada.setString(3, nombrePaciente);
            sentencia_Preparada.setString(4, apellidoPaternoPaciente);
            sentencia_Preparada.setString(5, apellidoMaternoPaciente);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}