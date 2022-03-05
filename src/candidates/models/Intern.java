package candidates.models;

public class Intern extends Candidates{
    private String major;
    private String semester;
    private String universityName;


    public Intern() {
    }

    public Intern(int id, String fistName, String lastName, String birthDate, String address, int phoneNumber, String email, String major, String semester, String universityName) {
        super(id, fistName, lastName, birthDate, address, phoneNumber, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                "} " + super.toString();
    }
}
