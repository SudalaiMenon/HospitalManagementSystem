package entity;

import java.util.List;

public class VisitingInformation {

    private Long visitId;
    private Appoinment appoinment;
    private String doctorRecommendation;
    private List<Medicine> medicinesList;
    private Boolean followUpNeed;

    public long getVisitId() {
        return visitId;
    }

    public void setVisitId(long visitId) {
        this.visitId = visitId;
    }

    public Appoinment getAppoinment() {
        return appoinment;
    }

    public void setAppoinment(Appoinment appoinment) {
        this.appoinment = appoinment;
    }

    public String getDoctorRecommendation() {
        return doctorRecommendation;
    }

    public void setDoctorRecommendation(String doctorRecommendation) {
        this.doctorRecommendation = doctorRecommendation;
    }



    public Boolean getFollowUpNeed() {
        return followUpNeed;
    }

    public void setFollowUpNeed(Boolean followUpNeed) {
        this.followUpNeed = followUpNeed;
    }

    public List<Medicine> getMedicinesList() {
        return medicinesList;
    }

    public void setMedicinesList(List<Medicine> medicinesList) {
        this.medicinesList = medicinesList;
    }

    @Override
    public String toString() {
        return "VisitingInformation{" +
                "visitId=" + visitId +
                ", appoinment=" + appoinment +
                ", doctorRecommendation='" + doctorRecommendation + '\'' +
                ", medicinesList=" + medicinesList +
                ", followUpNeed=" + followUpNeed +
                '}';
    }
}
