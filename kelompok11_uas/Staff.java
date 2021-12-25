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

public class Staff extends Employee {

    double hourly_rate;

    public Staff() {

        /* default constructor */

    }

    public Staff(String firstname, String lastname, String id, char sex, Date dob, double hourly_rate) {

        super(firstname, lastname, id, sex, dob); /* passing values to superclass constructor */

        this.hourly_rate = hourly_rate;

    }

    @Override

    public double monthlyEarning() {

        return hourly_rate * EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;

    }

    public double getHourly_rate() {

        return hourly_rate;

    }

    public void setHourly_rate(float hourly_rate) {

        this.hourly_rate = hourly_rate;

    }

    public String toString() {

        String str = super.toString() + "\nGaji bulanan: " + monthlyEarning();

        return str;

    }

}
