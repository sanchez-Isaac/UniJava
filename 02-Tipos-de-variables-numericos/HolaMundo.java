
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long, flotante
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);

        ////////////////////////
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo float:" + Float.MAX_VALUE);

        float numeroFloatt = (float)3.4028236E38D; //Perdida de presicion
        System.out.println("numeroFloat = " + numeroFloatt);
        System.out.println("Valor minimo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo float:" + Float.MAX_VALUE);

        ///////////////////////
        double numeroDouble = 1.7976931348623157E308D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo double:" + Double.MAX_VALUE);
        //////////////////////
        char myChar = '!';
        System.out.println("myChar = " + myChar);

        char myChar2 = '\u0021';
        System.out.println("myChar2 = " + myChar2); //a ! shopuld appear

        char myChar3 = 33;
        System.out.println("myChar3 = " + myChar3); //a ! shopuld appear


    }
}

