package domain;
//abstract se ocupa para definir metodos que no tienen ninguna implemetacion
//cuando una clase contiene un metodo abstracto, la clase debe de tener
//el keyword de abstracto tambien.

//cuando se declara un metodo como abstracto, cama clase hija esta obligada
//a implementar este metodo abstracto.
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    //Constructor
    protected FiguraGeometrica(String tipoFigura){this.tipoFigura = tipoFigura;}
    
    //Este es nuestro metodo abstracto, no tiene implementacion
    //pero la implementacion estara a cargo de las clases hijas
    public abstract void dibujar();

    //Getter/Setter
    public String getTipoFigura() { return tipoFigura; }
    public void setTipoFigura(String tipoFigura) { this.tipoFigura = tipoFigura; }
    //ToString
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
