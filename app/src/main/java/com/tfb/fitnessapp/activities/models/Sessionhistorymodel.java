package com.tfb.fitnessapp.activities.models;

public class Sessionhistorymodel {

    private String attendance;
    private String sessionTime;
    private String sessionUser;
    private String sessionLocation;
    private String sessionAddress;
    private String attendanceDate;
    private String arrivalTime;

    public Sessionhistorymodel(String attendance, String sessionTime, String sessionUser, String sessionLocation,
                               String sessionAddress, String attendanceDate, String arrivalTime) {

        this.attendance = attendance;
        this.sessionTime = sessionTime;
        this.sessionUser = sessionUser;
        this.sessionLocation = sessionLocation;
        this.sessionAddress = sessionAddress;
        this.attendanceDate = attendanceDate;
        this.arrivalTime = arrivalTime;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(String sessionUser) {
        this.sessionUser = sessionUser;
    }

    public String getSessionLocation() {
        return sessionLocation;
    }

    public void setSessionLocation(String sessionLocation) {
        this.sessionLocation = sessionLocation;
    }

    public String getSessionAddress() {
        return sessionAddress;
    }

    public void setSessionAddress(String sessionAddress) {
        this.sessionAddress = sessionAddress;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
