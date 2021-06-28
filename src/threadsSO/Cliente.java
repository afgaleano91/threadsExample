package threadsSO;

public class Cliente {

    private String name;
    private int[] shopCar;

    public Cliente(String name, int[] shopCar) {
        this.name = name;
        this.shopCar = shopCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getShopCar() {
        return shopCar;
    }

    public void setShopCar(int[] shopCar) {
        this.shopCar = shopCar;
    }
}
