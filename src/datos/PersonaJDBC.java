package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaJDBC {
 
    private final String SQL_INSERT = "INSERT INTO persona (nombre, apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT * FROM persona ORDER BY id_persona";
    
    public int insert(String nombre, String apellido){
    
        Connection conn = null;
        PreparedStatement pps = null;
        int rows = 0;
        
        try{
        
            conn = Conexion.getConnection();
            pps = conn.prepareStatement(SQL_INSERT);
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            System.out.println("Ejecutando Query: " + SQL_INSERT);
            rows = pps.executeUpdate();
            System.out.println("Registros afectados: " + rows);
            
        }catch(SQLException e){
        
            e.printStackTrace();
        
        } finally{
            
            Conexion.close(pps);
            Conexion.close(conn);
                        
        }
        
        return rows;
        
    }
    
    public int update (int id_persona, String nombre, String apellido){
    
        Connection conn = null;
        PreparedStatement pps = null;
        ResultSet rs = null;
        int rows = 0;
        
        try{
        
            conn = Conexion.getConnection();
            pps = conn.prepareStatement(SQL_UPDATE);
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            pps.setInt(3, id_persona);
            rows = pps.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
            
        }catch(SQLException e){
        
            e.printStackTrace();
        
        }finally{
        
            Conexion.close(pps);
            Conexion.close(conn);
            
        }
        
        return rows;
        
    }
    
}
