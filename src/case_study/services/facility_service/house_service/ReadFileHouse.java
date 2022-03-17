package case_study.services.facility_service.house_service;

import case_study.models.facility.House;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileHouse {
    public  List<House> readHouseFromCSV(){
        List<House> houseArrayList = new ArrayList<>();
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
                House houses = new House(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]));
                houseArrayList.add(houses);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseArrayList ;
    }
}
