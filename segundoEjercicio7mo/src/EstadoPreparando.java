public class EstadoPreparando implements EstadoPedido{
    public void confirmar(){
        System.out.println("En espera de confirmación...");
    }
    public void preparar() {
        System.out.println("El pedido ha sido preparado.");
    }

    public void enviar() {
        System.out.println("Enviando el pedido...");
    }
    public void devolver() {
        System.out.println("Esperando el envío...");
    }
}
