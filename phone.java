import java.util.Arrays;

public class phone {
    private String brand;
    private String model;
    private double price;
    private int year;
    private char size;
    private boolean isOn;
    private boolean islocked;
    private boolean isSmart;
    private String[] features;
    public phone(String brand, String model, double price, int year, char size, boolean isOn, boolean isSmart, String[] features,boolean islocked) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.size = size;
        this.isOn = isOn;
        this.isSmart = isSmart;
        this.features = features;
        this.islocked = islocked;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand != null&& brand != "") {
        this.brand = brand;
    }}
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model != null&& model != "") {
        this.model = model;}
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0){
        this.price = price;}
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year >= 2000){
        this.year = year;}
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        if (size=='m' ||size == 'S'||size == 'L'){
        this.size = size;}
    }
    public boolean getisOn() {
        return isOn;
    }
    public void setisOn(boolean on) {
        isOn = on;
    }

    public boolean getisSmart() {
        return isSmart;
    }
    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public void setIslocked(boolean islocked) {
        this.islocked = islocked;
    }
    public boolean getIslocked() {
        return islocked;
    }
    public String[] getFeatures() {
        return features;
    }
    public void setFeatures(String[] features) {
        if (features!=null){
        this.features = features;}
    }

    @Override
    public String toString() {
        return "brand: " + getBrand() + ", model: " + getModel() + ", price: " + getPrice() + ", year: " + getYear() + ", size: " + getSize() + ", isOn: " + getisOn() + ", isSmart: " + getisSmart() + ", features: " + Arrays.toString(getFeatures());
    }

}
