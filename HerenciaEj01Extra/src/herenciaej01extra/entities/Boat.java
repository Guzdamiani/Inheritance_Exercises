/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej01extra.entities;

/**
 *
 * @author guzma
 */
public class Boat {

    protected String registration;
    protected Double length;
    protected Integer yearMade;

    public Boat() {
    }

    public Boat(String registration, Double length, Integer yearMade) {
        this.registration = registration;
        this.length = length;
        this.yearMade = yearMade;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Integer getYearMade() {
        return yearMade;
    }

    public void setYearMade(Integer yearMade) {
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Boat{" + "registration=" + registration + ", length=" + length + ", yearMade=" + yearMade + '}';
    }

}
