/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingPractice;
import java.util.*;
/**
 *
 * @author H23488221
 */
public class Main {
    public static void main(String[] args){
    
        Cat cat = new Cat();
        
        Animal animal = new Cat();
        //((Cat)animal).meow();
        
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Dog());
        
        AnimalFeeder.feed(animals);
        
        System.out.println(animals.size());

    }
}
