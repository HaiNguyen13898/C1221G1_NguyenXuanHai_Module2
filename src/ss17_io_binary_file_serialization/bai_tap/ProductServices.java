package ss17_io_binary_file_serialization.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServices {


    static List<Product> productList = new ArrayList<>();


//    static {
//        productList = WriteAndReadFileProduct.readProduct();
//    }


    static Scanner scanner = new Scanner(System.in);

    public static void add() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String nameP = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        String priceP = scanner.nextLine();
        Product products = new Product(id, nameP, manufacturer, priceP);
        productList = WriteAndReadFileProduct.readProduct();
        productList.add(products);
        WriteAndReadFileProduct.writeProduct(productList);


    }


    public static void display() {
        productList = WriteAndReadFileProduct.readProduct();
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((1 + i) + "." + productList.get(i));
        }
    }

}
