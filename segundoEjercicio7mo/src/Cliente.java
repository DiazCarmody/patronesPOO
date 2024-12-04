public class Cliente {
    public static void main(String[] args){
        Pedido pedido = new Pedido();

        pedido.setEstado(new EstadoConfirmando());
        pedido.confirmar();


        pedido.preparar();


        pedido.setEstado(new EstadoEnviando());
        pedido.enviar();

        pedido.devolver();
    }
}
