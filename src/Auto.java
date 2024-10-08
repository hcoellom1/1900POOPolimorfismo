public class Auto extends Vehiculo{

    public Auto(String nombre, int numeroRuedas){
        super(nombre, numeroRuedas);
    }

    @Override
    public void mover() {
        System.out.println("El vehículo: " + this.nombre + " se está moviendo con cuatro ruedas y motor");
    }
    

}
