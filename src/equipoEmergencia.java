public abstract class equipoEmergencia {

    private String nombre;

    public equipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostarNombre() {
        System.out.println("Nombre equipo: " + nombre);
    }

    public abstract void atenderEmergencia();
}
