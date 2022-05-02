/*Administra modelo de datos a traves de menu de control */
package Vista;

// clase lista personas
import Controlador.TPersona;
// clase persona
import Modelo.Persona;
// importar arreglo
import java.util.ArrayList;
// importar lista
import java.util.List;
// importar entrada de datos
import java.util.Scanner;


// clase control personas
public class ControlPersonas {//psvm
    static TPersona tpersona=new TPersona();
    static Persona   persona=new Persona();
    static Scanner    lector=new Scanner(System.in);
    static int cont=0;
    
    public static void main(String[] args) {
        int op=0;
        do {
            System.out.println("MENU DE CONTROL");
            System.out.println("===============");
            System.out.println("1.-INGRESAR DATOS");
            System.out.println("2.-EDITAR DATOS");  
            System.out.println("3.-LISTAR DATOS");
            System.out.println("4.-SALIR DE DATOS");
            System.out.print("SELECCIONE OPCION :");op=lector.nextInt();
            switch(op)
            { case 1:ingresarDatos();break;
              case 2:editarDatos();break;
              case 3:listarDatos();break;
              case 4:System.out.println("Saliendo de Aplicacion...");break;
              default:System.out.println("Opciones 1/2/3/4...");
            }
        } while(op!=4);
          System.exit(0);//Sacar de RAM sistema
    }

    private static void ingresarDatos() {
        String rut, nombre, apel, fono, correo;
        boolean ing=false;
        System.out.print("RUT      :");rut=lector.next();
        System.out.print("NOMBRE   :");nombre=lector.next();
        System.out.print("APELLIDO :");apel=lector.next();
        System.out.print("TELEFONO :");fono=lector.next();
        System.out.print("CORREO   :");correo=lector.next();
        persona=new Persona(rut,nombre,apel,fono,correo);
        ing=tpersona.agregarPersona(persona);
        if (ing) { System.out.println("Registro ingresado a la lista..."); }
        else System.out.println("Registro abortado en el ingreso...");        
    }
    private static void editarDatos() {
    }
    private static void listarDatos() {
        List<Persona> lista=new ArrayList<>();
        lista=tpersona.getLista();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
    
    


    
}
