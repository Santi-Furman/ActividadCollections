
package service;

import Data.HabitacionData;
import entidades.Habitacion;
import entidades.Reserva;
import java.util.ArrayList;


public class HotelService {
    
    public ArrayList<Reserva> reservas = new ArrayList<>();    
    
    
    
    public void mostrarHabitaciones(){
        for (Habitacion habitacion : HabitacionData.lista) {
            System.out.println(habitacion);
        }
    }
    
    public void mostrarReservas(){
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
   
    
    
    
}
