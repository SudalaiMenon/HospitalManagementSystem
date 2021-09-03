package generatedata;

public class EnumDeclaration {
    enum PatientType {
        IP, OP;
    }

    public static void main(String args[]) {
        PatientType typeInPatient = PatientType.IP;
        PatientType typeOutPatient = PatientType.OP;

    }
}
