import java.util.*;
public class Sensor {
    int temperatura;
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void medirTemperatura(int temperatura){
        this.temperatura=temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void notificarObservadores(int temperatura) {
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }
}
