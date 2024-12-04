public class EstadoEnviando implements EstadoPedido{

    public void confirmar(){
        System.out.println("En espera de confirmación...");
    }
    public void preparar() {
        System.out.println("En preparación.");
    }

    public void enviar() {
        System.out.println("Enviado.");
    }
    public void devolver() {
        System.out.println("Devuelto.");
    }
}
