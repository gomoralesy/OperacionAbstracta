public abstract class EquipoEmergencia {

    private String nombre;

    public EquipoEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void mostarNombre() {
        System.out.println("Equipo: " + nombre);
    }

    public abstract void atenderEmergencia();
}
