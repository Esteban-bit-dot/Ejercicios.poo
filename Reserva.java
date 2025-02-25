# Ejercicios.poo
package ejercicios.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    
    public class principal {

    public static void main(String[] args) {
         Scanner Tomardatos = new Scanner(System.in);
         Sala datosala = new Sala(10); // Creando una sala con 10 asientos
        Usuario datoUsuario = new Usuario("");
        
        while (Sala.hayAsientosDisponibles()) {
            System.out.println("¿Desea reservar un asiento? (s/n)");
            String respuesta = Tomardatos.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                datoUsuario.reservarAsiento(Sala);
            } else {
                break;
            }
        }
        System.out.println("No hay más asientos disponibles o ha decidido no reservar más asientos.");
        Tomardatos.close();
      }
    }

    
   
public class Sala {
    private ArrayList<Asiento> Asientos;
    
    public Sala(int capacidad) {
        Asientos = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++) {
            Asientos.add(new Asiento());
        }
    }
    
    public boolean hayAsientosDisponibles() {
        for (Asiento datoasiento : Asientos) {
            if (datoasiento.isDisponible()) {
                return true;
            }
        }
        return false;
    }
    
    public void reservarAsiento() {
        for (Asiento asiento : Asientos) {
            if (asiento.isDisponible()) {
                asiento.reservar();
                System.out.println("Asiento reservado.");
                return;
            }
        }
        System.out.println("No hay asientos disponibles.");
    }
}
public class Asiento {
    private boolean disponible;
    
    public Asiento() {
        this.disponible = true;
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public void reservar() {
        this.disponible = false;
    }
 }
}
    
