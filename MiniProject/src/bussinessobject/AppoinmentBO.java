package bussinessobject;


import entity.Appoinment;
import entity.Doctor;
import entity.Patient;
import untility.Utility;

import java.util.*;

public class AppoinmentBO {

    public Appoinment createAppoinment (Long patientID, Map<Long, Patient> patients, Long doctorID, Map<Long, Doctor> doctors,
                                        Map<Long, Appoinment> appoinments,
                                        String purposeOfAppoinment) {
        Patient p1 = new Patient();
        if(patients.containsKey(patientID)) {
            p1 = patients.get(patientID);
        }
        Appoinment appoinment;
        Appoinment newAppoinment = new Appoinment();
        newAppoinment.setPurposeOfVisit(purposeOfAppoinment);
        newAppoinment.setDoctor(doctors.get(doctorID));
        newAppoinment.setPatient(patients.get(patientID));
        newAppoinment.setAppoinmentID(Utility.getVisitId(new ArrayList<>(appoinments.keySet())));
        newAppoinment.setIsFirstVisit(true);
        newAppoinment.setDateOfVisit(Calendar.getInstance().getTime());

        appoinments.put(newAppoinment.getAppoinmentID(), newAppoinment);

        Iterator<Long> iter = appoinments.keySet().iterator();
        Long appoinmentId = 0l;
        while(iter.hasNext()) {
            appoinmentId = iter.next();
            appoinment = appoinments.get(appoinmentId);
            if(appoinment.getPatient()!= null && appoinment.getPatient().getPatientID() == patientID) {
                newAppoinment.setIsFirstVisit(false);
            }
            else
            {
                newAppoinment.setIsFirstVisit(true);
            }
        }
        return newAppoinment ;
    }
}
