package ss17_io_binary_file_serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String manufacturer;
    private String priceProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, String manufacturer, String priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                '}';
    }
}
