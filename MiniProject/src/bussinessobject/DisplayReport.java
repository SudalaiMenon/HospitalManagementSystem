package bussinessobject;

import entity.Patient;

import java.util.Iterator;
import java.util.Map;

public class DisplayReport {
    public void displayPatientDetails(Map<Long, Patient> patientDetails, Long patientId, String patientName)  {
        Patient patient = new Patient();
        if (patientDetails.containsKey((patientId))) {
            patient = patientDetails.get(patientId);
        }

        Iterator<Long> iterator = patientDetails.keySet().iterator();

        while (iterator.hasNext()) {
            patient.getPatientName().equals(iterator.next());
            if (patient.getPatientName().equals(patientName)) {
                System.out.println("Display the patient details report :" +patient);
                break;
            }

        }
        System.out.println("");
    }
}
