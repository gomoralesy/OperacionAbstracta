public class Main {
    public static void main(String[] args) {

        EquipoEmergencia medicaUno = new BrigadaMedica("Brigada Medica");
        EquipoEmergencia tecnicaUno = new BrigadaTecnica("Brigada Tecnica");
        EquipoEmergencia dronUno = new DronRescate("Dron Vigilante");

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
