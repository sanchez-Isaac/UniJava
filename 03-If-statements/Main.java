

public class Main {
    public static void main(String args[]) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("The flag is true");
        } else {
            System.out.println("its false");
        }
        var age = 30;
        var isAdult = age >= 18;
        if (isAdult) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are underage");
        }
    }

}
