package entity;

import java.util.Date;

public class Appoinment {
    private Long appoinmentID;
    private Doctor doctor;
    private Patient patient;
    private Date dateOfVisit;
    private String purposeOfVisit;
    private boolean isFirstVisit;
    private double  bp;
    private double temperature;
    private String doctorToVisit;


    public long getAppoinmentID() {
        return appoinmentID;
    }

    public void setAppoinmentID(long appoinmentID) {
        this.appoinmentID = appoinmentID;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public boolean getIsFirstVisit() {
        return isFirstVisit;
    }

    public void setIsFirstVisit(boolean isFirstVisit) {
        this.isFirstVisit = isFirstVisit;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDoctorToVisit() {
        return doctorToVisit;
    }

    public void setDoctorToVisit(String doctorToVisit) {
        this.doctorToVisit = doctorToVisit;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
