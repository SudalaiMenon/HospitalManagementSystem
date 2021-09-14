package datacollector;

import entity.Patient;
import untility.DateUtility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class PatientData {
    public static Map<Long, Patient> patientMap;

    static {
        patientMap = new HashMap<>();

        Patient patient = new Patient();
        patient.setPatientName("Ramana");
        patient.setHospitalName("Appollo Hospital");
        patient.setPatientID(1L);
        try {
            patient.setPatientDOB(DateUtility.convertStringToDateEx("2021/08/01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        patient.setPhoneNumber("9995013779");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);


        patient = new Patient();
        patient.setPatientName("Murugan");
        patient.setPatientID(2L);
        patient.setPatientDOB(DateUtility.convertDate(1992,2,5));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("8995013779");
        patient.setPatientType("IP");
        patientMap.put(patient.getPatientID(), patient);

        patient = new Patient();
        patient.setPatientName("Laxmi");
        patient.setPatientID(3L);
        patient.setPatientDOB(DateUtility.convertDate(1995,3,5));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("8995013755");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);

        patient = new Patient();
        patient.setPatientName("Laxmanan");
        patient.setPatientID(4L);
        patient.setPatientDOB(DateUtility.convertDate(1989,12,7));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("7995013750");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);

        patient = new Patient();
        patient.setPatientName("Kumaran");
        patient.setPatientID(5L);
        patient.setPatientDOB(DateUtility.convertDate(1987,12,7));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("9445013750");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);

        patient = new Patient();
        patient.setPatientName("Ram");
        patient.setPatientID(6L);
        patient.setPatientDOB(DateUtility.convertStringToDate("1980/5/6"));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("8995013779");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);

        patient = new Patient();
        patient.setPatientName("Kavin");
        patient.setPatientID(7L);
        patient.setPatientDOB(DateUtility.dateNumberToLetter("1997/5/15"));
        patient.setHospitalName("Appollo Hospital");
        patient.setPhoneNumber("8995013779");
        patient.setPatientType("OP");
        patientMap.put(patient.getPatientID(), patient);
        System.out.println();


    }
}
