enum Attributes {
    SMARTS,
    AGILITY,
    ATTACK,
    DEFENSE;
}
// Example of an enumerated class:
enum SurfaceBlocks {
    // An enumerated class can behave just like a regular class, but can still maintain its enumerated items!
    GRASS_BLOCK("Grass Block"),
    DIRT("Dirt"),
    STONE("Stone"),
    DEEPSLATE("Deepslate");

    private String name;

    private SurfaceBlocks(String name) {this.name = name;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}

public class Main {
    public static void main(String[] args) {
        // Attributes iq = Attributes.SMARTS;
        // Attributes ag = Attributes.AGILITY;
        // Attributes atk = Attributes.ATTACK;
        // Attributes def = Attributes.DEFENSE;

        // SurfaceBlocks grass = SurfaceBlocks.GRASS_BLOCK;
        // SurfaceBlocks dirt = SurfaceBlocks.DIRT;
        // SurfaceBlocks stone = SurfaceBlocks.STONE;
        // SurfaceBlocks deepslate = SurfaceBlocks.DEEPSLATE;

        SurfaceBlocks[] surface = SurfaceBlocks.values();
        Attributes[] att = Attributes.values();
        

        for(Attributes a : att) {
            // The ordinal() describes the ORDER/placement inside the enumerated list of Attributes
            System.out.println("Place of " + a + ": " + a.ordinal());
        }

        // This little code block here prints out all enum Attributes in a list:
        System.out.print("Attributes: ");
        for(int i=0; i<(att.length - 1); i++) {
            System.out.print(att[i] + ", ");
        }
        System.out.println(att[att.length - 1]);
        // Feel free to use it if you like!

        // Here is an example of enums in a switch-statement:
        Attributes current = Attributes.ATTACK; // You must define the current variable here, or there will be nothing to switch cases with.
        switch(current) {
            case SMARTS -> {System.out.println("I am smart!");}
            case AGILITY -> {System.out.println("I am fast!");}
            case ATTACK -> {System.out.println("I am strong!");}
            case DEFENSE -> {System.out.println("I am tough!");}

            default -> {System.out.println("Attribute Checking: Completed.");}
        }

        System.out.print("Surface Blocks: ");
        for(int i=0; i<(surface.length - 1); i++) {
            System.out.print(surface[i].getName() + ", ");
        }
        System.out.print(surface[surface.length - 1].getName());
    }
}