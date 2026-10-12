public class Modulo {
    // Atributos public
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre + " | Lenguaje: " + lenguaje + " | Versión: " + version + " | Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido marcado como terminado.");
    }

    // Métodos con acceso por defecto
    void mostrarEstado() {
        System.out.println("¿El módulo " + nombre + " está terminado? " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Versión del módulo " + nombre + ": " + version);
    }
}
