package datacollector;

import entity.Appoinment;
import untility.DateUtility;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static datacollector.DoctorData.doctorMap;
import static datacollector.PatientData.patientMap;

public class AppoinmentData {
    public static Map<Long, Appoinment> appoinmentMap;

    static {
        appoinmentMap = new HashMap<>();

        Appoinment appoinment = new Appoinment();
        appoinment.setAppoinmentID(1L);
        appoinment.setDoctor(doctorMap.get(1L));
        appoinment.setPatient(patientMap.get(1L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,1));
        appoinment.setPurposeOfVisit("Chest pain");
        appoinment.setBp(120.5);
        appoinment.setTemperature(89.5);
        appoinment.setIsFirstVisit(true);
        //appoinment.setHospitalId(hospitalMap.get(1L));
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(2L);
        appoinment.setDoctor(doctorMap.get(2L));
        appoinment.setPatient(patientMap.get(2L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,5));
        appoinment.setPurposeOfVisit("leg bone cracking");
        appoinment.setBp(100.5);
        appoinment.setTemperature(90.00);
        appoinment.setIsFirstVisit(true);
        //appoinment.setHospitalId(hospitalMap.get(1L));
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(3L);
        appoinment.setDoctor(doctorMap.get(3L));
        appoinment.setPatient(patientMap.get(2L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,6));
        appoinment.setPurposeOfVisit("Starting stage of cancer");
        appoinment.setBp(101.00);
        appoinment.setTemperature(96.30);
        appoinment.setIsFirstVisit(true);
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(4L);
        appoinment.setDoctor(doctorMap.get(4L));
        appoinment.setPatient(patientMap.get(1L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,10));
        appoinment.setPurposeOfVisit("fever with body pain");
        appoinment.setBp(105.5);
        appoinment.setTemperature(99.00);
        appoinment.setIsFirstVisit(true);
        //appoinment.setHospitalId(hospitalMap.get(1L));
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(5L);
        appoinment.setDoctor(doctorMap.get(5L));
        appoinment.setPatient(patientMap.get(5L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,12));
        appoinment.setPurposeOfVisit("Again Chest pain");
        appoinment.setBp(100.5);
        appoinment.setTemperature(90.5);
        appoinment.setIsFirstVisit(true);
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(6L);
        appoinment.setDoctor(doctorMap.get(5L));
        appoinment.setPatient(patientMap.get(2L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,15));
        appoinment.setPurposeOfVisit("Again Chest pain");
        appoinment.setBp(100.5);
        appoinment.setTemperature(90.5);
        appoinment.setIsFirstVisit(true);
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(7L);
        appoinment.setDoctor(doctorMap.get(1L));
        appoinment.setPatient(patientMap.get(7L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,17));
        appoinment.setPurposeOfVisit("Again Chest pain");
        appoinment.setBp(98.00);
        appoinment.setTemperature(90.30);
        appoinment.setIsFirstVisit(true);
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

        appoinment = new Appoinment();
        appoinment.setAppoinmentID(8L);
        appoinment.setDoctor(doctorMap.get(3L));
        appoinment.setPatient(patientMap.get(2L));
        appoinment.setDateOfVisit(DateUtility.convertDate(2021,8,20));
        appoinment.setPurposeOfVisit("Again Chest pain");
        appoinment.setBp(120.5);
        appoinment.setTemperature(102.5);
        appoinment.setIsFirstVisit(true);
        //appoinment.setHospitalId(hospitalMap.get(1L));
        appoinmentMap.put(appoinment.getAppoinmentID(), appoinment);

    }

}
