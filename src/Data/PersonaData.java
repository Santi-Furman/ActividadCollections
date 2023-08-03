/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import entidades.Persona;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author santi
 */
public class PersonaData {
    public static List<Persona> lista = Arrays.asList(
        new Persona("Diana",25,1,"México"),
        new Persona("Ale",25,2,"México"),
        new Persona("Santi",25,3,"México"),
        new Persona("Jordan",25,4,"México"),
        new Persona("Jorge",25,5,"México"),
        new Persona("Agus",25,6,"México")
        
    );
}
