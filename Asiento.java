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
 public boolean hayAsientosDisponibles() {
        for (Asiento datoasiento : Asientos) {
            if (datoasiento.isDisponible()) {
                return true;
            }
        }
        return false;
    }
