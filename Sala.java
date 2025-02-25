import java.util.ArrayList;
public class Sala {
    private ArrayList<Asiento> Asientos;
    
    public Sala(int capacidad) {
        Asientos = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++) {
            Asientos.add(new Asiento());
        }
    }
    
