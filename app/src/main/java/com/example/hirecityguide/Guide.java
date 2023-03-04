package com.example.hirecityguide;

import android.widget.EditText;

public class Guide {
    private String guideName;
    private String guideNumber;
    private String requiredDay;
    private String requiredTime;

    public Guide(String guideName, String guideNumber, String requiredDay, String requiredTime) {
        this.guideName = guideName;
        this.guideNumber = guideNumber;
        this.requiredDay = requiredDay;
        this.requiredTime = requiredTime;
    }

    public Guide(EditText guideName, EditText guideNumber, EditText requiredDay, EditText requiredTime) {
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getGuideNumber() {
        return guideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        this.guideNumber = guideNumber;
    }

    public String getRequiredDay() {
        return requiredDay;
    }

    public void setRequiredDay(String requiredDay) {
        this.requiredDay = requiredDay;
    }

    public String getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(String requiredTime) {
        this.requiredTime = requiredTime;
    }
}
