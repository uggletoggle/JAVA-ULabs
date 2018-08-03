package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaJDBC {
 
    private final String SQL_INSERT = "INSERT INTO persona (nombre, apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT * FROM persona ORDER BY id_persona";
    
    
}
