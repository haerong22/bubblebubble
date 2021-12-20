package test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Dog {
    private String name;
}

public class LombokTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("댕댕");
        System.out.println(dog.getName());
    }
}
