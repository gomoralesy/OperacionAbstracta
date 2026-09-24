public class Main {
    public static void main(String[] args) {

        equipoEmergencia medicaUno = new BrigadaMedica("Brigada Medica");
        equipoEmergencia tecnicaUno = new BrigadaTecnica("Brigada Tecnica");
        equipoEmergencia dronUno = new DronRescate("Dron Vigilante");

        medicaUno.mostarNombre();
        medicaUno.atenderEmergencia();
        System.out.println(" ");
        tecnicaUno.mostarNombre();
        tecnicaUno.atenderEmergencia();
        System.out.println(" ");
        dronUno.mostarNombre();
        dronUno.atenderEmergencia();
    }
}
