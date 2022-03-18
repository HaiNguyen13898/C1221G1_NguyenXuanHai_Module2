package case_study.services.facility_service.room_service;

import case_study.models.facility.Room;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileRoom {
    public static void writeStringListToCSV(Map<Room, Integer> roomMap, String pathFile, Boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> r : roomMap.entrySet()) {
                bufferedWriter.write(r.getKey().writeFileRoom() + "," + r.getValue());
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
