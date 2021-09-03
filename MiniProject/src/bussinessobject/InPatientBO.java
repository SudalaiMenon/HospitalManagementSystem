package bussinessobject;

import entity.Bed;
import entity.VisitingInformation;
import untility.IdentificationNumber;
import entity.Ip;
import entity.Patient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class InPatientBO {
public void bedAllocateInPatient(Long patientId, Map<Long, Patient> patientMap, Long bedId, Map<Long, Bed> bedMap)  {
    System.out.println();
    Ip ip = new Ip();

    Patient patient = new Patient();
    if(patientMap.containsKey(patientId)) {
        patient = patientMap.get(patientId);
      //  System.out.println(patient);
    }
    long identificationNumber = patientMap.keySet().size();
    identificationNumber = identificationNumber+1;
    ip.setIpIdentificationNumber(identificationNumber);

    if(patient.getPatientType().equals("IP")) {
        ip.setPatient(patient);
        ip.setBed(bedMap.get(bedId));
    }

    patientMap.put(ip.getIpIdentificationNumber(), patient);
    System.out.println("Inpatient Data:" +patientMap);
}
}

