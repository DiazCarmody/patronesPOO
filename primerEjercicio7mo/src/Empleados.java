public class Empleados implements Empresa{
    private String nombre;

    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    public void operacion() {
        System.out.println("Hola, mi nombre es " + nombre + "" + " y soy un empleado, anasheiii");
    }
}
