
public class Persona {
    
    private String nombre;
    private int edad;
    
    
    /** constuctor por defecto **/
    public Persona(){
        this.nombre = "Jaimito";
        this.edad = 12;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean esMayorDeEdad(){
        return this.edad > 18;
    }
    
    public boolean sonLaMismaPersona(Persona p){
        /** hace algo ** /
    }
} 
