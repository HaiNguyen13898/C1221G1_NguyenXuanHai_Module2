package case_study.services.facility_service.house_service;

import case_study.models.facility.House;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileHouse {

    public static void writeStringListToCSV(Map<House, Integer> houseMap, String pathFile, Boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House, Integer> h : houseMap.entrySet()) {
                bufferedWriter.write(h.getKey().writeFileHouse() + "," + h.getValue());
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
