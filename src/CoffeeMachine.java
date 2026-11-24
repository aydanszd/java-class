public class CoffeeMachine {
    private int waterAmount;     // ml
    private int coffeeAmount;    // qram
    private String machineName;

    public CoffeeMachine(String machineName, int waterAmount, int coffeeAmount) {
        this.machineName = machineName;
        this.waterAmount = waterAmount;
        this.coffeeAmount = coffeeAmount;
    }

    public void makeCoffee() {
        if (waterAmount >= 200 && coffeeAmount >= 20) {
            waterAmount -= 200;
            coffeeAmount -= 20;
            System.out.println(machineName + ": coffee is ready");
        } else {
            System.out.println(machineName + ": not enough water or coffee");
        }
    }

    public void addWater(int amount) {
        waterAmount += amount;
    }

    public void addCoffee(int amount) {
        coffeeAmount += amount;
    }

    public void displayStatus() {
        System.out.println(machineName + " - Water: " + waterAmount + " ml, Coffee: " + coffeeAmount + " g");
    }
}