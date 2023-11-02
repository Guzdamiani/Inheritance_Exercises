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
public class Yacht extends MotorBoat {

    private Integer cabinNum;

    public Yacht(Integer cabinNum, Integer enginePower, String registration, Double length, Integer yearMade) {
        super(enginePower, registration, length, yearMade);
        this.cabinNum = cabinNum;
    }

    public Integer getCabinNum() {
        return cabinNum;
    }

    public void setCabinNum(Integer cabinNum) {
        this.cabinNum = cabinNum;
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
        return "Yacht{" + "cabinNum=" + cabinNum + '}';
    }
}
