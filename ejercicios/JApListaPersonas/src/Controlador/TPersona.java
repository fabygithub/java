/*Implementa metodos CRUD de la clase Persona y 
  almacena datos en una lista dinamica*/
package Controlador;

import Modelo.Persona;
import java.util.*;

// clase lista de personas
public class TPersona {
    // crear una lista
    List<Persona> lista=new ArrayList<>();
    // constructor de la lista
    public TPersona() {  }
    
    // metodo agregar personas 
    public boolean agregarPersona(Persona persona)
    {   lista.add(persona);
        return true;
    }
    // modificar persona
    // cambiar de posicion
    public boolean modificarPersona(Persona persona, int pos)
    {  lista.set(pos, persona);
       return true;
    }
    
    // eliminar persona posicion
    public boolean eliminarPersona(int pos)
    {  lista.remove(pos);
       return true;
    } 
    
    // buscar persona con el rut
    public int buscarPersona(String rut)
    // si busca 0 siempre la va a encontrar        
    {   int pos=-1;//Ajustar fuera de la lista
    // recorre la lista
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRut().equals(rut)) {
                 pos=i;  
            } 
        }
        return pos;
    }
    public Persona editarPersona(int pos)
    {   Persona persona=new Persona();//Instanciacion Elegante
        persona.setRut(lista.get(pos).getRut());
        persona.setNombre(lista.get(pos).getNombre());
        persona.setApel(lista.get(pos).getApel());
        persona.setFono(lista.get(pos).getFono());
        persona.setCorreo(lista.get(pos).getCorreo());
        return persona;
    }

    public List<Persona> getLista() {
        return lista;
    }    
}
