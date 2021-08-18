package hmsmainmethod;


import bussinessobject.AppoinmentBO;
import bussinessobject.InPatientBO;
import displayfollowingreport.DisplayReport;
import bussinessobject.VisitingInformationBO;
import entity.*;

import java.text.ParseException;
import java.util.*;

public class ObjectMainMethod {
    private static Map<Long, Hospital> hospitalMap;

    private static Map<Long, Doctor> doctorMap;

    private static Map<Long, Patient> patientMap;

    private static Map<Long, Appoinment> appoinmentMap;

    private static Map<Long, Medicine> medicinDetails;

    private static Map<Long, VisitingInformation> visitDetails;

    private static List<Medicine> medicineList;

    private static Map<Long, Ip> inPatient;

    private static  Map<Long, Bed> bedMap;

    private static Calendar calendar;

    static {
        hospitalMap = new HashMap();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo Hospital");
        hospital.setHospitalId(1L);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalId(), hospital);

        doctorMap = new HashMap<>();
        Doctor doctorAravindkumar = new Doctor();
        doctorAravindkumar.setDoctorName("Dr. AravindKumar");
        doctorAravindkumar.setDoctorID(1L);
        doctorAravindkumar.setSpecialisation("Cardialogy");

        Doctor doctorRamesh = new Doctor();
        doctorRamesh.setDoctorName("Dr. RameshNatarajan");
        doctorRamesh.setDoctorID(2L);
        doctorRamesh.setSpecialisation("Orthopedics");

        Doctor doctorVijayaragavan = new Doctor();
        doctorVijayaragavan.setDoctorName("Dr. Vijayaragavan");
        doctorVijayaragavan.setDoctorID(3L);
        doctorVijayaragavan.setSpecialisation("Cancer Care");

        Doctor doctorChitraDevi = new Doctor();
        doctorChitraDevi.setDoctorName("Dr. ChitraDevi");
        doctorChitraDevi.setDoctorID(4L);
        doctorChitraDevi.setSpecialisation("Ayurvedha");

        Doctor doctorPremKumar = new Doctor();
        doctorPremKumar.setDoctorName("Dr. PremKumar");
        doctorPremKumar.setDoctorID(5L);
        doctorPremKumar.setSpecialisation("ENT");

        doctorMap = new HashMap<>();
        doctorMap.put(doctorAravindkumar.getDoctorID(), doctorAravindkumar);
        doctorMap.put(doctorRamesh.getDoctorID(), doctorRamesh);
        doctorMap.put(doctorVijayaragavan.getDoctorID(), doctorVijayaragavan);
        doctorMap.put(doctorChitraDevi.getDoctorID(), doctorChitraDevi);

        patientMap = new HashMap<>();
        calendar = Calendar.getInstance();
        calendar.set(1991, 1, 1, 0, 0, 0);
        Date dateOne = calendar.getTime();
        Patient patientRamana = new Patient();
        patientRamana.setPatientName("Ramana");
        patientRamana.setPatientID(1L);
        patientRamana.setPatientDOB(dateOne);
        patientRamana.setPhoneNumber("9995013779");
        patientRamana.setPatientType("OutPatient");

        Patient patientMurugan = new Patient();
        calendar = Calendar.getInstance();
        calendar.set(1995, 5, 15, 0, 0, 0);
        Date dateTwo = calendar.getTime();
        patientMurugan.setPatientName("Murugan");
        patientMurugan.setPatientID(2L);
        patientMurugan.setPatientDOB(dateTwo);
        patientMurugan.setPhoneNumber("8995013779");
        patientMurugan.setPatientType("OP");

        Patient patientLaxmi = new Patient();
        calendar = Calendar.getInstance();
        calendar.set(1995, 5, 15, 0, 0, 0);
        Date dateThree = calendar.getTime();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(3L);
        patientLaxmi.setPatientDOB(dateThree);
        patientLaxmi.setPhoneNumber("8995013755");
        patientLaxmi.setPatientType("OP");

        Patient patientLaxmanan = new Patient();
        calendar = Calendar.getInstance();
        calendar.set(1990, 7, 20, 0, 0, 0);
        Date dateFour = calendar.getTime();
        patientLaxmanan.setPatientName("Laxmanan");
        patientLaxmanan.setPatientID(4L);
        patientLaxmanan.setPatientDOB(dateFour);
        patientLaxmanan.setPhoneNumber("7995013750");
        patientLaxmanan.setPatientType("OP");

        Patient patientKumaran = new Patient();
        calendar = Calendar.getInstance();
        calendar.set(1987, 12, 7, 0, 0, 0);
        Date dateFive = calendar.getTime();
        patientKumaran.setPatientName("Kumaran");
        patientKumaran.setPatientID(5L);
        patientKumaran.setPatientDOB(dateFive);
        patientKumaran.setPhoneNumber("9445013750");
        patientKumaran.setPatientType("OP");

        patientMap.put(patientRamana.getPatientID(), patientRamana);
        patientMap.put(patientMurugan.getPatientID(), patientMurugan);
        patientMap.put(patientLaxmi.getPatientID(), patientLaxmi);
        patientMap.put(patientLaxmanan.getPatientID(), patientLaxmanan);
        patientMap.put(patientKumaran.getPatientID(), patientKumaran);

        Appoinment appoinmentOne = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 1, 10, 0, 0, 0);
        Date appoinmentDateOne = calendar.getTime();
        appoinmentOne.setAppoinmentID(1L);
        appoinmentOne.setDoctor(doctorMap.get(1L));
        appoinmentOne.setPatient(patientMap.get(1L));
        appoinmentOne.setDateOfVisit(appoinmentDateOne);
        appoinmentOne.setPurposeOfVisit("Chest pain");
        appoinmentOne.setBp(120.5);
        appoinmentOne.setTemperature(89.5);
        appoinmentOne.setIsFirstVisit(true);

        Appoinment appoinmentTwo = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 2, 10, 0, 0, 0);
        Date appoinmentDateTwo = calendar.getTime();
        appoinmentTwo.setAppoinmentID(2L);
        appoinmentTwo.setDoctor(doctorMap.get(2L));
        appoinmentTwo.setPatient(patientMap.get(2L));
        appoinmentTwo.setDateOfVisit(appoinmentDateTwo);
        appoinmentTwo.setPurposeOfVisit("leg bone cracking");
        appoinmentTwo.setBp(100.5);
        appoinmentTwo.setTemperature(90.00);
        appoinmentTwo.setIsFirstVisit(true);

        Appoinment appoinmentThree = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 2, 20, 0, 0, 0);
        Date appoinmentDateThree = calendar.getTime();
        appoinmentThree.setAppoinmentID(3L);
        appoinmentThree.setDoctor(doctorMap.get(3L));
        appoinmentThree.setPatient(patientMap.get(3L));
        appoinmentThree.setDateOfVisit(appoinmentDateThree);
        appoinmentThree.setPurposeOfVisit("Starting stage of cancer");
        appoinmentThree.setBp(101.00);
        appoinmentThree.setTemperature(96.30);
        appoinmentThree.setIsFirstVisit(true);

        Appoinment appoinmentFour = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 3, 20, 0, 0, 0);
        Date appoinmentDateFour = calendar.getTime();
        appoinmentFour.setAppoinmentID(4L);
        appoinmentFour.setDoctor(doctorMap.get(4L));
        appoinmentFour.setPatient(patientMap.get(2L));
        appoinmentFour.setDateOfVisit(appoinmentDateFour);
        appoinmentFour.setPurposeOfVisit("fever with body pain");
        appoinmentFour.setBp(105.5);
        appoinmentFour.setTemperature(99.00);
        appoinmentFour.setIsFirstVisit(true);

        Appoinment appoinmentFive = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 5, 10, 0, 0, 0);
        Date appoinmentDateFive = calendar.getTime();
        appoinmentFive.setAppoinmentID(5L);
        appoinmentFive.setDoctor(doctorMap.get(5L));
        appoinmentFive.setPatient(patientMap.get(5L));
        appoinmentFive.setDateOfVisit(appoinmentDateFive);
        appoinmentFive.setPurposeOfVisit("Again Chest pain");
        appoinmentFive.setBp(100.5);
        appoinmentFive.setTemperature(90.5);
        appoinmentFive.setIsFirstVisit(true);

        Appoinment appoinmentSix = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 6, 16, 0, 0, 0);
        Date appoinmentDateSix = calendar.getTime();
        appoinmentSix.setAppoinmentID(6L);
        appoinmentSix.setDoctor(doctorMap.get(6L));
        appoinmentSix.setPatient(patientMap.get(2L));
        appoinmentSix.setDateOfVisit(appoinmentDateSix);
        appoinmentSix.setPurposeOfVisit("Again Chest pain");
        appoinmentSix.setBp(100.5);
        appoinmentSix.setTemperature(90.5);
        appoinmentSix.setIsFirstVisit(true);

        Appoinment appoinmentSeven = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 7, 10, 0, 0, 0);
        Date appoinmentDateSeven = calendar.getTime();
        appoinmentSeven.setAppoinmentID(7L);
        appoinmentSeven.setDoctor(doctorMap.get(7L));
        appoinmentSeven.setPatient(patientMap.get(7L));
        appoinmentSeven.setDateOfVisit(appoinmentDateSeven);
        appoinmentSeven.setPurposeOfVisit("Again Chest pain");
        appoinmentSeven.setBp(98.00);
        appoinmentSeven.setTemperature(90.30);
        appoinmentSeven.setIsFirstVisit(true);

        Appoinment appoinmentEight = new Appoinment();
        calendar = Calendar.getInstance();
        calendar.set(2020, 1, 20, 0, 0, 0);
        Date appoinmentDateEight = calendar.getTime();
        appoinmentEight.setAppoinmentID(8L);
        appoinmentEight.setDoctor(doctorMap.get(8L));
        appoinmentEight.setPatient(patientMap.get(2L));
        appoinmentEight.setDateOfVisit(appoinmentDateEight);
        appoinmentEight.setPurposeOfVisit("Again Chest pain");
        appoinmentEight.setBp(120.5);
        appoinmentEight.setTemperature(102.5);
        appoinmentEight.setIsFirstVisit(true);


        appoinmentMap = new HashMap<>();
        appoinmentMap.put(appoinmentOne.getAppoinmentID(), appoinmentOne);
        appoinmentMap.put(appoinmentTwo.getAppoinmentID(), appoinmentTwo);
        appoinmentMap.put(appoinmentThree.getAppoinmentID(), appoinmentThree);
        appoinmentMap.put(appoinmentFour.getAppoinmentID(), appoinmentFour);
        appoinmentMap.put(appoinmentFive.getAppoinmentID(), appoinmentFive);
        appoinmentMap.put(appoinmentSix.getAppoinmentID(), appoinmentSix);
        appoinmentMap.put(appoinmentSeven.getAppoinmentID(), appoinmentSeven);
        appoinmentMap.put(appoinmentEight.getAppoinmentID(), appoinmentEight);

        Medicine medicineOne = new Medicine();
        medicineOne.setMedicineId(1L);
        medicineOne.setMedicineName("Ecospirin");
        medicineOne.setMedicinePurpose("release heart pain");
        medicineOne.setExpiryDate(new Date(2024/3/ 3));
        medicineOne.setBatchNumber("c1245");

        Medicine medicineTwo = new Medicine();
        medicineTwo.setMedicineId(2L);
        medicineTwo.setMedicineName("Calcium Citrate");
        medicineTwo.setMedicinePurpose("Joit pain support");
        medicineTwo.setExpiryDate(new Date(2023/2/15));
        medicineTwo.setBatchNumber("b7545");

        Medicine medicineThree = new Medicine();
        medicineThree.setMedicineId(3L);
        medicineThree.setMedicineName("Gifitinib");
        medicineThree.setMedicinePurpose("Cancer Chemotherapy medicine");
        medicineThree.setExpiryDate(new Date(2022/12/20));
        medicineThree.setBatchNumber("Dn375");

        Medicine medicineFour = new Medicine();
        medicineFour.setMedicineId(4L);
        medicineFour.setMedicineName("Sandhivati");
        medicineFour.setMedicinePurpose("Arthiritic and join pain");
        medicineFour.setExpiryDate(new Date(2020 / 11));
        medicineFour.setBatchNumber("ayurved01");


        medicinDetails = new HashMap<>();
        medicinDetails.put(medicineOne.getMedicineId(), medicineOne);
        medicinDetails.put(medicineTwo.getMedicineId(), medicineTwo);
        medicinDetails.put(medicineThree.getMedicineId(), medicineThree);
        medicinDetails.put(medicineFour.getMedicineId(), medicineFour);


        Bed bedOne = new Bed();
        bedOne.setBedId(1L);
        bedOne.setBedType("Normal single bed");
        bedOne.setRoomName("A");

        Bed bedTwo = new Bed();
        bedTwo.setBedId(2L);
        bedTwo.setBedType("Normal single bed");
        bedTwo.setRoomName("B");

        Bed bedThree = new Bed();
        bedThree.setBedId(3L);
        bedThree.setBedType("Double bed");
        bedThree.setRoomName("C");

        Bed bedFour = new Bed();
        bedFour.setBedId(4L);
        bedFour.setBedType("Double bed");
        bedFour.setRoomName("D");

        Bed bedFive = new Bed();
        bedFive.setBedId(5L);
        bedFive.setBedType("Double bed with High class" );
        bedFive.setRoomName("E");

        bedMap = new HashMap<>();
        bedMap.put(bedOne.getBedId(), bedOne);
        bedMap.put(bedTwo.getBedId(), bedTwo);
        bedMap.put(bedThree.getBedId(), bedThree);
        bedMap.put(bedFour.getBedId(), bedFour);
        bedMap.put(bedFive.getBedId(), bedFive);


        Ip patient1 = new Ip();
        patient1.setPatientId(1L);
        patient1.setIpIdentificationNumber(1L);
        patient1.setPatient(patientMurugan);
        patient1.setBed(bedMap.get(1L));

        Ip patient2 = new Ip();
        patient2.setPatientId(2L);
        patient2.setIpIdentificationNumber(2L);
        patient2.setPatient(patientMurugan);
        patient2.setBed(bedMap.get(2L));

        Ip patient3 = new Ip();
        patient3.setPatientId(3L);
        patient3.setIpIdentificationNumber(3L);
        patient3.setPatient(patientMurugan);
        patient3.setBed(bedMap.get(3L));

        inPatient = new HashMap<>();
        inPatient.put(patient1.getPatientId(), patient1);
        inPatient.put(patient2.getPatientId(), patient2);
        inPatient.put(patient3.getPatientId(), patient3);

    }

    public static List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 1; i < 3; i++) {
            randomNumber = random.nextInt(3);
            if (medicinDetails.containsKey((long) randomNumber));
            medicineList.add(medicinDetails.get((long) randomNumber));

        }

        return medicineList;
    }


    static public void populateVisitInformation() {

        VisitingInformation heartCheckup = new VisitingInformation();
        heartCheckup.setVisitId(1L);
        heartCheckup.setAppoinment(appoinmentMap.get(1L));
        heartCheckup.setDoctorRecommendation("you feel chest pain visit again immediatly");
        heartCheckup.setFollowUpNeed(true);
        heartCheckup.setMedicinesList(getMedicine());

        VisitingInformation boneCheckup = new VisitingInformation();
        boneCheckup.setVisitId(2L);
        boneCheckup.setAppoinment(appoinmentMap.get(2L));
        boneCheckup.setDoctorRecommendation("Dont shake your legs");
        boneCheckup.setFollowUpNeed(true);
        boneCheckup.setMedicinesList(getMedicine());

        VisitingInformation lungsCheckup = new VisitingInformation();
        lungsCheckup.setVisitId(3L);
        lungsCheckup.setAppoinment(appoinmentMap.get(3L));
        lungsCheckup.setDoctorRecommendation("you have breath problem and visit again");
        lungsCheckup.setFollowUpNeed(true);
        lungsCheckup.setMedicinesList(getMedicine());

        VisitingInformation bodyPainCheckup = new VisitingInformation();
        bodyPainCheckup.setVisitId(4L);
        bodyPainCheckup.setAppoinment(appoinmentMap.get(4L));
        bodyPainCheckup.setDoctorRecommendation("No worries just a fever, take one day rest");
        bodyPainCheckup.setFollowUpNeed(false);
        bodyPainCheckup.setMedicinesList(getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckup.getVisitId(), heartCheckup);
        visitDetails.put(boneCheckup.getVisitId(), boneCheckup);
        visitDetails.put(lungsCheckup.getVisitId(), lungsCheckup);
        visitDetails.put(bodyPainCheckup.getVisitId(), bodyPainCheckup);

    }

    public static void main(String[] args) throws ParseException {
        populateVisitInformation();

        AppoinmentBO appoinmentBO = new AppoinmentBO();
        System.out.println(appoinmentBO.createAppoinment(2L, patientMap, 2L, doctorMap, appoinmentMap, "heartPain"));

        VisitingInformationBO visitingInformationBO = new VisitingInformationBO();
        System.out.println(appoinmentMap.get(2L).getPatient());


        Patient patient = visitingInformationBO.createVisitLogInformation(2L, appoinmentMap, visitDetails,
                medicineList, "take medicine regularly", true);
        patientMap.put(patient.getPatientID(), patient);
        System.out.println(patient);
        // System.out.println(medicineList);


        InPatientBO bedBO = new InPatientBO();
        bedBO.bedAllocateInPatient(2L, patientMap, 2L, bedMap, inPatient, "Normal bed", "A");


        DisplayReport displayReport = new DisplayReport();
        displayReport.displayPatientDetails(patientMap, 2L, "Murugan");

        displayReport.displayListOfVisitPatiendId(visitDetails, 2L);

        displayReport.displayFollowUpVisit(visitDetails);

        displayReport.displayOnlyOutPatient((patientMap));

        displayReport.displayPatientByDoctorId(appoinmentMap, 1L);

        displayReport.displayWhoInPatient(inPatient);

        displayReport.todayVisitPatient(appoinmentMap);

        displayReport.displayDetailsDateRange(visitDetails);

    }

}






