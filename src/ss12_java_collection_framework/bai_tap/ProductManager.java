package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Nhập id sản phẩm: ");
        int idProduct = scanner.nextInt();

        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Nhập giá tiền sản phẩm: ");
        double price = scanner.nextDouble();

        Product products = new Product(idProduct, nameProduct, price);
        productList.add(products);
    }


    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

   // Từ từ tới phần mấy chức năng sủa xoá em thấy rồi rối kiểu gì á
}
