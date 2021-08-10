package entity;

import java.util.Date;

public class Medicine {
    private Long medicineId;
    private String medicineName;
    private Date expiryDate;
    private String batchNumber;
    private String medicinePurpose;

    public long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(long medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getMedicinePurpose() {
        return medicinePurpose;
    }

    public void setMedicinePurpose(String medicinePurpose) {
        this.medicinePurpose = medicinePurpose;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", expiryDate=" + expiryDate +
                ", batchNumber='" + batchNumber + '\'' +
                ", medicinePurpose='" + medicinePurpose + '\'' +
                '}';
    }
}
