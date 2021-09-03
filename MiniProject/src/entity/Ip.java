package entity;

import entity.Patient;

public class Ip {
    private Long patientId;
    private Long IpIdentificationNumber;
    private Patient patient;
    private Bed bed;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getIpIdentificationNumber() {
        return IpIdentificationNumber;
    }

    public void setIpIdentificationNumber(Long ipIdentificationNumber) {
        IpIdentificationNumber = ipIdentificationNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "Ip{" +
                "patientId=" + patientId +
                ", IpIdentificationNumber=" + IpIdentificationNumber +
                ", patient=" + patient +
                ", bed=" + bed +
                '}';
    }
}
