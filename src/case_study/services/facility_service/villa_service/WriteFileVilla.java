package case_study.services.facility_service.villa_service;

import case_study.models.facility.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileVilla {
    public static void writeStringListToCSV(Map<Villa, Integer> villaMap, String pathFile, Boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> v : villaMap.entrySet()) {
                bufferedWriter.write(v.getKey().writeFileVilla() + "," + v.getValue());
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
