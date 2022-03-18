package case_study.services.customer_service;

import case_study.models.person.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCustomer {
    public static List<Customer> readCustomerFromCSV() {
        List<Customer> CustomerArrayList = new ArrayList<>();
        File file = new File("src/case_study/data/customer.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Customer customers = new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                CustomerArrayList.add(customers);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return CustomerArrayList;
    }
}
