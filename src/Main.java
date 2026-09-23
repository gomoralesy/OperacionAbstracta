public class Main {
    public static void main(String[] args) {

        BrigadaMedica brigadaUno = new BrigadaMedica("Brigada Uno");
        BrigadaTecnica brigadaDos = new BrigadaTecnica("Brigada Dos");
        DronRescate dronUno = new DronRescate("Dron Uno");

        brigadaUno.mostarNombre("Brigada Uno");
        brigadaUno.atenderEmergencia();

        brigadaDos.mostarNombre("Brigada Dos");
        brigadaDos.atenderEmergencia();

        dronUno.mostarNombre("Dron Uno");
        dronUno.atenderEmergencia();
    }
}
