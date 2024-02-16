/*
 * la serializacion es el proceso mediante el cual el programa puede traducir 
 * a un archivo los objetos que se le marquen para su almacenamiento 
 * la serializacion  puede ocurrir ya sea por objetos o por tipos de datos
 *  la diferencia radica principalmente el  buffer mediante el cual se le envia 
 * o se extrae la informacion 
 */
public  abstract class Persona implements Serializable {
    String nombre;
    int Edad;
    public Persona(){

    }
    public Persona(String nombre, int Edad){
        this.Edad = Edad;
    }
   abstract String tipoPersona();
}
