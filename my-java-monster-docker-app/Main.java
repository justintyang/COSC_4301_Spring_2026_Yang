public class Main {

    public static void main(String[] args) {

        // Create one Monster object
        Monster monster = new Monster("AquaJaw", "Water");

        // Print clear output
        System.out.println("Your monster has been created.");
        System.out.println("Description: " + monster.getDescription());
    }
}
