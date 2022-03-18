package case_study.services.employee_service;

import case_study.models.person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static  void  writeStringListToCSV(List<Employee> stringList, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Employee c : stringList) {
                bufferedWriter.write(c.writeFileEmployee());
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
