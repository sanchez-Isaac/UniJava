package domain;

public class Rectangulo extends FiguraGeometrica {
    
    //Constructor
    public Rectangulo(String tipoFigura){//tipoFigura viene de la clase padre
        super(tipoFigura); //Implementa el constructor de la clase padre
    }
    

    @Override//Esta es el metodo abstracto de la clase padre
    //Es requisito implementarlo en todas las clases hijas que extiendan
    //de FiguraGeometrica 
    public void dibujar(){               //esto desplegara el nombre de la clase
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
