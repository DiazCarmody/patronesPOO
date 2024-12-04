public class Singleton {
    private static Singleton instancia;
    private Singleton() {}
    // Método estático para obtener la instancia única
    public static Singleton obtenerInstancia() {
        // Verificar si la instancia aún no ha sido creada
        if (instancia == null) {
            // Crear una nueva instancia
            instancia = new Singleton();
        }
        // Devolver la instancia única
        return instancia;
    }
    //Creo el hashmap


    // Método de ejemplo
    public void saludar() {
        System.out.println("¡Hola! Soy una instancia única de Singleton.");
    }

}
