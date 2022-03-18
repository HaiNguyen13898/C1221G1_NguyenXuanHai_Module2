package case_study.models.person;

public class Employee extends Person {
    private String standard;
    private String position;
    public double salary;

    public Employee() {
    }

    public Employee(String standard, String position, double salary) {
        this.standard = standard;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dayOfBirth, String gender, String identityCard, String phoneNumber, String email, String standard, String position, double salary) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.standard = standard;
        this.position = position;
        this.salary = salary;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", standard='" + standard + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                " }";
    }

    public String writeFileEmployee() {
        return this.getId() + ", " + this.getName() + ", " + this.getDayOfBirth() +
                ", " + this.getGender() + ", " + this.getIdentityCard() + ", " +
                this.getPhoneNumber() + ", " + this.getEmail() + ", " + this.getStandard() +
                ", " + this.getPosition() + ", " + this.getSalary();
    }
}
