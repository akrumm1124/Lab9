/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class UndergraduateStudent extends Student{
    private int year;

    public UndergraduateStudent(int year) {
        super("0811120", "Alex", "Krumm");
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
}
