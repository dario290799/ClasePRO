package Repaso3;

public abstract class Vehiculo {
    //variables
    protected String motor;
    protected int nruedas;
    protected int cc;
    protected int peso;

    //Constructorer
    public Vehiculo(){}

    public Vehiculo(String motor, int nruedas, int cc, int peso) {
        this.motor = motor;
        this.nruedas = nruedas;
        this.cc = cc;
        this.peso = peso;
    }

    //metodos

    public abstract void reprogramarMotor();

    public void mostrarDatos(){
        System.out.println("Motor: "+ motor);
        System.out.println("Nº ruedas: "+ nruedas);
        System.out.println("CC: "+ cc);
        System.out.println("Peso: " + peso);
    };

    //Getter & Setter

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNruedas() {
        return nruedas;
    }

    public void setNruedas(int nruedas) {
        this.nruedas = nruedas;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

