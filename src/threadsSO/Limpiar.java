package threadsSO;

public class Limpiar extends Thread {

    private Base base;
    private long initialTime;

    public Limpiar(Base base, long initialTime) {
        this.base = base;
        this.initialTime = initialTime;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    @Override
    public void run() {

        System.out.println("La variable " + base.getVacia()
                + " Ha comenzado a limpiarse en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        // Se procesa el pedido en X segundos
        this.esperarXsegundos(base.getCounter());
        System.out.println("Procesado " + (base.getCounter())
                + "->Tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
        base.setVacia("");

        System.out.println("El hilo limpiar" + base.getVacia() + " Ha terminado "
                + "en el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + " seg\n");
        long initialTime = System.currentTimeMillis();
        Generar generar = new Generar(initialTime, base.getVacia());
        generar.run();
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}