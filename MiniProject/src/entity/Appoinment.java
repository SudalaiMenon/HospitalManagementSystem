package entity;

import java.util.Date;

public class Appoinment {
    private long appoinmentID;
    private Doctor doctor;
    private Patient patient;
    private Date dateOfVisit;
    private String purposeOfVisit;
    private String isFirstVisit;
    private String  bp;
    private String temperature;
    private String doctorToVisit;


    public long getPatientID() {
        return appoinmentID;
    }

    public void setPatientID(long patientID) {
        this.appoinmentID = patientID;
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

    public String getIsFirstVisit() {
        return isFirstVisit;
    }

    public void setIsFirstVisit(String isFirstVisit) {
        this.isFirstVisit = isFirstVisit;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
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
