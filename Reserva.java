# Ejercicios.poo
package ejercicios.poo;
public String bienvenido (){
    System.out.println("***BIENVENIDO***");
}
public class Reserva {
    
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

}
    
