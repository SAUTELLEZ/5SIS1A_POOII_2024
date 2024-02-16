import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
 
    ArrayList<Persona> listapersonas = new ArrayList<>();
    String rep = "si";
    String nombre = "";
    int edad, num_empleado,bol;


// ahora aplicamos polimorfismo 
Persona alumno = new Alumno();
//trabajador Persona trabajador  = new trabajador ();

//menu
void menu(){
    while (true){
        while (rep.equalsIgnoreCase("SI")){
            try{
                String var =
                JOptionPane.showInputDialog("INGRESA LA OPCION DESEADA: \n " 
                + " 1. registrar al al alumno \n" 
                +" 2. Consultar Alumno \n" 
                + "3.Salir");
                if ( var == null){
                    System.exit(0);

                }
                int opcion = Integer.parseInt(var);

                switch (opcion) {
                    case 1:
                        //METODO PARA PEDIR DATOS 
                        pedirDatosAlumno();
                        alumno =  new Alumno(bol,nombre ,edad);
                        guardarAlumno();

                        break;
                
                    default:
                    System.out.println("opcion no valida");
                        break;
                }
                rep= JOptionPane.showInputDialog("Decea repetir?")


            }catch(Exception e){
                System.out.println("Error: "+ e.getMessage());
                

            }
        }
    }
}
private void pedirDatosAlumno(){
    bol= Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA BOLETA "));
    nombre = JOptionPane.showInputDialog("INGRESA e; nombre ");
    edad= Integer.parseInt(JOptionPane.showInputDialog("INGRESA LA edad "));


}
private void guardarAlumno(){
    listapersonas.add(alumno);
}
//metodo para leer un archivo 
private void leerAlumnos() throws EOFException{
    //definir donde esta el archivo que esta guaradando la informacion 
    FileInputStream archivo = new FileInputStream("archivo.dat");
//generara la lectura de los ojetos 
ObjectInputStream entrada = new ObjectInputStream(archivo);

//tenemos que transformar los objetos porque por efecto su lectura en vytes por lo tanto deb castear 
//a un objeto 
listapersonas = (ArrayList)entrada.readObject();

for ( int i = 0; i<listapersonas.size(); i++){
    //recorro lo que necesito del obj
    Alumno obj = (Alumno)listapersonas.get(i);
    //obtener la informacio  
    JOptionPane.showMessageDialog(null, "/n"
    + "Numero de Alumno" + (i+1)+ "/n"
    + " Boleta" + obj.getBoleta()+ "/n"
    +" nombre del Alumno" + obj.getNombre()
    +"/n"
    + "Edad del Alumno" + obj.getEdad()
    +"/n"
    + " Tipo de persona"+ obj.tipoPersona()+ "/n");
}
private void guardar() throw Exception{
    // debo generar el archivo de salia 
    FileOutputStream archivo = new FileOutputStream("archivo.dat");
    //definimos que es un beffer de objetos
    ObjectInputStream salida = new ObjectInputStream(archivo);
    //empiezo a escribir 
    salida.writeObject(listapersonas);
    salida.close();
}
}
}

//metodos :
//registrar, buscar , guardar 
//imprimir 