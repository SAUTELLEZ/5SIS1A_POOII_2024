// vamos a crear una aplicacion para poder tener uma plantila 
    //private static 
    //private static finaly aunque haya encapsulamiento no va cambiar
    //constante es lo que no cambia ya esta establecido como pi 
public class Persona{
    private   int id;
    private String nombre;
    private int edad;

    public Persona(){

    }
    public Persona ( int id, String nombre , int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    public int getEdad(int edad){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
}