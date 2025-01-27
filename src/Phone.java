public class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(int phoneNumber) {
        System.out.println("You are calling " + phoneNumber);
    }
}
