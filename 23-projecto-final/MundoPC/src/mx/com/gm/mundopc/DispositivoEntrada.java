package mx.com.gm.mundopc;
public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;
    
   //Contructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    //ToString
    @Override
    public String toString() {
        return "DispositivoEntrada [marca=" + marca + ", tipoEntrada=" + tipoEntrada + "]";
    }
    //Getters
    public String getTipoEntrada() {return tipoEntrada;}
    public String getMarca() {return marca; }
    //Setters
    public void setTipoEntrada(String tipoEntrada) {this.tipoEntrada = tipoEntrada;}
    public void setMarca(String marca) {this.marca = marca;}

}
