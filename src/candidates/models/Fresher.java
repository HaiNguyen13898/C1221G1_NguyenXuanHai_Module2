package candidates.models;

public class Fresher extends  Candidates {
    private String graduationDate;
    private String graduationRank;
    private String education;
    public final int fresher = 1;

    public Fresher() {
    }

    public Fresher(int id, String fistName, String lastName, String birthDate, String address, int phoneNumber, String email, String graduationDate, String graduationRank, String education) {
        super(id, fistName, lastName, birthDate, address, phoneNumber, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                "} " + super.toString();
    }
}


