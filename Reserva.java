# Ejercicios.poo
package ejercicios.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    

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
    
