package mx.com.gm.mundopc;

public class MundoPC {

	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP", 13);
		Teclado tecladoHP = new Teclado("bluetooth", "HP");
		Raton ratonHP = new Raton("bluetooth","HP");
		
		//enviar objetos de esta forma se le llama relacion de agregacion
		Computadora computadoraHP = new Computadora("Comp HP",monitorHP,tecladoHP,ratonHP);

		
		
		Monitor monitorGR = new Monitor("GR", 34);
		Teclado tecladoGR = new Teclado("bluetooth", "GR");
		Raton ratonGR = new Raton("bluetooth","GR");
		
		//enviar objetos de esta forma se le llama relacion de agregacion
		Computadora computadoraGR = new Computadora("Comp GR",monitorGR,tecladoGR,ratonGR);

		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGR);
		
		orden1.mostrarOrden();
	}

}
