public class Bicicleta extends Vehiculo{

    public Bicicleta(String nombre, int numeroRuedas){
        super(nombre, numeroRuedas);
    }

    @Override
    public void mover() {
        System.out.println("El vehículo: " + this.nombre + " se está moviendo con dos ruedas y sin motor");
    }

    
    
}
