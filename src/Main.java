//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Modulo login = new Modulo();
    /*
    login.nombre = "Login";
    login.lenguaje = "Java";
    login.version = "1.0";
    login.terminado = true;

     */

    login.setNombre("Login");
        login.setLenguaje("Java");
        login.setVersion("1.0");
        login.setTerminado(true);



    Modulo inventario = new Modulo();
    /*
    inventario.nombre = "Inventario";
    inventario.lenguaje = "Python";
    inventario.version = "1.2";
    inventario.terminado = false;

     */

    inventario.setNombre("Inventario");
    inventario.setLenguaje("Python");
    inventario.setVersion("1.2");
    inventario.setTerminado(false);

    Modulo reportes = new Modulo();
    /*
    reportes.nombre = "Reportes";
    reportes.lenguaje = "Java";
    reportes.version = "0.9";
    reportes.terminado = false;

     */
    reportes.setNombre("Reportes");
    reportes.setLenguaje("Java");
    reportes.setVersion("0.9");
    reportes.setTerminado(false);

    /*
    login.mostrarInformacion();
    inventario.mostrarEstado();
    reportes.marcarTerminado();
    reportes.mostrarInformacion();
     */

    System.out.println(login.getNombre());
    System.out.println(login.getLenguaje());
    System.out.println(login.isTerminado());

    System.out.println(inventario.getNombre());
    System.out.println(inventario.getVersion());
    System.out.println(inventario.isTerminado());

}
