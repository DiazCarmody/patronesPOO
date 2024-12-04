import java.util.*;
public class Configuracion {
    String con1;
    String op1;
    String con2;
    String op2;
    String con3;
    String op3;
    private static Configuracion instancia;
    private Configuracion() {}
    // Método estático para obtener la instancia única
    public static Configuracion obtenerInstancia() {
        // Verificar si la instancia aún no ha sido creada
        if (instancia == null) {
            // Crear una nueva instancia
            instancia = new Configuracion();
        }
        // Devolver la instancia única
        return instancia;
    }
    //creo el hashmap
    private Map<String, String> config = new HashMap<>();
    public void insertar(String con1, String op1, String con2, String op2, String con3, String op3){
        config.put(con1, op1);
        config.put(con2, op2);
        config.put(con3, op3);
    }
    public void mostrar(){
        System.out.println(config);
    }
    // Método de ejemplo
    public void saludarBienvenida() {
        System.out.println("¡Hola!");
    }
    public void saludarDespedida(){
        System.out.println("¡Adiós!");
    }
}
