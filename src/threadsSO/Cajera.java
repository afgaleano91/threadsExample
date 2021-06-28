package threadsSO;

public class Cajera extends Thread {

    private String nombre;

    private Cliente cliente;

    private long initialTime;


    public Cajera() {
    }

    public Cajera(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {

        System.out.println("La cajera " + this.nombre + " Ha comenzado a procesar la compra "
                + this.cliente.getName() + " En el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        for (int i = 0; i < this.cliente.getShopCar().length; i++) {
            // Se procesa el pedido en X segundos
            this.esperarXsegundos(cliente.getShopCar()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.cliente.getName() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.nombre + " Ha terminado de registrar "
                + this.cliente.getName() + " En el tiempo: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}