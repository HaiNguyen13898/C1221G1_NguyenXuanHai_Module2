package case_study.models.contract;

import case_study.models.booking.Booking;
import case_study.models.person.Customer;

public class Contract {
    private int idContract;
    private Booking idBooking;
    private double deposit;
    private double totalPay;
    private Customer idCustomer;

    public Contract() {
    }

    public Contract(int idContract, Booking idBooking, double deposit, double totalPay, Customer idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPay = totalPay;
        this.idCustomer = idCustomer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalPay=" + totalPay +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
