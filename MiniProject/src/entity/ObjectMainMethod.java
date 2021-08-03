package entity;

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
        patientRamana.setPatientID(201l);
        patientRamana.setPatientDOB(new Date(2000, 01, 20));
        patientRamana.setPhoneNumber("9995013779");
        patientRamana.setTypeIpOp("OutPatient");

        patientMurugan = new Patient();
        patientMurugan.setPatientName("Murugan");
        patientMurugan.setPatientID(202l);
        patientMurugan.setPatientDOB(new Date(1997, 12, 25));
        patientMurugan.setPhoneNumber("8995013779");
        patientMurugan.setTypeIpOp("OutPatient");

        patientLaxmi = new Patient();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(203l);
        patientLaxmi.setPatientDOB(new Date(1995, 11, 15));
        patientLaxmi.setPhoneNumber("8995013755");
        patientLaxmi.setTypeIpOp("OutPatient");

        patientLaxmanan = new Patient();
        patientLaxmanan.setPatientName("Laxmanan");
        patientLaxmanan.setPatientID(204l);
        patientLaxmanan.setPatientDOB(new Date(2002, 01, 12));
        patientLaxmanan.setPhoneNumber("7995013750");
        patientLaxmanan.setTypeIpOp("OutPatient");

        patientKumaran = new Patient();
        patientKumaran.setPatientName("Kumaran");
        patientKumaran.setPatientID(205l);
        patientKumaran.setPatientDOB(new Date(1987, 10, 18));
        patientKumaran.setPhoneNumber("9445013750");
        patientKumaran.setTypeIpOp("OutPatient");

        patientMap.put(patientRamana.getPatientID(), patientRamana);
        patientMap.put(patientMurugan.getPatientID(), patientMurugan);
        patientMap.put(patientLaxmi.getPatientID(), patientLaxmi);
        patientMap.put(patientLaxmanan.getPatientID(), patientLaxmanan);
        patientMap.put(patientKumaran.getPatientID(), patientKumaran);

        appoinmentOne = new Appoinment();
        appoinmentOne.setAppoinmentID(1l);
        appoinmentOne.setDoctor(doctorMap.get(0001l));
        appoinmentOne.setPatient(patientMap.get(201l));
        appoinmentOne.setDateOfVisit(new Date(2021, 06, 10));
        appoinmentOne.setPurposeOfVisit("Chest pain");
        appoinmentOne.setBp(120.5);
        appoinmentOne.setTemperature(89.5);
        appoinmentOne.setIsFirstVisit(true);

        appoinmentTwo = new Appoinment();
        appoinmentTwo.setAppoinmentID(2l);
        appoinmentTwo.setDoctor(doctorMap.get(0002l));
        appoinmentTwo.setPatient(patientMap.get(202l));
        appoinmentTwo.setDateOfVisit(new Date(2021, 05, 15));
        appoinmentTwo.setPurposeOfVisit("leg bone cracking");
        appoinmentTwo.setBp(100.5);
        appoinmentTwo.setTemperature(90.00);
        appoinmentTwo.setIsFirstVisit(true);

        appoinmentThree = new Appoinment();
        appoinmentThree.setAppoinmentID(3l);
        appoinmentThree.setDoctor(doctorMap.get(0003l));
        appoinmentThree.setPatient(patientMap.get(203l));
        appoinmentThree.setDateOfVisit(new Date(2021, 02, 02));
        appoinmentThree.setPurposeOfVisit("Starting stage of cancer");
        appoinmentThree.setBp(101.00);
        appoinmentThree.setTemperature(96.30);
        appoinmentThree.setIsFirstVisit(true);

        appoinmentFour = new Appoinment();
        appoinmentFour.setAppoinmentID(4l);
        appoinmentFour.setDoctor(doctorMap.get(0004l));
        appoinmentFour.setPatient(patientMap.get(204l));
        appoinmentFour.setDateOfVisit(new Date(2021, 7, 29));
        appoinmentFour.setPurposeOfVisit("fever with body pain");
        appoinmentFour.setBp(105.5);
        appoinmentFour.setTemperature(99.00);
        appoinmentFour.setIsFirstVisit(true);

        appoinmentFive = new Appoinment();
        appoinmentFive.setAppoinmentID(1l);
        appoinmentFive.setDoctor(doctorMap.get(0001l));
        appoinmentFive.setPatient(patientMap.get(201l));
        appoinmentFive.setDateOfVisit(new Date(2021, 06, 17));
        appoinmentFive.setPurposeOfVisit("Again Chest pain");
        appoinmentFive.setBp(100.5);
        appoinmentFive.setTemperature(90.5);
        appoinmentFive.setIsFirstVisit(true);

        appoinmentSix = new Appoinment();
        appoinmentSix .setAppoinmentID(6l);
        appoinmentSix .setDoctor(doctorMap.get(0001l));
        appoinmentSix .setPatient(patientMap.get(201l));
        appoinmentSix .setDateOfVisit(new Date(2021, 06, 16));
        appoinmentSix .setPurposeOfVisit("Again Chest pain");
        appoinmentSix .setBp(100.5);
        appoinmentSix .setTemperature(90.5);
        appoinmentSix .setIsFirstVisit(true);

        appoinmentSeven = new Appoinment();
        appoinmentSeven .setAppoinmentID(7l);
        appoinmentSeven .setDoctor(doctorMap.get(0001l));
        appoinmentSeven .setPatient(patientMap.get(201l));
        appoinmentSeven .setDateOfVisit(new Date(2021, 07, 26));
        appoinmentSeven .setPurposeOfVisit("Again Chest pain");
        appoinmentSeven .setBp(98.00);
        appoinmentSeven .setTemperature(90.30);
        appoinmentSeven .setIsFirstVisit(true);

        appoinmentFive = new Appoinment();
        appoinmentFive.setAppoinmentID(1l);
        appoinmentFive.setDoctor(doctorMap.get(0001l));
        appoinmentFive.setPatient(patientMap.get(201l));
        appoinmentFive.setDateOfVisit(new Date(2021, 8, 27));
        appoinmentFive.setPurposeOfVisit("Again Chest pain");
        appoinmentFive.setBp(120.5);
        appoinmentFive.setTemperature(102.5);
        appoinmentFive.setIsFirstVisit(false);


        appoinmentMap = new HashMap<>();
        appoinmentMap.put(appoinmentOne.getAppoinmentID(), appoinmentOne);
        appoinmentMap.put(appoinmentTwo.getAppoinmentID(), appoinmentTwo);
        appoinmentMap.put(appoinmentThree.getAppoinmentID(), appoinmentThree);
        appoinmentMap.put(appoinmentFour.getAppoinmentID(), appoinmentFour);

        medicineForCardiology = new Medicine();
        medicineForCardiology.setMedicineId(50l);
        medicineForCardiology.setMedicineName("Ecospirin");
        medicineForCardiology.setMedicinePurpose("release heart pain");
        medicineForCardiology.setExpiryDate(new Date(2024, 3, 3));
        medicineForCardiology.setBatchNumber("c1245");

        medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(51l);
        medicineForOrthopedic.setMedicineName("Calcium Citrate");
        medicineForOrthopedic.setMedicinePurpose("Joit pain support");
        medicineForOrthopedic.setExpiryDate(new Date(2023, 02, 15));
        medicineForOrthopedic.setBatchNumber("b7545");

        medicineForCancer = new Medicine();
        medicineForCancer.setMedicineId(52l);
        medicineForCancer.setMedicineName("Gifitinib");
        medicineForCancer.setMedicinePurpose("Cancer Chemotherapy medicine");
        medicineForCancer.setExpiryDate(new Date(2022, 12, 20));
        medicineForCancer.setBatchNumber("Dn375");

        medicineForAyurvedha = new Medicine();
        medicineForAyurvedha.setMedicineId(53l);
        medicineForAyurvedha.setMedicineName("Sandhivati");
        medicineForAyurvedha.setMedicinePurpose("Arthiritic and join pain");
        medicineForAyurvedha.setExpiryDate(new Date(2020, 11, 01));
        medicineForAyurvedha.setBatchNumber("ayurved01");


        medicinDetails = new HashMap<>();
        medicinDetails.put(medicineForCardiology.getMedicineId(), medicineForCardiology);
        medicinDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicinDetails.put(medicineForCancer.getMedicineId(), medicineForCancer);
        medicinDetails.put(medicineForAyurvedha.getMedicineId(), medicineForAyurvedha);

        /*medicineList = new ArrayList<>();
        for(Map.Entry<Long,Medicine> medicineEntry : medicinDetails.entrySet()) {
            medicine = medicineEntry.getValue();
            //System.out.println(medicine.getMedicineName());
            medicineList.add(medicine);
        }*/
    }

    static public List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(5);
            if (medicinDetails.containsKey(new Long(randomNumber)))
                medicineList.add(medicinDetails.get(new Long(randomNumber)));

        }

        return medicineList;
    }


    static public void populateVisitInformation() {

        heartCheckup = new VisitingInformation();
        heartCheckup.setVisitId(20l);
        heartCheckup.setAppoinment(appoinmentMap.get(1l));
        heartCheckup.setDoctorRecommendation("you feel chest pain visit again immediatly");
        heartCheckup.setFollowUpNeed(true);
        heartCheckup.setMedicines(getMedicine());

        boneCheckup = new VisitingInformation();
        boneCheckup.setVisitId(21l);
        boneCheckup.setAppoinment(appoinmentMap.get(2l));
        boneCheckup.setDoctorRecommendation("Dont shake your legs");
        boneCheckup.setFollowUpNeed(true);
        boneCheckup.setMedicines(getMedicine());

        lungsCheckup = new VisitingInformation();
        lungsCheckup.setVisitId(22l);
        lungsCheckup.setAppoinment(appoinmentMap.get(3l));
        lungsCheckup.setDoctorRecommendation("you have breath problem and visit again");
        lungsCheckup.setFollowUpNeed(true);
        lungsCheckup.setMedicines(getMedicine());

        bodyPainCheckup = new VisitingInformation();
        bodyPainCheckup.setVisitId(23l);
        bodyPainCheckup.setAppoinment(appoinmentMap.get(4l));
        bodyPainCheckup.setDoctorRecommendation("No worries just a fever, take one day rest");
        bodyPainCheckup.setFollowUpNeed(false);
        bodyPainCheckup.setMedicines(getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckup.getVisitId(), heartCheckup);
        visitDetails.put(boneCheckup.getVisitId(), boneCheckup);
        visitDetails.put(lungsCheckup.getVisitId(), lungsCheckup);
        visitDetails.put(bodyPainCheckup.getVisitId(), bodyPainCheckup);
    }
}





