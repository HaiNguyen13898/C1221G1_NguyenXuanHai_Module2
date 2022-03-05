package candidates.models;

public class Experience extends Candidates{
    private String expInYear;
    private String proSkill;


    public Experience() {
    }

    public Experience(int id, String fistName, String lastName, String birthDate, String address, int phoneNumber, String email, String expInYear, String proSkill) {
        super(id, fistName, lastName, birthDate, address, phoneNumber, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear='" + expInYear + '\'' +
                ", proSkill='" + proSkill + '\'' +
                "} " + super.toString();
    }
}