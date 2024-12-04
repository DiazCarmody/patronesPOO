import java.util.ArrayList;
import java.util.List;

public class Departamentos implements Empresa{
    private List<Empresa> hijos = new ArrayList<>();

    public void agregar(Empresa empresa) {
        hijos.add(empresa);
    }

    public void eliminar(Empresa empresa) {
        hijos.remove(empresa);
    }

    public void operacion() {
        for (Empresa empresa : hijos) {
            empresa.operacion();
        }
    }
}
