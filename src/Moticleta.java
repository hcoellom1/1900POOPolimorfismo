public class Moticleta extends Vehiculo implements IMotorizado{ 

    private boolean encendido;

    private double velocidad;

    public Moticleta(String nombre, int numeroRuedas){
        super(nombre, numeroRuedas);
    }

    @Override
    public void mover() {
        System.out.println("El vehículo: " + this.nombre + " se está moviendo con dos ruedas y motor");
    }

    @Override
    public void encenderMotor() {
        if(encendido){
            System.out.println("El vehiculo ya está encendido");
        }else{
            if(velocidad==0){
                encendido = true;
                System.out.println("El vehiculo está encendido");
            }else
            {
                encendido = false;
                System.out.println("Vehiculo no encendido");
            }
        }

    }

    @Override
    public void apagarMotor() {
        this.encendido= false;
        System.out.println("Vehiculo apagado");
    }
}
