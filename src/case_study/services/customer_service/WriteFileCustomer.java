package case_study.services.customer_service;

import case_study.models.person.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer {
    public static   void  writeStringListToCSV(List<Customer> stringList, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Customer c : stringList) {
                bufferedWriter.write(c.WriteFileCustomer());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
