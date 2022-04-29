package Conexion;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
public class Conexion_BaseDatos_Usuario {
    private static Connection conexion;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/usuario";

    public Conexion_BaseDatos_Usuario(){
        conexion = null;
        try{
            Class.forName(driver);
            this.conexion =(Connection) DriverManager.getConnection(url,user,pass);
            if (conexion!= null) {
                System.out.println("Conexion establecida");
            }
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
   
    public void desconectar(){
        this.conexion = null;
    }

    public static Connection getConexion() {
        return conexion;
    }
}

