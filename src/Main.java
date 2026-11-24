//public class Main {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3,9,8};
//        int[] b = a;
//
//        MemoryTest.changeFirstElement(b);
//        MemoryTest.displayArray(a);
//
//        int[] c = MemoryTest.createNewArray(a);
//        c[0] = 555;
//        MemoryTest.displayArray(a);
//        MemoryTest.displayArray(c);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Counter a = new Counter();
//        Counter b = new Counter();
//
//        a.increment();
//        a.increment();
//        b.decrement();
//
//        System.out.println("a: " + a.getCount());
//        System.out.println("b: " + b.getCount());
//        System.out.println("Total: " + Counter.getTotalObjects());
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        CoffeeMachine m1 = new CoffeeMachine("Machine 1", 100, 100);
//        CoffeeMachine m2 = new CoffeeMachine("Machine 2", 900, 70);
//        CoffeeMachine m2 = new CoffeeMachine("Machine 2", 900, 70);
//
//
//
//        m1.makeCoffee();
//        m1.makeCoffee();
//        m1.addCoffee(50);
//
//
//        m2.addWater(300);
//        m2.makeCoffee();
//        m2.makeCoffee();
//        m2.makeCoffee();
//
//        System.out.println();
//        m1.displayStatus();
//        m2.displayStatus();
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {4, 70, 12, 3, 8, 20, 150};
//
//        System.out.print("Array: ");
//        NumberAnalyzer.displayArray(numbers);
//
//        System.out.println("Max: " + NumberAnalyzer.findMax(numbers));
//        System.out.println("Even count: " + NumberAnalyzer.countEven(numbers));
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Cars c1 = new Cars("Toyota", "Corolla", 2020, 40.0);
//        Cars c2 = new Cars("BMW", "X5", 2024, 220.0);
//        Cars c3 = new Cars("Kia", "Rio", 2019, 75.5);
//
//        c1.displayInfo();
//        System.out.println("New car: " + c1.isNewCar());
//        System.out.println("Rental price for 3 day(s): " + c1.calculateRentalPrice(3));
//        System.out.println("Rental price for 10 day(s): " + c1.calculateRentalPrice(10));
//        System.out.println();
//
//        c2.displayInfo();
//        System.out.println("New car: " + c2.isNewCar());
//        System.out.println("Rental price for 2 day(s): " + c2.calculateRentalPrice(2));
//        System.out.println("Rental price for 5 day(s): " + c2.calculateRentalPrice(5));
//        System.out.println();
//
//        c3.displayInfo();
//        System.out.println("New car: " + c3.isNewCar());
//        System.out.println("Rental price for 4 day(s): " + c3.calculateRentalPrice(4));
//        System.out.println("Rental price for 7 day(s): " + c3.calculateRentalPrice(7));
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("sum(5, 7) = " + Calculator.sum(5, 3));
//        System.out.println("sum(1, 2, 6) = " + Calculator.sum(1, 2, 3));
//        System.out.println("multiply(4, 9) = " + Calculator.multiply(4, 6));
//        System.out.println("divide(10, 4) = " + Calculator.divide(10, 4));
//        System.out.println("square(4) = " + Calculator.square(7));
//    }
//}

public class Main {
    public static void main(String[] args) {
        Playlist workout = new Playlist("Workout");
        Playlist chill = new Playlist("Chill");

        workout.addSong("Eye of the Tiger");
        workout.addSong("Lose Yourself");
        workout.addSong("Till I Collapse");
        workout.addSong("Stronger");

        chill.addSong("Weightless");
        chill.addSong("Sunset Lover");
        chill.addSong("Clair de Lune");

        workout.displaySongs();
        System.out.println("Song count: " + workout.getSongCount());
        System.out.println();

        chill.displaySongs();
        System.out.println("Song count: " + chill.getSongCount());
        System.out.println();

        System.out.println("Workout contains \"Lose Yourself\": " + workout.containsSong("Lose Yourself"));
        System.out.println("Workout contains \"Weightless\": " + workout.containsSong("Weightless"));
        System.out.println("Chill contains \"Weightless\": " + chill.containsSong("Weightless"));
        System.out.println();

        String[] favorites = {"Weightless", "Believer"};
        System.out.println("Array contains \"Believer\": " + Playlist.searchSong(favorites, "Believer"));
        System.out.println("Array contains \"Lose Yourself\": " + Playlist.searchSong(favorites, "Lose Yourself"));
    }
}