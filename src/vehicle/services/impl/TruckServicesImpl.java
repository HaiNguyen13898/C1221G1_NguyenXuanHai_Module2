package vehicle.services.impl;

import vehicle.models.Truck;
import vehicle.services.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServicesImpl implements Services {
    ArrayList<Truck> truckArrayList = new ArrayList<>();
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
        System.out.println("Nhập trọng tải của xe: ");
        double vehiclesLoad = Integer.parseInt(scanner.nextLine());
        Truck trucks = new Truck(licensePlate, automaker, yearOfManufacture, ownerCar, vehiclesLoad);
        truckArrayList.add(trucks);
    }

    @Override
    public void display() {
        for (Truck tr : truckArrayList) {
            System.out.println(tr);
        }

    }

    @Override
    public void remove() {
        System.out.println("-----Danh sách xe ban đầu------");
        display();
        System.out.println("Nhập biển số xe cần xoá: ");
        String removeMoto = scanner.nextLine();
        for (int i = 0; i < truckArrayList.size(); i++) {
            if (truckArrayList.get(i).getLicensePlates().equals(removeMoto)){
                truckArrayList.remove(truckArrayList.get(i));
            }
        }
        System.out.println("-----Danh sách sau khi được xoá------");
        display();

    }
}
