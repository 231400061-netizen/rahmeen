// Bird.java
public class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " chirps!");
    }

    public static void main(String[] args) {
        Bird b = new Bird("Parrot");
        b.sound();
    }
}
