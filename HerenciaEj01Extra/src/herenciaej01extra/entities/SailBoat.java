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
public class SailBoat extends Boat{
    
    private Integer mastsNum; 
    
    public SailBoat(Integer mastsNum, String registration, Double length, Integer yearMade) {
        super(registration, length, yearMade);
        this.mastsNum = mastsNum;
    }

    public Integer getMastsNum() {
        return mastsNum;
    }

    public void setMastsNum(Integer mastsNum) {
        this.mastsNum = mastsNum;
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
        return "SailBoat{" + "mastsNum=" + mastsNum + '}';
    }
    
}
