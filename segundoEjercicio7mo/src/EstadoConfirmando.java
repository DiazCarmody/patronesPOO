public class EstadoConfirmando implements EstadoPedido{
    public void confirmar(){
        System.out.println("El pedido ha sido confirmado.");
    }
    public void preparar() {
        System.out.println("En preparación...");
    }

    public void enviar() {
        System.out.println("Enviando el pedido...");
    }
    public void devolver() {
        System.out.println("Esperando el envío...");
    }
}
