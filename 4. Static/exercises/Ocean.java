package exercises;

public class Ocean {
    public static void main(String[] args) {
        SeaCreature seaCreature1 = new SeaCreature("Spongebob");
        SeaCreature seaCreature2 = new SeaCreature("Patrick");
        SeaCreature seaCreature3 = new SeaCreature("Squidward");
        seaCreature1.eat();
        seaCreature1.laugh();
        System.out.println(seaCreature2.getName());
        seaCreature2.laugh();
        System.out.println(seaCreature3.getName());
        seaCreature3.laugh();
    }
}
