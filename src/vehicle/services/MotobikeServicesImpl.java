package vehicle.services;

import vehicle.models.Motorbike;

import java.util.ArrayList;
import java.util.Scanner;

public class MotobikeServicesImpl implements Services {
    ArrayList <Motorbike> motorbikeArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Nhập biển số xe: ");
        String licensePlate = scanner.nextLine();
        System.out.println("Hãng sản xuất: ");
        String automaker = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ xe: ");
        String ownerCar = scanner.nextLine();
        System.out.println("Nhập công suất của xe: ");
        int powers = Integer.parseInt(scanner.nextLine());
        Motorbike moto = new Motorbike (licensePlate, automaker, yearOfManufacture, ownerCar, powers);
        motorbikeArrayList.add(moto);
    }

    @Override
    public void display() {
        for (Motorbike moto : motorbikeArrayList) {
            System.out.println(moto);
        }
    }

    @Override
    public void remove() {
        System.out.println("-----Danh sách xe ban đầu------");
        display();
        System.out.println("Nhập biển số xe cần xoá: ");
        String removeMoto = scanner.nextLine();
        for (int i = 0; i < motorbikeArrayList.size(); i++) {
            if (motorbikeArrayList.get(i).getLicensePlates().equals(removeMoto)){
                motorbikeArrayList.remove(motorbikeArrayList.get(i));
            }
        }
        System.out.println("-----Danh sách sau khi được xoá------");
        display();
    }
}
