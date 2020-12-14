/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class CD implements Packable {

    private String artist;
    private String name;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.getArtist() + ": " + this.getName() + " (" + this.getYear() + ")";
    }

}
