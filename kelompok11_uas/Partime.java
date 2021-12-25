/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok11_uas;

/**
 *
 * @author Kelompok11
 */
import java.util.Date;

public class Partime extends Staff {

    int hours_worked_per_week;

    // float hourly_rate;

    public Partime(String firstname, String lastname, String id, char sex, Date dob, double hourly_rate,
            int hours_worked_per_week) {

        super(firstname, lastname, id, sex, dob, hourly_rate);

        this.hours_worked_per_week = hours_worked_per_week;

        // this.hourly_rate=hourly_rate;

    }

    public Partime() {

        /* default constructor */

    }

    @Override

    public double monthlyEarning() {

        return hourly_rate * hours_worked_per_week * 4;

    }

    public int getHours_worked_per_week() {

        return hours_worked_per_week;

    }

    public void setHours_worked_per_week(int hours_worked_per_week) {

        this.hours_worked_per_week = hours_worked_per_week;

    }

    public String toString() {

        return super.toString() + "\nJam kerja bulanan: " + (hours_worked_per_week * 4);

    }

}
