public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo moto = new Moticleta("Honda", 2);
        Vehiculo bici = new Bicicleta("BMX", 2);
        Vehiculo auto = new Auto("Toyoya", 4);

        Vehiculo[] vehiculos = {moto, auto, bici};

        for (Vehiculo actual : vehiculos) {
            actual.mover();
        }
    }
}
