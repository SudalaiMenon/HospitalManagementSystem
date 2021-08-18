package displayfollowingreport;

import entity.Appoinment;
import entity.Ip;
import entity.Patient;
import entity.VisitingInformation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

    }

public void displayListOfVisitPatiendId(Map<Long, VisitingInformation> visitingInformationMap, Long patientId) {
        VisitingInformation visitingInformation = new VisitingInformation();
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        while(iterator.hasNext()) {
            visitingInformation = visitingInformationMap.get(iterator.next());
            if(visitingInformation.getAppoinment().getPatient().getPatientID() == patientId);
            System.out.println("Display the list of visit for the patient id: "+visitingInformation);
            break;
        }
    }

    public void displayFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap) {
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        while(iterator.hasNext()) {
            VisitingInformation whoNeedFollowUp = visitingInformationMap.get(iterator.next());
            if(whoNeedFollowUp.getFollowUpNeed() == true) {
                System.out.println("Display the list of patient who needs the followup visit:" + whoNeedFollowUp.getAppoinment().getPatient());
                break;
            }
        }
    }

    public void displayOnlyOutPatient(Map<Long, Patient> patientMap) {
        Patient patient = new Patient();
        Iterator<Long> iterator = patientMap.keySet().iterator();
        while (iterator.hasNext()) {
            patient = patientMap.get(iterator.next());
            if(patient.getPatientType().equals("OP")) {
                System.out.println("Display only the out-patient: " + patient);
                break;
            }
        }
    }

    public void displayPatientByDoctorId(Map<Long, Appoinment> appoinmentMap, Long doctorId) {
        Iterator<Long> iterator = appoinmentMap.keySet().iterator();
        while(iterator.hasNext()) {
            Appoinment appoinment = appoinmentMap.get(iterator.next());
            if(appoinment.getDoctor().getDoctorID() == doctorId) {
                System.out.println("Display the list of patient by doctor id(0001l): " +appoinment.getPatient());
                break;
            }
        }
    }

    public void displayWhoInPatient(Map<Long, Ip> ipMap) {
        Iterator<Long> iterator = ipMap.keySet().iterator();
        Ip ip;
        while(iterator.hasNext()) {
            ip = ipMap.get(iterator.next());
            System.out.println("Display all patient who are in-patient: " +ip.getPatient());
            break;
        }
    }

    public void todayVisitPatient(Map<Long, Appoinment> appoinmentMap) {
        Appoinment todayVisit;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOne = new SimpleDateFormat("dd/MM/yyyy");

        for (Long appoinmentId : appoinmentMap.keySet()) {
            todayVisit = appoinmentMap.get(appoinmentId);
            Date date = todayVisit.getDateOfVisit();
           //  System.out.println(date);
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormatOne.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println("Display the today’s visited patient :" + todayVisit.getPatient());
                break;
            }
        }
    }
    public void displayDetailsDateRange(Map<Long, VisitingInformation> visitInformationMap) throws ParseException {
        VisitingInformation visitRange;
        System.out.println("Display the visit details for given date range:");
        for(Long visitId : visitInformationMap.keySet()) {
            visitRange = visitInformationMap.get(visitId);
            Date dates = visitRange.getAppoinment().getDateOfVisit();

           // Date date = new SimpleDateFormat("yyyy/MM/dd").parse(simpleDateFormat.format(dates));
            // System.out.println(dates);
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2020/1/10");
                Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2020/5/10");
                if(dates.after(startDate) && (dates.before(endDate)))
                {
                    System.out.println(visitRange);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
