package com.tfb.fitnessapp.models;

public class Notificationmodel {

    private String notification_sub;
    private String notificationTime;
    private int imgid;

    public Notificationmodel(String notification_sub, String notificationTime, int imgid) {
        this.notification_sub = notification_sub;
        this.notificationTime = notificationTime;
        this.imgid = imgid;
    }

    public String getNotification_sub() {
        return notification_sub;
    }

    public void setNotification_sub(String notification_sub) {
        this.notification_sub = notification_sub;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
