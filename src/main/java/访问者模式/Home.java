package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private List<Animal> list=new ArrayList<>();

    public void addAnimal(Animal animal){
        list.add(animal);
    }

    public void action(Person person){
        for (Animal animal : list) {
            animal.accept(person);
        }
    }
}
