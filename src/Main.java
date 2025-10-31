public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("ES 300", "Lexus", 2022, 18369.99, "Black", 5);
        Car car2 = new Car("Camry 80", "Toyota", 2019, 13555.89, "White", 18);
        Car car3 = new Car(" ", " ", 0, 00.00, " ", 0);
        System.out.println("Initial car info:");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car1.sell(2);
        car2.sell(11);

        System.out.println("\nAfter selling cars:");
        System.out.println("\nFirst car info:");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        System.out.println("\nSecond car info:");
        System.out.println("Model: " + car2.getModel()
        + "\nBrand: " + car2.getBrand()
        + "\nYear: " + car2.getYear()
        + "\nPrice: " + car2.getPrice()
        + "\nColor: " + car2.getColor()
        + "\nQuantity: " + car2.getQuantity());

        car1.setColor("Blue");
        car1.setPrice(17699.99);
        car1.delivery(3);
        car3.setBrand("Toyota");
        car3.setModel("RAV4");
        car3.setColor("Red");
        car3.setYear(2021);
        car3.setPrice(23050.99);
        car3.setQuantity(3);

        System.out.println("\nAfter updates:");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
