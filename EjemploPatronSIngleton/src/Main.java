//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de Singleton
        Singleton singleton1 = Singleton.obtenerInstancia();
        Singleton singleton2 = Singleton.obtenerInstancia();

        // Verificar si son la misma instancia
        if (singleton1 == singleton2) {
            System.out.println("Ambos objetos son la misma instancia de Singleton.");
        } else {
            System.out.println("Error: Se han creado múltiples instancias de Singleton.");
        }

        // Usar el objeto singleton
        singleton1.saludar();
    }
}