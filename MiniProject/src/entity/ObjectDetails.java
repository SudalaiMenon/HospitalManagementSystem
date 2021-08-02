package entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ObjectDetails {
    private static Map <Long,Hospital> hospitalMap;

    private static Map<Long,Doctor> doctorMap;
    private static Doctor doctorAravindkumar;
    private static Doctor doctorRamesh;
    private static Doctor doctorVijayaragavan;
    private static Doctor doctorChitraDevi;

    private static Map<Long,Patient> patientMap;
    private static Patient patientRamana;
    private static Patient patientMurugan;
    private static Patient patientLaxmi;
    private static Patient patientLaxmanan;
    private static Patient patientKumaran;

    static {
        hospitalMap = new HashMap();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo Hospital");
        hospital.setHospitalId(1001l);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(1001l, hospital);

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

        doctorMap.put(0001l, doctorAravindkumar);
        doctorMap.put(0002l, doctorRamesh);
        doctorMap.put(0003l, doctorVijayaragavan);
        doctorMap.put(0004l, doctorChitraDevi);

        patientMap = new HashMap<>();
        patientRamana = new Patient();
        patientRamana.setPatientName("Ramana");
        patientRamana.setPatientID(201l);
        patientRamana.setPatientDOB(new Date(2000,12,10));
        patientRamana.setPhoneNumber("9995013779");
        patientRamana.setTypeIpOp("OutPatient");

        patientMurugan = new Patient();
        patientMurugan.setPatientName("Murugan");
        patientMurugan.setPatientID(202l);
        patientMurugan.setPatientDOB(new Date(1997,12,05));
        patientMurugan.setPhoneNumber("8995013779");
        patientMurugan.setTypeIpOp("OutPatient");

        patientLaxmi = new Patient();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(203l);
        patientLaxmi.setPatientDOB(new Date(1995,11,10));
        patientLaxmi.setPhoneNumber("8995013755");
        patientLaxmi.setTypeIpOp("OutPatient");

        patientLaxmanan = new Patient();
        patientLaxmanan.setPatientName("Laxmanan");
        patientLaxmanan.setPatientID(204l);
        patientLaxmanan.setPatientDOB(new Date(2002,05,20));
        patientLaxmanan.setPhoneNumber("7995013750");
        patientLaxmanan.setTypeIpOp("OutPatient");

        patientKumaran = new Patient();
        patientKumaran.setPatientName("Kumaran");
        patientKumaran.setPatientID(205l);
        patientKumaran.setPatientDOB(new Date(1987,02,15));
        patientKumaran.setPhoneNumber("9445013750");
        patientKumaran.setTypeIpOp("OutPatient");

        patientMap.put(201l, patientRamana);
        patientMap.put(202l, patientMurugan);
        patientMap.put(203l, patientLaxmi);
        patientMap.put(204l, patientLaxmanan);
        patientMap.put(205l, patientKumaran);

    }

}
