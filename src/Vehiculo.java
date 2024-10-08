public abstract class Vehiculo{

    protected String nombre;

    protected int numeroRuedas;

    public Vehiculo(String nombre, int numeroRuedas) {
        this.nombre = nombre;
        this.numeroRuedas = numeroRuedas;
    }

    public abstract void mover();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    
    

}