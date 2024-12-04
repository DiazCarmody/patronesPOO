public class ReproductorMusica{
    private EstadoReproductor estadoActual;

    public ReproductorMusica() {
        estadoActual = new EstadoDetenido();
    }

    public void setEstado(EstadoReproductor estado) {
        estadoActual = estado;
    }

    public void reproducir() {
        estadoActual.reproducir();
    }

    public void pausar() {
        estadoActual.pausar();
    }

    public void detener() {
        estadoActual.detener();
    }
}
