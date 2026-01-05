public class Animal {
    String name5;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {
        Animal a = new Animal("Dog");
        a.sound();
    }
}

