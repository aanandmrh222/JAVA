interface Flyable {
//    public abstract void fly();
    void fly();
}

abstract class Bird implements Flyable {
    private final String breed;
    public Bird(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}

class Eagle extends Bird {
    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class AK_58_PracticeSet1 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
