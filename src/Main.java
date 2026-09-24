public class Main {
    public static void main(String[] args) {

        equipoEmergencia brigadaUno = new BrigadaMedica("Brigada Uno");
        equipoEmergencia brigadaDos = new BrigadaTecnica("Brigada Dos");
        equipoEmergencia dronUno = new DronRescate("Dron Uno");

        brigadaUno.mostarNombre();
        brigadaUno.atenderEmergencia();

        brigadaDos.mostarNombre();
        brigadaDos.atenderEmergencia();

        dronUno.mostarNombre();
        dronUno.atenderEmergencia();
    }
}
