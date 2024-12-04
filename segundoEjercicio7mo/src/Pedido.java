public class Pedido {
    private EstadoPedido estadoActual;

    public Pedido() {
        estadoActual = new EstadoEnviando();
    }

    public void setEstado(EstadoPedido estado) {
        estadoActual = estado;
    }

    public void confirmar() {
        estadoActual.confirmar();
    }

    public void preparar() {
        estadoActual.preparar();
    }

    public void enviar() {
        estadoActual.enviar();
    }
    public void devolver(){
        estadoActual.devolver();
    }
}
