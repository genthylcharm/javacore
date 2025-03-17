package OOP;



interface D {
    void eat(String food);

    void sleep(String where);
}

public class Animal {
    public void move() {
        System.out.println("Animal is moving... ");
    }

}

class Cat extends Animal implements D {

    @Override
    public void eat(String food) {

    }

    @Override
    public void sleep(String where) {

    }

    @Override
    public void move() {
        System.out.println("Cat is Go.....");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird is flying....");
    }

    public void move(String by) {
        System.out.println("Bird is moving by" + by);
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish is Swiming...");
    }
public final  void breatheUnderwater(){
        System.out.println("Fish is breathrUnderwater ....");
}

}
class inKetQua{
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal cat =new Cat();
        Animal bird = new Bird();

        fish.move();
        cat.move();
        bird.move();
    }
}