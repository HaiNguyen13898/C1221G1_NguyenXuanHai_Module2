package ss17_io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileProduct {

    public static  void writeProduct (List<Product> products){
        File file = new File("src/ss17_io_binary_file_serialization/bai_tap/product.dat");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> readProduct(){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream("src/ss17_io_binary_file_serialization/bai_tap/product.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
