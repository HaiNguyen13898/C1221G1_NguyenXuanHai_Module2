package vehicle.services;

import vehicle.models.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServicesImpl implements Services {
    ArrayList<Car> carArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Nhập biển số xe: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String automaker = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên chủ xe: ");
        String ownerCar = scanner.nextLine();
        System.out.print("Nhập số ghế: ");
        int numberSeats = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String carTypes = scanner.nextLine();
        Car cars = new Car(licensePlate, automaker, yearOfManufacture, ownerCar, numberSeats, carTypes);
        carArrayList.add(cars);
    }

    @Override
    public void display() {
        for (Car cars : carArrayList) {
            System.out.println(cars);
        }
    }

    @Override
    public void remove() {
        System.out.println("-----Danh sách xe ban đầu------");
        display();
        System.out.println("Nhập biển số xe cần xoá: ");
        String removeMoto = scanner.nextLine();
        for (int i = 0; i < carArrayList.size(); i++) {
            if (carArrayList.get(i).getLicensePlates().equals(removeMoto)){
                carArrayList.remove(carArrayList.get(i));
            }
        }
        System.out.println("-----Danh sách sau khi được xoá------");
        display();

    }
}
