package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager implements InterfaceProduct {
    ArrayList<Product> productArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewProduct() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product addProduct = new Product(id, name, price);
        productArrayList.add(addProduct);

    }

    @Override
    public void editProduct() {

        System.out.println("Nhập id sản phẩm cần sửa: ");
        int editProduct = Integer.parseInt(scanner.nextLine());
        boolean check = true;

        for (int i = 0; i < productArrayList.size(); i++) {

            if (productArrayList.get(i).getId() == editProduct) {

                System.out.println("Sửa giá sản phẩm: ");
                int editPrice = Integer.parseInt(scanner.nextLine());
                productArrayList.get(i).setPriceProdcut(editPrice);

                System.out.println("Sửa tên sản phẩm: ");
                String editName = String.valueOf(scanner.nextLine());
                productArrayList.get(i).setNameProduct(editName);
                check = false;
            }
        }
        if (!check) {
            System.out.println("Không có sản phầm nào cần sửa");
        }
        System.out.println("----------Sau khi đã được sửa---------");
        displayProduct();

    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm muốn xoá: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == idDelete) {
                productArrayList.remove(productArrayList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có sản phầm nào cần xoá");
        }
        displayProduct();
    }

    @Override
    public void displayProduct() {
        for (Product p : productArrayList) {
            System.out.println(p);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm bạn cần tìm");
        String searchName = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getNameProduct().equals(searchName)) {
                System.out.println("Sản phần cần tìm: ");
                System.out.println(productArrayList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("không có sản phẩm cần tìm");
        }
    }

    @Override
    public void increaseProduct() {
        Collections.sort(productArrayList);
        displayProduct();
    }

    @Override
    public void decreaseProduct() {
        ProductComparator productComparator = new ProductComparator();
        productArrayList.sort(productComparator);
        displayProduct();
    }
}
