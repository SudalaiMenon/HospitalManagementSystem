package generatedata;

import entity.Appoinment;
import entity.Doctor;
import entity.Patient;
import untility.Utility;

import java.util.*;

public class AppoinmentGenerator {

    public Appoinment createAppoinment (Long patientID, Map<Long, Patient> patients, Long doctorID, Map<Long, Doctor> doctors,
                                        Map<Long, Appoinment> appoinments,
                                        String purposeOfAppoinment) {

        Appoinment appoinment;
        Appoinment newAppoinment = new Appoinment();
        newAppoinment.setPurposeOfVisit(purposeOfAppoinment);
        newAppoinment.setDoctor(doctors.get(doctorID));
        newAppoinment.setPatient(patients.get(patientID));

        long getVisitId = appoinments.keySet().size();
        getVisitId = getVisitId+1;
        newAppoinment.setAppoinmentID(getVisitId);
        //newAppoinment.setAppoinmentID(Utility.getVisitId(new ArrayList<>(appoinments.keySet())));
        newAppoinment.setIsFirstVisit(true);
        newAppoinment.setDateOfVisit(Calendar.getInstance().getTime());

        appoinments.put(newAppoinment.getAppoinmentID(), newAppoinment);
        System.out.println(newAppoinment);

        Iterator<Long> iter = appoinments.keySet().iterator();
        Long appoinmentId = 0L;
        while(iter.hasNext()) {
            appoinmentId = iter.next();
            appoinment = appoinments.get(appoinmentId);
            if(appoinment.getPatient()!= null && appoinment.getPatient().getPatientID().equals(patientID)) {
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