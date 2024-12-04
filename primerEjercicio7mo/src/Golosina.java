public class Golosina implements Tienda {
    private String tipo;

    public Golosina(String tipo) {
        this.tipo = tipo;
    }

    public void operacion() {
        System.out.println(tipo);
    }
}
