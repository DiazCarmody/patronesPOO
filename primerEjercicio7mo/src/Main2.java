public class Main2 {
        public static void main(String[] args) {
            Paquete paquete1 = new Paquete();
            Paquete paquete2 = new Paquete();
            Golosina golosina1 = new Golosina("Chocolate");
            Golosina golosina2 = new Golosina("Chupetín");
            Golosina golosina3 = new Golosina("ALfajor");

            paquete1.agregar(golosina1);
            paquete1.agregar(golosina3);
            paquete2.agregar(golosina2);

            Paquete paquetePrincipal = new Paquete();
            paquetePrincipal.agregar(paquete1);
            paquetePrincipal.agregar(paquete2);

            paquetePrincipal.operacion();
        }
}
