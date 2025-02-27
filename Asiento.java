public class Asiento {
    private boolean disponible;
    
    public Asiento() {
        System.out.println("ingrese el numero de Asientos a reservar: ");
        this.disponible = true;
    }
    
    public boolean isDisponible() {
        Asiento objAsiento = new Asiento;
        return disponible;
    }
    
    public void reservar() {
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
