import java.util.ArrayList;
import java.util.List;
public class Paquete implements Tienda{
    private List<Tienda> hijos = new ArrayList<>();

    public void agregar(Tienda tienda) {
        hijos.add(tienda);
    }

    public void eliminar(Tienda tienda) {
        hijos.remove(tienda);
    }

    public void operacion() {
        for (Tienda tienda : hijos) {
            tienda.operacion();
        }
    }
}
