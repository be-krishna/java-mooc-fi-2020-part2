/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Book {

    private String name;
    private int recAge;

    public Book(String name, int recAge) {
        this.name = name;
        this.recAge = recAge;
    }

    public String getName() {
        return name;
    }

    public int getRecAge() {
        return recAge;
    }

    @Override
    public String toString() {
        return getName() + " (recommended for " + getRecAge() + " year-olds or older)";
    }

}
