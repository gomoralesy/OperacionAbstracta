public class DronRescate extends equipoEmergencia {
    public DronRescate(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Revisando perímetro...");
    }
}
