public class BrigadaTecnica extends equipoEmergencia {
    public BrigadaTecnica(String nombre) {
        super(nombre);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Examinando estructuras...");
    }
}
