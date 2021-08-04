package entity;

import java.util.*;

public class AppoinmentBO {

    public Appoinment createAppoinment (Long patientID, Map<Long, Patient> patients, Long doctorID, Map<Long, Doctor> doctors,
                                 Long appoinmentID, Map<Long, Appoinment> appoinments,
                                 Date dateOfApoinment, String purposeOfAppoinment) {
        Appoinment appoinment = new Appoinment();
        Appoinment newAppoinment = new Appoinment();
       // newAppoinment.setPurposeOfVisit((dateOfApoinment));
        newAppoinment.setPurposeOfVisit(purposeOfAppoinment);
        newAppoinment.setDoctor(doctors.get(doctorID));
        newAppoinment.setPatient(patients.get(patientID));
        newAppoinment.setAppoinmentID(appoinment.getAppoinmentID());

        Iterator<Long> iter = appoinments.keySet().iterator();
        Long appoinmentId = 0l;
        while(iter.hasNext()) {
            appoinmentID = iter.next();
            appoinment = appoinments.get(appoinmentID);
            if(appoinment.getPatient()!= null && appoinment.getPatient().getPatientID() == appoinmentID) {
                newAppoinment.setIsFirstVisit(false);
            }
                else
            {
                newAppoinment.setIsFirstVisit(true);
            }
        }
return newAppoinment ;
    }
private Long getAppoinmentID(List<Long> appoinmentIds) {
        Long newAppoinmentId = 0l;
    Collections.sort(appoinmentIds);
    newAppoinmentId = appoinmentIds.get(appoinmentIds.size());
    return newAppoinmentId;
}
}
