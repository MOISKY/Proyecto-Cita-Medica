package Controlador;
import Conexion.Conexion_BaseDatos_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Controlador_Usuario{
    public static Conexion_BaseDatos_Usuario conexion = new Conexion_BaseDatos_Usuario();
    public static PreparedStatement sentencia_Preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String correoElectronico,String nombre,String apellidoPaterno,String apellidoMaterno,String contraseña,String ocupacion,String especialidad){
        int resultado = 0;
        Connection cn = null;
        String sentenciaGuardar = "INSERT INTO usuario(correoElectronico,nombre,apellidoPaterno,apellidoMaterno,contraseña,ocupacion,especialidad) VALUES(?,?,?,?,?,?,?)";
        try{
            cn = conexion.getConexion();
            sentencia_Preparada = cn.prepareStatement(sentenciaGuardar);
            sentencia_Preparada.setString(1, correoElectronico);
            sentencia_Preparada.setString(2, nombre);
            sentencia_Preparada.setString(3, apellidoPaterno);
            sentencia_Preparada.setString(4, apellidoMaterno);
            sentencia_Preparada.setString(5, contraseña);
            sentencia_Preparada.setString(6, ocupacion);
            sentencia_Preparada.setString(7, especialidad);
            resultado = sentencia_Preparada.executeUpdate();
            sentencia_Preparada.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    public static String BuscarUsuarioRegistrado(String correo,String contraseña){
            String busqueda_usuario=null;
             Connection Conexion=null;
        try{
            Connection cn=conexion.getConexion(); 
            String sentencia_buscar_usuario=("SELECT correoElectronico,nombre,apellidoPaterno,apellidoMaterno,contraseña,ocupacion,especialidad FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña+ "'");
            PreparedStatement setencia_Preparada=cn.prepareStatement(sentencia_buscar_usuario);
            resultado=setencia_Preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario="Usuario encontrado";
            }else{
                busqueda_usuario="Usuario no encontrado";
            }
           
        }catch(Exception e){
                 System.out.println(e);
            }
        return busqueda_usuario;
    }
    
    public static String BuscarOcupacion(String correo,String contraseña){
            String ocupacion=null;
            Connection Conexion=null;
            try{
                Connection cn=conexion.getConexion();
               String sentencia_buscar = ("SELECT ocupacion FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña+ "'");
               sentencia_Preparada =cn.prepareStatement(sentencia_buscar);
               resultado= sentencia_Preparada.executeQuery();
               if(resultado.next()){
                   ocupacion=resultado.getString("ocupacion");
                   }
            }catch(Exception e){
                 System.out.println(e);
            }
            return ocupacion;
        }
    
    public static String BuscarEspecialidad(String correo,String contraseña){
        String especialidad = null;
        Connection Conexion = null;
        try {
            Connection cn = conexion.getConexion();
            String sentencia_buscar = ("SELECT especialidad FROM usuario WHERE correoElectronico = '" + correo + "' && contraseña = '" + contraseña + "'");
            sentencia_Preparada = cn.prepareStatement(sentencia_buscar);
            resultado = sentencia_Preparada.executeQuery();
            if (resultado.next()) {
                especialidad = resultado.getString("especialidad");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return especialidad;
    }
}