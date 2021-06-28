public class Cajera extends Thread{

    private String name;
    private Cliente cliente;
    private long initialTime;

    // Constructor, getter & setter

    public Cajera() {
    }

    public Cajera(String name, Cliente cliente, long initialTime) {
        this.name = name;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
}
