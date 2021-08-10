package entity;

public class InPatient {
    private Long patientId;
    private String IpIdentificationNumber;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getIpIdentificationNumber() {
        return IpIdentificationNumber;
    }

    public void setIpIdentificationNumber(String ipIdentificationNumber) {
        IpIdentificationNumber = ipIdentificationNumber;
    }
}
