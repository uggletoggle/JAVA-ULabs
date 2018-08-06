package datos;

import java.sql.*;

public class Conexion {
    
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/sga?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    
    private static Driver driver = null;
    
    public static synchronized Connection getConnection()
            throws SQLException{
    
        if (driver == null){
        
            try {
            
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            
            }catch(Exception e){
            
                System.out.println("Fallo en la carga del driver JDBC");
                e.printStackTrace();
                
            }
        
        }
        
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
        
    }
    
    public static void close(ResultSet rs){
    
        try{
        
            if (rs != null){
            
                rs.close();
                
            }
        
        }catch(SQLException e){
        
            e.printStackTrace();
        
        }
    
    }
    
    public static void close(PreparedStatement ps){
    
       try{
       
           if (ps != null){
           
               ps.close();
               
           }
       
       }catch(SQLException e){
       
           e.printStackTrace();
       
       }
    
    }
    
    public static void close(Connection c){
    
        try{
        
            if (c != null){
            
                c.close();
            
            }
        
        }catch(SQLException e){
        
            e.printStackTrace();
        
        }
    
    }
    
}
