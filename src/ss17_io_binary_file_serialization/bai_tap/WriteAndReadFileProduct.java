package ss17_io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileProduct {

    public static void writeProduct(List<Product> products) {
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

    public static List<Product> readProduct() {
        List<Product> products = new ArrayList<>();
        File file = new File("src/ss17_io_binary_file_serialization/bai_tap/product.dat");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                products = (List<Product>) objectInputStream.readObject();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if ( fileInputStream!= null){
                    fileInputStream.close();
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return products;
    }
}
