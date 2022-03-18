package case_study.services.employee_service;

import case_study.models.person.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<Employee> readEmployeeFromCSV() {
        List<Employee> employeeArrayList = new ArrayList<>();
        File file = new File("src/case_study/data/employee.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Employee employees = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9]));
                employeeArrayList.add(employees);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeArrayList;
    }
}
