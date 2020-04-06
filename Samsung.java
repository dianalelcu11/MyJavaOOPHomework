package ro.siit;

abstract public class Samsung implements Phone {
    public String color;
    public String material;
    public String imei;

    public Samsung(String color, String material, String imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }


}
