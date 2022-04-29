package Controlador;
import Conexion.Conexion_BaseDatos_CitaMedica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_CitaMedica{
    public static Conexion_BaseDatos_CitaMedica conexion = new Conexion_BaseDatos_CitaMedica();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String dia,String mes,String año,String especialidad,String horaInicio,String minutosInicio,String horaFinal,String minutosFinal,String nombrePaciente,String apellidoPaternoPaciente,String apellidoMaternoPaciente){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO citaMedica (dia,mes,año,especialidad,horaInicio,minutosInicio,horaFinal,minutosFinal,nombrePaciente,apellidoPaternoPaciente,apellidoMaternoPaciente) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, dia);
            sentencia_Preparada.setString(2, mes);
            sentencia_Preparada.setString(3, año);
            sentencia_Preparada.setString(4, especialidad);
            sentencia_Preparada.setString(5, horaInicio);
            sentencia_Preparada.setString(6, minutosInicio);
            sentencia_Preparada.setString(7, horaFinal);
            sentencia_Preparada.setString(8, minutosFinal);
            sentencia_Preparada.setString(9, nombrePaciente);
            sentencia_Preparada.setString(10, apellidoPaternoPaciente);
            sentencia_Preparada.setString(11, apellidoMaternoPaciente);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
}
