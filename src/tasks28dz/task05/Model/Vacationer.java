package tasks28dz.task05.Model;

import java.time.LocalDateTime;

public class Vacationer {
    //Сафонов Вячеслав Викторович 20.08.2024 12:00 41 20.11.2024 12:00
    private String fullNameVacationer;
    private LocalDateTime checkInDateTime;
    private LocalDateTime checkOutDateTime;
    private int roomNumber;

    public Vacationer(String vacationer, LocalDateTime checkInDateTime, LocalDateTime checkOutDateTime, int roomNumber) {
        this.fullNameVacationer = vacationer;
        this.checkInDateTime = checkInDateTime;
        this.checkOutDateTime = checkOutDateTime;
        this.roomNumber = roomNumber;
    }

    public String getFullNameVacationer() {
        return fullNameVacationer;
    }

    public void setFullNameVacationer(String fullNameVacationer) {
        this.fullNameVacationer = fullNameVacationer;
    }

    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public LocalDateTime getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Vacationer{" +
                "vacationer='" + fullNameVacationer + '\'' +
                ", checkInDateTime=" + checkInDateTime +
                ", checkOutDateTime=" + checkOutDateTime +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
