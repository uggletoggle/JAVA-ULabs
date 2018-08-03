package domain;


public class Persona {

    private String nombre;
    private String apellido;
    private int id_persona;
    
    public int getId_persona(){
    
        return id_persona;
    
    }
    
    public String getNombre(){
    
        return nombre;
        
    }
    
    public String getApellido(){
    
        return apellido;
    
    }
    
    public void setId_persona(int id_persona){
    
        this.id_persona = id_persona;
    
    }
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    
    }
    
    public void setApellido(String apellido){
    
        this.apellido = apellido;
    
    }
    
    @Override
    public String toString(){
    
        return "{Persona: id=" + id_persona + " nombre=" + nombre + " apellido=" + apellido + '}';
        
    }
    
}
