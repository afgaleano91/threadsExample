package threadsSO;

public class Main {
    public static void main(String[] args) {

        Base base1 = new Base("Base 1", 1);

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        Limpiar limpiar1 = new Limpiar(base1 , initialTime);

        limpiar1.start();
    }
}
