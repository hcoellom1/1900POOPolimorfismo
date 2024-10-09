public class Auto extends Vehiculo implements IMotorizado{

    private boolean encendido;

    public Auto(String nombre, int numeroRuedas){
        super(nombre, numeroRuedas);
    }

    @Override
    public void mover() {
        System.out.println("El vehículo: " + this.nombre + " se está moviendo con cuatro ruedas y motor");
    }

    @Override
    public void encenderMotor() {
        if(encendido){
            System.out.println("El vehiculo ya está encendido");
        }else
        {
            this.encendido = true;
            System.out.println("Vehiculo encencido");
        }
    }

    @Override
    public void apagarMotor() {
        this.encendido= false;
        System.out.println("Vehiculo apagado");
    }
    

}
