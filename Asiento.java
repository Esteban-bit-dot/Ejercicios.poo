public class Asiento {
    private boolean disponible;
    
    public Asiento() {
        System.out.println("ingrese el numero de Asientos a reservar: ");
        Asiento objAsiento = new Asiento;
        this.disponible = true;
    }
    
    public boolean isDisponible() {
        isDisponible objisDisponible = new isDisponible;
        return disponible;
    }
    
    public void reservar() {
        reservar objreservar = new reservar;
        this.disponible = false;
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
