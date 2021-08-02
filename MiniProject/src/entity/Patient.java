package entity;

import java.util.Date;

public class Patient {
      private String patientName;
      private Long patientID;
      private Date patientDOB;
      private String phoneNumber;
      private String address;
      private String typeIpOp;

      public String getPatientName() {
            return patientName;
      }

      public void setPatientName(String patientName) {
            this.patientName = patientName;
      }

      public Long getPatientID() {
            return patientID;
      }

      public void setPatientID(Long patientID) {
            this.patientID = patientID;
      }

      public Date getPatientDOB() {
            return patientDOB;
      }

      public void setPatientDOB(Date patientDOB) {
            this.patientDOB = patientDOB;
      }

      public String getPhoneNumber() {
            return phoneNumber;
      }

      public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      public String getTypeIpOp() {
            return typeIpOp;
      }

      public void setTypeIpOp(String typeIpOp) {
            this.typeIpOp = typeIpOp;
      }



}
