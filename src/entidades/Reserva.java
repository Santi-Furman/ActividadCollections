/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author santi
 */
public class Reserva {
    
    //Atributos
    private Long ID;
    private Habitacion habitacion;
    private ArrayList<Persona> personas = new ArrayList();
    
    //Constructores

    public Reserva(Long ID, Habitacion habitacion, ArrayList<Persona> personas) {
        this.ID = ID;
        this.habitacion = habitacion;
        this.personas = personas;
    }

    public Reserva() {
    }
    
    //Getters y Setters

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.ID);
        hash = 29 * hash + Objects.hashCode(this.habitacion);
        hash = 29 * hash + Objects.hashCode(this.personas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.habitacion, other.habitacion)) {
            return false;
        }
        if (!Objects.equals(this.personas, other.personas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" + "ID=" + ID + ", habitacion=" + habitacion + ", personas=" + personas + '}';
    }
    
    
    
}
