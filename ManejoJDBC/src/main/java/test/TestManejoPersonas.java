package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        Persona personaNueva = new Persona("Pedro", "Verdasco", "dauhdwad@gmail.com", "3742634234");
//        personaDao.insertar(personaNueva);
//
//        Persona personaModificar = new Persona(5, "Juan Carlos", "Esparza", "jshjbdhawd@gmail.com.", "817532656174");
//        personaDao.actualizar(personaModificar);
        
        Persona personaEliminar = new Persona(5);
        personaDao.eliminar(personaEliminar);

        List<Persona> personas = personaDao.seleccionar();

        personas.forEach((persona) -> {
            System.out.println("persona = " + persona);
        });

    }
}
