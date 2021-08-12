package entity;

import bussinessobject.BedBO;
import bussinessobject.DisplayReport;
import bussinessobject.VisitingInformationBO;

import java.util.*;

public class ObjectMainMethod {
    private static Map<Long, Hospital> hospitalMap;

    private static Map<Long, Doctor> doctorMap;
    private static Doctor doctorAravindkumar;
    private static Doctor doctorRamesh;
    private static Doctor doctorVijayaragavan;
    private static Doctor doctorChitraDevi;

    private static Map<Long, Patient> patientMap;
    private static Patient patientRamana;
    private static Patient patientMurugan;
    private static Patient patientLaxmi;
    private static Patient patientLaxmanan;
    private static Patient patientKumaran;

    private static Map<Long, Appoinment> appoinmentMap;
    private static Appoinment appoinmentOne;
    private static Appoinment appoinmentTwo;
    private static Appoinment appoinmentThree;
    private static Appoinment appoinmentFour;
    private static Appoinment appoinmentFive;
    private static Appoinment appoinmentSix;
    private static Appoinment appoinmentSeven;
    private static Appoinment appoinmentEight;
    private static Appoinment appoinmentNine;
    private static Appoinment appoinmentTen;


    private static Map<Long, Medicine> medicinDetails;
    private static Medicine medicineForCardiology;
    private static Medicine medicineForOrthopedic;
    private static Medicine medicineForCancer;
    private static Medicine medicineForAyurvedha;

    private static Map<Long, VisitingInformation> visitDetails;
    private static VisitingInformation heartCheckup;
    private static VisitingInformation boneCheckup;
    private static VisitingInformation lungsCheckup;
    private static VisitingInformation bodyPainCheckup;

    private static List<Medicine> medicineList;
    private static Medicine medicine;

    private static Map<Long, Ip> inPatient;
    private static Ip patient1;
    private static Ip patient2;
    private static Ip patient3;


    private static  Map<Long, Bed> bedMap;
    private static Bed bedOne;
    private static Bed bedTwo;
    private static Bed bedThree;
    private static Bed bedFour;
    private static Bed bedFive;

    static {
        hospitalMap = new HashMap();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo Hospital");
        hospital.setHospitalId(1001l);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalId(), hospital);

        doctorMap = new HashMap<>();
        doctorAravindkumar = new Doctor();
        doctorAravindkumar.setDoctorName("Dr. AravindKumar");
        doctorAravindkumar.setDoctorID(0001l);
        doctorAravindkumar.setSpecialisation("Cardialogy");

        doctorRamesh = new Doctor();
        doctorRamesh.setDoctorName("Dr. RameshNatarajan");
        doctorRamesh.setDoctorID(0002l);
        doctorRamesh.setSpecialisation("Orthopedics");

        doctorVijayaragavan = new Doctor();
        doctorVijayaragavan.setDoctorName("Dr. Vijayaragavan");
        doctorVijayaragavan.setDoctorID(0003l);
        doctorVijayaragavan.setSpecialisation("Cancer Care");

        doctorChitraDevi = new Doctor();
        doctorChitraDevi.setDoctorName("Dr. ChitraDevi");
        doctorChitraDevi.setDoctorID(0004l);
        doctorChitraDevi.setSpecialisation("Ayurvedha");

        doctorMap = new HashMap<>();
        doctorMap.put(doctorAravindkumar.getDoctorID(), doctorAravindkumar);
        doctorMap.put(doctorRamesh.getDoctorID(), doctorRamesh);
        doctorMap.put(doctorVijayaragavan.getDoctorID(), doctorVijayaragavan);
        doctorMap.put(doctorChitraDevi.getDoctorID(), doctorChitraDevi);

        patientMap = new HashMap<>();
        patientRamana = new Patient();
        patientRamana.setPatientName("Ramana");
        patientRamana.setPatientID(1l);
        patientRamana.setPatientDOB(new Date(2000, 01, 20));
        patientRamana.setPhoneNumber("9995013779");
        patientRamana.setTypeIpOp("OutPatient");

        patientMurugan = new Patient();
        patientMurugan.setPatientName("Murugan");
        patientMurugan.setPatientID(2l);
        patientMurugan.setPatientDOB(new Date(1997, 12, 25));
        patientMurugan.setPhoneNumber("8995013779");
        patientMurugan.setTypeIpOp("OP");

        patientLaxmi = new Patient();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(3l);
        patientLaxmi.setPatientDOB(new Date(1995, 11, 15));
        patientLaxmi.setPhoneNumber("8995013755");
        patientLaxmi.setTypeIpOp("OP");

        patientLaxmanan = new Patient();
        patientLaxmanan.setPatientName("Laxmanan");
        patientLaxmanan.setPatientID(4l);
        patientLaxmanan.setPatientDOB(new Date(2002, 01, 12));
        patientLaxmanan.setPhoneNumber("7995013750");
        patientLaxmanan.setTypeIpOp("OP");

        patientKumaran = new Patient();
        patientKumaran.setPatientName("Kumaran");
        patientKumaran.setPatientID(5l);
        patientKumaran.setPatientDOB(new Date(1987, 10, 18));
        patientKumaran.setPhoneNumber("9445013750");
        patientKumaran.setTypeIpOp("OP");

        patientMap.put(patientRamana.getPatientID(), patientRamana);
        patientMap.put(patientMurugan.getPatientID(), patientMurugan);
        patientMap.put(patientLaxmi.getPatientID(), patientLaxmi);
        patientMap.put(patientLaxmanan.getPatientID(), patientLaxmanan);
        patientMap.put(patientKumaran.getPatientID(), patientKumaran);

        appoinmentOne = new Appoinment();
        appoinmentOne.setAppoinmentID(1l);
        appoinmentOne.setDoctor(doctorMap.get(1l));
        appoinmentOne.setPatient(patientMap.get(1l));
        appoinmentOne.setDateOfVisit(new Date(2021, 06, 10));
        appoinmentOne.setPurposeOfVisit("Chest pain");
        appoinmentOne.setBp(120.5);
        appoinmentOne.setTemperature(89.5);
        appoinmentOne.setIsFirstVisit(true);

        appoinmentTwo = new Appoinment();
        appoinmentTwo.setAppoinmentID(2l);
        appoinmentTwo.setDoctor(doctorMap.get(2l));
        appoinmentTwo.setPatient(patientMap.get(2l));
        appoinmentTwo.setDateOfVisit(new Date(2021, 05, 15));
        appoinmentTwo.setPurposeOfVisit("leg bone cracking");
        appoinmentTwo.setBp(100.5);
        appoinmentTwo.setTemperature(90.00);
        appoinmentTwo.setIsFirstVisit(true);

        appoinmentThree = new Appoinment();
        appoinmentThree.setAppoinmentID(3l);
        appoinmentThree.setDoctor(doctorMap.get(3l));
        appoinmentThree.setPatient(patientMap.get(3l));
        appoinmentThree.setDateOfVisit(new Date(2021, 02, 12));
        appoinmentThree.setPurposeOfVisit("Starting stage of cancer");
        appoinmentThree.setBp(101.00);
        appoinmentThree.setTemperature(96.30);
        appoinmentThree.setIsFirstVisit(true);

        appoinmentFour = new Appoinment();
        appoinmentFour.setAppoinmentID(4l);
        appoinmentFour.setDoctor(doctorMap.get(4l));
        appoinmentFour.setPatient(patientMap.get(2l));
        appoinmentFour.setDateOfVisit(new Date(2021, 7, 29));
        appoinmentFour.setPurposeOfVisit("fever with body pain");
        appoinmentFour.setBp(105.5);
        appoinmentFour.setTemperature(99.00);
        appoinmentFour.setIsFirstVisit(true);

        appoinmentFive = new Appoinment();
        appoinmentFive.setAppoinmentID(5l);
        appoinmentFive.setDoctor(doctorMap.get(5l));
        appoinmentFive.setPatient(patientMap.get(5l));
        appoinmentFive.setDateOfVisit(new Date(2021, 06, 17));
        appoinmentFive.setPurposeOfVisit("Again Chest pain");
        appoinmentFive.setBp(100.5);
        appoinmentFive.setTemperature(90.5);
        appoinmentFive.setIsFirstVisit(true);

        appoinmentSix = new Appoinment();
        appoinmentSix.setAppoinmentID(6l);
        appoinmentSix.setDoctor(doctorMap.get(6l));
        appoinmentSix.setPatient(patientMap.get(2l));
        appoinmentSix.setDateOfVisit(new Date(2021, 06, 16));
        appoinmentSix.setPurposeOfVisit("Again Chest pain");
        appoinmentSix.setBp(100.5);
        appoinmentSix.setTemperature(90.5);
        appoinmentSix.setIsFirstVisit(true);

        appoinmentSeven = new Appoinment();
        appoinmentSeven.setAppoinmentID(7l);
        appoinmentSeven.setDoctor(doctorMap.get(7l));
        appoinmentSeven.setPatient(patientMap.get(7l));
        appoinmentSeven.setDateOfVisit(new Date(2021, 07, 26));
        appoinmentSeven.setPurposeOfVisit("Again Chest pain");
        appoinmentSeven.setBp(98.00);
        appoinmentSeven.setTemperature(90.30);
        appoinmentSeven.setIsFirstVisit(true);

        appoinmentEight = new Appoinment();
        appoinmentEight.setAppoinmentID(8l);
        appoinmentEight.setDoctor(doctorMap.get(8l));
        appoinmentEight.setPatient(patientMap.get(2l));
        appoinmentEight.setDateOfVisit(new Date(2021, 8, 27));
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

        medicineForCardiology = new Medicine();
        medicineForCardiology.setMedicineId(1l);
        medicineForCardiology.setMedicineName("Ecospirin");
        medicineForCardiology.setMedicinePurpose("release heart pain");
        medicineForCardiology.setExpiryDate(new Date(2024, 3, 3));
        medicineForCardiology.setBatchNumber("c1245");

        medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2l);
        medicineForOrthopedic.setMedicineName("Calcium Citrate");
        medicineForOrthopedic.setMedicinePurpose("Joit pain support");
        medicineForOrthopedic.setExpiryDate(new Date(2023, 02, 15));
        medicineForOrthopedic.setBatchNumber("b7545");

        medicineForCancer = new Medicine();
        medicineForCancer.setMedicineId(3l);
        medicineForCancer.setMedicineName("Gifitinib");
        medicineForCancer.setMedicinePurpose("Cancer Chemotherapy medicine");
        medicineForCancer.setExpiryDate(new Date(2022, 12, 20));
        medicineForCancer.setBatchNumber("Dn375");

        medicineForAyurvedha = new Medicine();
        medicineForAyurvedha.setMedicineId(4l);
        medicineForAyurvedha.setMedicineName("Sandhivati");
        medicineForAyurvedha.setMedicinePurpose("Arthiritic and join pain");
        medicineForAyurvedha.setExpiryDate(new Date(2020, 11, 01));
        medicineForAyurvedha.setBatchNumber("ayurved01");


        medicinDetails = new HashMap<>();
        medicinDetails.put(medicineForCardiology.getMedicineId(), medicineForCardiology);
        medicinDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicinDetails.put(medicineForCancer.getMedicineId(), medicineForCancer);
        medicinDetails.put(medicineForAyurvedha.getMedicineId(), medicineForAyurvedha);

        patient1= new Ip();
        patient1.setPatientId(2l);
        patient1.setIpIdentificationNumber(1l);
        patient1.setPatient(patientMurugan);
        patient1.setBed(bedOne);

        patient2 = new Ip();
        patient2.setPatientId(2l);
        patient2.setIpIdentificationNumber(2l);
        patient2.setPatient(patientMurugan);
        patient2.setBed(bedOne);

        patient3 = new Ip();
        patient3.setPatientId(2l);
        patient3.setIpIdentificationNumber(2l);
        patient3.setPatient(patientMurugan);
        patient3.setBed(bedOne);

        inPatient = new HashMap<>();
        inPatient.put(patient1.getPatientId(), patient1);
        inPatient.put(patient2.getPatientId(), patient2);
        inPatient.put(patient3.getPatientId(), patient3);


        bedOne = new Bed();
        bedOne.setBedId(1l);
        bedOne.setBedType("Normal single bed");
        bedOne.setRoomName("A");

        bedTwo = new Bed();
        bedTwo.setBedId(2l);
        bedTwo.setBedType("Normal single bed");
        bedTwo.setRoomName("B");

        bedThree = new Bed();
        bedThree.setBedId(3l);
        bedThree.setBedType("Double bed");
        bedThree.setRoomName("C");

        bedFour = new Bed();
        bedFour.setBedId(4l);
        bedFour.setBedType("Double bed");
        bedFour.setRoomName("D");

        bedFive = new Bed();
        bedFive.setBedId(5l);
        bedFive.setBedType("Double bed with High class" );
        bedFive.setRoomName("E");

        bedMap = new HashMap<>();
        bedMap.put(bedOne.getBedId(), bedOne);
        bedMap.put(bedTwo.getBedId(), bedTwo);
        bedMap.put(bedThree.getBedId(), bedThree);
        bedMap.put(bedFour.getBedId(), bedFour);
        bedMap.put(bedFive.getBedId(), bedFive);
    }

    public static List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(3);
            if (medicinDetails.containsKey(new Long(randomNumber)));
                medicineList.add(medicinDetails.get(new Long(randomNumber)));

        }

        return medicineList;
    }


    static public void populateVisitInformation() {

        heartCheckup = new VisitingInformation();
        heartCheckup.setVisitId(1l);
        heartCheckup.setAppoinment(appoinmentMap.get(1l));
        heartCheckup.setDoctorRecommendation("you feel chest pain visit again immediatly");
        heartCheckup.setFollowUpNeed(true);
        heartCheckup.setMedicinesList(getMedicine());

        boneCheckup = new VisitingInformation();
        boneCheckup.setVisitId(2l);
        boneCheckup.setAppoinment(appoinmentMap.get(4l));
        boneCheckup.setDoctorRecommendation("Dont shake your legs");
        boneCheckup.setFollowUpNeed(true);
        boneCheckup.setMedicinesList(getMedicine());

        lungsCheckup = new VisitingInformation();
        lungsCheckup.setVisitId(3l);
        lungsCheckup.setAppoinment(appoinmentMap.get(6l));
        lungsCheckup.setDoctorRecommendation("you have breath problem and visit again");
        lungsCheckup.setFollowUpNeed(true);
        lungsCheckup.setMedicinesList(getMedicine());

        bodyPainCheckup = new VisitingInformation();
        bodyPainCheckup.setVisitId(4l);
        bodyPainCheckup.setAppoinment(appoinmentMap.get(8l));
        bodyPainCheckup.setDoctorRecommendation("No worries just a fever, take one day rest");
        bodyPainCheckup.setFollowUpNeed(false);
        bodyPainCheckup.setMedicinesList(getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckup.getVisitId(), heartCheckup);
        visitDetails.put(boneCheckup.getVisitId(), boneCheckup);
        visitDetails.put(lungsCheckup.getVisitId(), lungsCheckup);
        visitDetails.put(bodyPainCheckup.getVisitId(), bodyPainCheckup);




    }

    public static void main(String[] args) {
        populateVisitInformation();
        AppoinmentBO appoinmentBO = new AppoinmentBO();

       // Appoinment newAppoinment = appoinmentBO.createAppoinment(2l, patientMap, 3l, doctorMap, appoinmentMap, "Regular checkup");
       // System.out.println(newAppoinment);


        VisitingInformationBO visitingInformationBO = new VisitingInformationBO();
       // VisitingInformation visitingInformation = new VisitingInformation();

        System.out.println(appoinmentMap.get(2l).getPatient());
        try{
            Patient patient = visitingInformationBO.createVisitLogInformation(2l, appoinmentMap, visitDetails,
                    medicineList, "take medicine regularly", true);
            patientMap.put(patient.getPatientID(), patient);
            System.out.println(patient);
           // System.out.println(medicineList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        BedBO bedBO = new BedBO();
        try {
             bedBO.bedAllocateInPatient(2l, patientMap, 2l, bedMap, inPatient, "Normal bed", "A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        DisplayReport displayReport = new DisplayReport();
        displayReport.displayPatientDetails(patientMap, 2l, "Murugan");


        }

    }






