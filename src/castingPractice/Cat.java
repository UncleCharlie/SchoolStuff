/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingPractice;

/**
 *
 * @author H23488221
 */

public class Cat extends Animal implements Mew {
    public void eat() {
         System.out.println("Cat is eating");
    }
 
    public void meow() {
         System.out.println("Meow");
    }
}
