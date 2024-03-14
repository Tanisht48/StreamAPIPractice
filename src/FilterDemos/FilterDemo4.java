package FilterDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Hp Laptops", 25000));
        productList.add(new Product(2, "Dell Desktop", 30000));
        productList.add(new Product(3, "Lenovo Tablets", 15000));
        productList.add(new Product(4, "Asus Monitors", 5000));
        productList.add(new Product(5, "Acer Keyboards", 1000));
        productList.add(new Product(6, "Samsung Phones", 20000));
        productList.add(new Product(7, "LG Monitors", 4500));
        productList.add(new Product(8, "Sony Headphones", 3000));
        productList.add(new Product(9, "Apple iPhone", 60000));
        productList.add(new Product(10, "Microsoft Surface", 40000));
        productList.add(new Product(11, "Toshiba Laptops", 28000));
        productList.add(new Product(12, "Google Pixel", 35000));
        productList.add(new Product(13, "OnePlus Smartphones", 28000));
        productList.add(new Product(14, "Xiaomi Accessories", 1500));
        productList.add(new Product(15, "Sony PlayStation", 25000));
        productList.add(new Product(16, "HP Printers", 5000));
        productList.add(new Product(17, "Epson Scanners", 3500));
        productList.add(new Product(18, "Canon Cameras", 20000));
        productList.add(new Product(19, "Nikon Lenses", 10000));
        productList.add(new Product(20, "Panasonic TVs", 18000));

        System.out.println(productList);

        List<Product> productList1 = productList.stream().filter(p -> p.getPrice() >= 20000).collect(Collectors.toList());
        List<Product> productList2 = productList.stream().filter(p -> p.getPrice() >= 20000).toList();
        System.out.println(productList1);
        System.out.println(productList2);

       productList.stream().filter(p -> p.getPrice() >= 20000).forEach(p -> System.out.println(p+" "));
        productList.stream().filter(p -> p.getPrice() >= 20000).forEach(System.out::println);

    }
}
