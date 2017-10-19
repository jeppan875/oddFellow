package models;

public class Gathering {

    public Gathering(String nameOfGathering, String place, String date, String startTime, String endTime) {
        this.nameOfGathering = nameOfGathering;
        this.place = place;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private  String nameOfGathering;
    private String place;
    private String date;
    private String startTime;
    private String endTime;

    public String getNameOfGathering() {
        return nameOfGathering;
    }

    public void setNameOfGathering(String nameOfGathering) {
        this.nameOfGathering = nameOfGathering;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
