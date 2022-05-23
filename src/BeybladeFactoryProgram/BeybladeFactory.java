package BeybladeFactoryProgram;

public class BeybladeFactory {
    public Beyblade produceBeyblade (String beybladeType) {
        beybladeType = beybladeType.toLowerCase();
        return switch (beybladeType) {
            case "dragon" -> new Dragon("Takao", 800, 300, "Blue Dragon", "To talk bit beast");
            case "dranza" -> new Dranza("Kai", 600, 400, "Red Phoenix");
            case "drayga" -> new Drayga("Rei", 800, 250, "White Tiger");
            case "draciel" -> new Draciel("Max", 400, 1000, "Dark Turtle");
            default -> null;
        };
    }
}
