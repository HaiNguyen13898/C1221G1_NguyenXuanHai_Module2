package case_study.services.facility_service.villa_service;

import case_study.models.facility.Villa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileVilla {
    public static Map<Villa, Integer> readRoomFromCSV(){
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap();
        File file = new File("src/case_study/data/house.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            String[] arr=null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Villa villas = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                villaIntegerMap.put(villas, Integer.parseInt(arr[8]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerMap ;
    }
}
