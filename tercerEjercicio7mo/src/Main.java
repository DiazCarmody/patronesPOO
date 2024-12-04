import javax.naming.ldap.Control;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sensor sensor = new Sensor();
        // Crear usuarios
        ControlTemperatura usuario1 = new ControlTemperatura("Usuario 1");

        // Agregar usuarios al notificador
        sensor.agregarObservador(usuario1);
        //sensor.agregarObservador(usuario2);
        //medir temperaturas
        sensor.medirTemperatura(15);
        // Enviar notificaciones
            sensor.notificarObservadores(sensor.getTemperatura());
    }

}