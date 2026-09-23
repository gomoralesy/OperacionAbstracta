public class Main {
    public static void main(String[] args) {

        BrigadaMedica brigadaUno = new BrigadaMedica("Brigada Uno");
        BrigadaTecnica brigadaDos = new BrigadaTecnica("Brigada Dos");
        DronRescate dronUno = new DronRescate("Dron Uno");

        brigadaUno.mostarNombre();
        brigadaUno.atenderEmergencia();

        brigadaDos.mostarNombre();
        brigadaDos.atenderEmergencia();

        dronUno.mostarNombre();
        dronUno.atenderEmergencia();
    }
}
