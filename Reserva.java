# Ejercicios.poo
public class Reserva {
    
    public void reservarAsiento() {
        objAsiento reservar = datoSala();
        for (Asiento datoAsiento : Asientos) {
            if (Asiento.isDisponible()) {
                Asiento.reservar();
                System.out.println("Asiento reservado.");
                return;
            }
        }
        System.out.println("No hay asientos disponibles.");
    }
}

}
    
