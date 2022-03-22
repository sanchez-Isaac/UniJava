
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Carlos Bodoque", 5000.0);
        System.out.println("Empleado = "+ empleado1 );

        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Venus 15");
        System.out.println("cliente1 = "+ cliente1 );
    }
}
