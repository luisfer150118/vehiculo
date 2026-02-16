public class Objvehiculo {
    //declarar variables//
    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private int NumCelda;
    private double PagoAnt;
    private double PagoAct;
    public Objvehiculo(String marca, String tipo, int cilindraje, int numCelda, double pagoAnt, double pagoAct) {
        Marca = marca;
        Tipo = tipo;
        Cilindraje = cilindraje;
        NumCelda = numCelda;
        PagoAnt = pagoAnt;
        PagoAct = pagoAct;
    }
    public Objvehiculo() {
    }
    public String getMarca() {
        return Marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public int getNumCelda() {
        return NumCelda;
    }
    public double getPagoAnt() {
        return PagoAnt;
    }
    public double getPagoAct() {
        return PagoAct;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public void setNumCelda(int numCelda) {
        NumCelda = numCelda;
    }
    public void setPagoAnt(double pagoAnt) {
        PagoAnt = pagoAnt;
    }
    public void setPagoAct(double pagoAct) {
        PagoAct = pagoAct;
    }
    
}