/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class LiteracyData implements Comparable<LiteracyData>{
    private String theme;
    private String age;
    private String gender;
    private String country;
    private int year;
    private double litPer;

    public LiteracyData(String theme, String age, String gender, String country, int year, double litPer) {
        this.theme = theme;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.litPer = litPer;
    }

    public double getLitPer() {
        return litPer;
    }

    @Override
    public String toString() {
        return this.country 
                + " (" + this.year + "), " 
                + this.gender.split(" ")[0].trim() + ", " 
                + this.litPer;
    }
    
    

    
    @Override
    public int compareTo(LiteracyData data) {
        if(this.litPer == data.getLitPer()){
            return 0;
        }else if(this.litPer > data.getLitPer()){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
