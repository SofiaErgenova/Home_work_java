
import java.util.Objects;

public class Laptop {
    Integer id;
    String brand;
    Integer randomAccessMemory;
    String color;
    String operatingSystem;


    public String toString() {
        return "Laptop: " +
                "id = " + id +
                ", brand = '" + brand + '\'' +
                ", color = '" + color + '\'' +
                ", randomAccessMemory = '" + randomAccessMemory + '\'' +
                ", operatingSystem = " + operatingSystem + '}';
    }
    
}

