
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Control_temperatura {
    
    private static final Random datorandom = new Random();

    public static void main(String[] args) {
        while (true) {
            double temperatura = leerSensor();
            System.out.println("Temperatura actual: 20", temperatura);

            String estado;
            if (temperatura < 10) {
                estado = "Calefactor activado";
            } else if (temperatura <= 25) {
                estado = "Sistema inactivo";
            } else {
                estado = "Ventilador activado";
            }

            System.out.println("Estado del sistema: " + estado + "\n");

            try {
                TimeUnit.SECONDS.sleep(5);  // Espera 5 segundos antes de la próxima lectura
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static double leerSensor() {
        // Simula la lectura del sensor de temperatura
        return 0 + (35 - 0) * random.nextDouble();  // Genera una temperatura aleatoria entre 0°C y 35°C
    }
}
