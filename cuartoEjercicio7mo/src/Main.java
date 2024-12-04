//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Configuracion singleton1 = Configuracion.obtenerInstancia();
        Configuracion singleton2 = Configuracion.obtenerInstancia();

        // Verificar si son la misma instancia
        if (singleton1 == singleton2) {
            System.out.println("Ambos objetos son la misma instancia de Singleton.");
        } else {
            System.out.println("Error: Se han creado múltiples instancias de Singleton.");
        }
    singleton1.insertar("CPU","I9 9900K","GPU","Nvidia 2080Ti","RAM","32 GB");
    singleton2.mostrar();
    }
}