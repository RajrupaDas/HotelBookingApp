/**
 * Abstract base class representing a generic Room.
 * Demonstrates Encapsulation and Abstraction.
 */
abstract class Room {
    private String type;
    private int beds;
    private double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type + " | Beds: " + beds + " | Price: $" + price);
    }
}

// Concrete Implementations
class SingleRoom extends Room {
    public SingleRoom() { super("Single", 1, 100.0); }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super("Double", 2, 180.0); }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super("Suite", 4, 350.0); }
}
