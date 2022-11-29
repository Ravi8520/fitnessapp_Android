package com.tfb.fitnessapp.models;

public class MessagesModel {

    private String userName;
    private String messageAlert;
    private int imgid;


    public MessagesModel(String userName, String messageAlert, int imgid) {
        this.userName = userName;
        this.messageAlert = messageAlert;
        this.imgid = imgid;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageAlert() {
        return messageAlert;
    }

    public void setMessageAlert(String messageAlert) {
        this.messageAlert = messageAlert;
    }
}
