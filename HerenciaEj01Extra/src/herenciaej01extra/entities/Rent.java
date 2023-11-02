/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej01extra.entities;

import java.time.LocalDate;

/**
 *
 * @author guzma
 */
public class Rent {

    private String clientName;
    private String clientID;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private String mooringPosition;
    private Boat boat;

    public Rent() {
    }

    public Rent(String clientName, String clientID, LocalDate rentalDate, LocalDate returnDate, String mooringPosition, Boat boat) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.boat = boat;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(String mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Rent{" + "clientName=" + clientName + ", clientID=" + clientID + ", rentalDate=" + rentalDate + ", returnDate=" + returnDate + ", mooringPosition=" + mooringPosition + ", boat=" + boat + '}';
    }
    
    
}
