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
public class AnimalFeeder {
 
    public static void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
            if(animal instanceof Cat){
                ((Cat) animal).meow();
            }
        });

    }
}
