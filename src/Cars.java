public class Cars {
    private String brand;
    private String model;
    private int year;
    private double dailyPrice;

    public Cars(String brand, String model, int year, double dailyPrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyPrice = dailyPrice;
    }

    public void displayInfo() {
        System.out.println(brand + " " + model + " (" + year + "), daily price: " + dailyPrice);
    }

    public double calculateRentalPrice(int days) {
        return dailyPrice * days;
    }

    public boolean isNewCar() {
        return year >= 2020;
    }
}