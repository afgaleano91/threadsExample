package threadsSO;

public class Generar extends Thread{

    private long initialTime;
    private String vacia;
    private int Counter;

    public Generar(long initialTime, String vacia) {
        this.initialTime = initialTime;
        this.vacia = vacia;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public String getVacia() {
        return vacia;
    }

    public void setVacia(String vacia) {
        this.vacia = vacia;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }

    @Override
    public void run() {

        this.setVacia("True");
        System.out.println("La variable vacia ahora es " + this.getVacia()
                + " Se ha generado en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        // Se procesa el pedido en X segundos
        this.esperarXsegundos(this.getCounter());
        System.out.println("Procesado " + (this.getCounter() + 2)
                + "->Tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        System.out.println("El hilo Generar ha terminado en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg\n");
        long initialTime = System.currentTimeMillis();
        Consumir consumir = new Consumir(initialTime, this.getVacia());
        consumir.run();
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
