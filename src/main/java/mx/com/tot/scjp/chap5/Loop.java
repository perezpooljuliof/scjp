package mx.com.tot.scjp.chap5;

public class Loop {

    /**
     * while es util cuando no se conoce por adelantado el numero
     * de veces que se repetira un bloque de codigo
     */
    public static void whileTest() {
        boolean condicion = true;

        while(condicion) {
            System.out.println("Dentro de while");
            condicion = false;
        }

        while(condicion)
            System.out.println("Nuna entro");
    }

    /**
     * do while es parecido al while con la excepcion
     * de que el codigo se ejecuta almenos una vez
     */
    public static void doWhileTest() {
        do {
            System.out.println("Dentro de do while");
        } while(false); // <-------- Importante el ";"

        do
            System.out.println("Dentro de do while2");
        while(false);
    }

    public static void main(String[] args) {
        Loop.doWhileTest();
    }
}
