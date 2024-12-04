import java.util.ArrayList;
import java.util.List;
public class Cliente {
    public static void main(String[] args) {
        Compuesto compuesto1 = new Compuesto();
        Compuesto compuesto2 = new Compuesto();
        Hoja hoja1 = new Hoja("Hoja 1");
        Hoja hoja2 = new Hoja("Hoja 2");
        Hoja hoja3 = new Hoja("Hoja 3");

        compuesto1.agregar(hoja1);
        compuesto1.agregar(hoja2);
        compuesto2.agregar(hoja3);

        Compuesto compuestoPrincipal = new Compuesto();
        compuestoPrincipal.agregar(compuesto1);
        compuestoPrincipal.agregar(compuesto2);

        compuestoPrincipal.operacion();
    }
}
