public class BrigadaMedica extends equipoEmergencia{
    public BrigadaMedica(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Atendiendo personas heridas...");
    }
}
