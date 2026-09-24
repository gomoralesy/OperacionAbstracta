public abstract class equipoEmergencia {

    private String nombre;

    public equipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostarNombre() {
        System.out.println("Equipo: " + nombre);
    }

    public abstract void atenderEmergencia();
}
