package threadsSO;

public class Consumir extends Thread{

    private long initialTime;
    private String vacia;
    private int Counter;

    public Consumir(long initialTime, String vacia) {
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

        this.setVacia("False");
        System.out.println("La variable vacia ahora es " + this.getVacia()
                + " Se ha Consumido en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        // Se procesa el pedido en X segundos
        this.esperarXsegundos(this.getCounter());
        System.out.println("Procesado " + (this.getCounter() + 3)
                + "->Tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
        this.setVacia("asfasdfsdfsdf");

        System.out.println("El hilo Generar ha terminado en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
