package case_study.models.person;

public class Customer extends Person {
    private String kindsOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String kindsOfCustomer, String address) {
        this.kindsOfCustomer = kindsOfCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dayOfBirth, String gender, String identityCard, String phoneNumber, String email, String kindsOfCustomer, String address) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.kindsOfCustomer = kindsOfCustomer;
        this.address = address;
    }

    public String getKindsOfCustomer() {
        return kindsOfCustomer;
    }

    public void setKindsOfCustomer(String kindsOfCustomer) {
        this.kindsOfCustomer = kindsOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "kindsOfCustomer='" + kindsOfCustomer + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
