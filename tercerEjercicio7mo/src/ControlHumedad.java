public class ControlHumedad implements Observador {
    private String nombre;
    public ControlHumedad(String nombre) {
        this.nombre = nombre;
    }
    public void actualizar(int temperatura) {
        if(temperatura>25){
            System.out.println("HACE CALOR" + ": la temperatura -> " + temperatura);
        } else if (temperatura<10) {
            System.out.println("HACE FRÍO" + ": la temperatura -> " + temperatura);
        }else{
            System.out.println("TEMPLADO" + ": la temperatura -> " + temperatura);
        }
    }
}
