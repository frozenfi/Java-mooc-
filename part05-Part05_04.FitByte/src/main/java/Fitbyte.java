/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flyhi
 */
public class Fitbyte {
    private String age;
    private int restingHeartRate;
    
    public Fitbyte(String age, int restHeartRate) {
        this.age = age;
        this.restingHeartRate = restHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 200.0;
        return ((maximumHeartRate-this.restingHeartRate)*(percentageOfMaximum)) + this.restingHeartRate;
        
    } 
    
}
