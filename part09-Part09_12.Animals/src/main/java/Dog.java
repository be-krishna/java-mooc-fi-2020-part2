/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }

//    @Override
//    public void sleep() {
//        System.out.println(getName() + " sleeps");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println(getName() + " eats");
//    }

    @Override
    public void makeNoise() {
        this.bark();
    }

}
