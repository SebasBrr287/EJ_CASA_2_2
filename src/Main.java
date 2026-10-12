//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Modulo login = new Modulo();
    login.nombre = "Login";
    login.lenguaje = "Java";
    login.version = "1.0";
    login.terminado = true;

    Modulo inventario = new Modulo();
    inventario.nombre = "Inventario";
    inventario.lenguaje = "Python";
    inventario.version = "1.2";
    inventario.terminado = false;

    Modulo reportes = new Modulo();
    reportes.nombre = "Reportes";
    reportes.lenguaje = "Java";
    reportes.version = "0.9";
    reportes.terminado = false;

    login.mostrarInformacion();
    inventario.mostrarEstado();
    reportes.marcarTerminado();
    reportes.mostrarInformacion();
}
