package threadsSO;

public class Base {

    private String vacia;
    private int counter = 0;

    public Base(String vacia, int counter) {
        this.vacia = vacia;
        this.counter = counter;
    }

    public String getVacia() {
        return vacia;
    }

    public void setVacia(String vacia) {
        this.vacia = vacia;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
