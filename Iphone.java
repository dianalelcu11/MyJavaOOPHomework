package ro.siit;

abstract class Iphone implements Phone {
    public String color;
    public String material;
    public String imei;

    public Iphone(String color, String material, String imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

}
