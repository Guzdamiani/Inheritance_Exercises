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
public class MotorBoat extends Boat {

    protected Integer enginePower;

    public MotorBoat(Integer enginePower, String registration, Double length, Integer yearMade) {
        super(registration, length, yearMade);
        this.enginePower = enginePower;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
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
        return "MotorBoat{" + "enginePower=" + enginePower + '}';
    }
}
