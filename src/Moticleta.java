public class Moticleta extends Vehiculo{

    
    public Moticleta(String nombre, int numeroRuedas){
        super(nombre, numeroRuedas);
    }

    @Override
    public void mover() {
        System.out.println("El vehículo: " + this.nombre + " se está moviendo con dos ruedas y motor");
    }
}
