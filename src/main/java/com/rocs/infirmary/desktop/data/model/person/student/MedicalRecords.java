package com.rocs.infirmary.desktop.data.model.person.student;

import java.util.Date;

public class MedicalRecords extends Student {

    private int id;
    private String symptoms;
    private Date visitDateTime;
    private double temperatureReadings;
    private String treatment;
    private int nurseInChargeId;
    private Integer ailmentId;

    public MedicalRecords() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Date getVisitDateTime() {
        return visitDateTime;
    }

    public void setVisitDateTime(Date visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    public String getTemperatureReadings() {
        return String.valueOf(temperatureReadings);
    }

    public void setTemperatureReadings(double temperatureReadings) {
        this.temperatureReadings = temperatureReadings;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getNurseInChargeId() {
        return nurseInChargeId;
    }

    public void setNurseInChargeId(int nurseInChargeId) {
        this.nurseInChargeId = nurseInChargeId;
    }

    public Integer getAilmentId() {
        return ailmentId;
    }

    public void setAilmentId(Integer ailmentId) {
        this.ailmentId = ailmentId;
    }

    @Override
    public String toString() {
        return "MedicalRecords{" +
                "id=" + id +
                ", firstName='" + getFirstName() + '\'' +
                ", middleName='" + getMiddleName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", visitDateTime=" + visitDateTime +
                ", temperatureReadings=" + temperatureReadings +
                ", treatment='" + treatment + '\'' +
                ", nurseInChargeId=" + nurseInChargeId +
                ", ailmentId=" + ailmentId +
                '}';
    }
}