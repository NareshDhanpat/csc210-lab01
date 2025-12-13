public class Creature {

    private String name;
    private int size;

    public Creature(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    public void talk() {
        System.out.println(name + " says: Hello there!");
    }

    public void move(String direction) {
        System.out.println(name + " moves " + direction + ".");
    }

    public static void main(String[] args) {
        Creature c = new Creature("Zog", 5);

        c.talk();
        c.eat("berries");
        c.move("north");
    }
}