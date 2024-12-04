//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Departamentos subDepartamento1 = new Departamentos();
            Departamentos subDepartamento2 = new Departamentos();
            Empleados empleado1 = new Empleados("Damián");
            Empleados empleado2 = new Empleados("Claudio");
            Empleados empleado3 = new Empleados("Carlitos");

            subDepartamento1.agregar(empleado1);
            subDepartamento1.agregar(empleado2);
            subDepartamento2.agregar(empleado3);

            Departamentos departamentoPrincipal = new Departamentos();
            departamentoPrincipal.agregar(subDepartamento1);
            departamentoPrincipal.agregar(subDepartamento2);

            departamentoPrincipal.operacion();
        }

}