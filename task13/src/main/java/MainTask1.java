import ENUM.City;
import ENUM.Country;
import ENUM.ProductCategory;
import Models.Producer;
import Models.Product;
import Models.Store;
import Services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {
        Producer producer1 = new Producer("Military Electronic", Country.USA);
        Producer producer2 = new Producer("Farm Potatoes", Country.BELARUS);
        Producer producer3 = new Producer("Farm Tomatoes", Country.POLAND);
        Producer producer4 = new Producer("M.E.A.T.", Country.USA);

        Store store1 = new Store(1, City.MINSK, "проспект Независимости, 19", "+375295352949");
        Store store2 = new Store(3, City.WARSAW, "Nowy Swiat, 3", "+48456549290");
        Store store3 = new Store(2, City.MINSK, "улица Пушкина, 63", "+375336622199");


        List<Store> stores1 = new ArrayList<>();
        stores1.add(store1);
        stores1.add(store2);
        stores1.add(store3);
        Product product1 = new Product("Tomat", 15, ProductCategory.FOOD, true, stores1, producer3);

        List<Store> stores2 = new ArrayList<>();
        stores2.add(store1);
        stores2.add(store3);
        Product product2 = new Product("Potatoe", 5, ProductCategory.FOOD, true, stores2, producer2);

        List<Store> stores3 = new ArrayList<>();
        stores3.add(store2);
        Product product3 = new Product("Microchip", 1200, ProductCategory.ELECTRONIC, false, stores3, producer1);

        List<Store> stores4 = new ArrayList<>();
        stores4.add(store2);
        Product product4 = new Product("Binoculars", 300, ProductCategory.ELECTRONIC, false, stores4, producer1);

        List<Store> stores5 = new ArrayList<>();
        stores5.add(store1);
        stores5.add(store2);
        stores5.add(store3);
        Product product5 = new Product("Steak", 40, ProductCategory.FOOD, true, stores5, producer4);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        System.out.println("1) определить самый дорогой и дешевый товар");
        for (Product product : ProductService.getProductOfMinMaxPrice(products)) {
            System.out.println(product.getName()+" "+product.getPrice());
        }

        System.out.println("2) найти все товары которые возможно доставить до покупателя");
        for (Product product : ProductService.getProductsOfCanDelivery(products)) {
            System.out.println(product.getName()+" "+product.isDelivery());
        }

        System.out.println("3) посчитать среднюю стоимость товара указанной категории");
        System.out.println(ProductCategory.FOOD + " = " + ProductService.getAvgCostOfProductCategory(products, ProductCategory.FOOD));

        System.out.println("4) найти все товары определенного производителя");
        for (Product product : ProductService.getProductsOfFindProducer(products, producer1)) {
            System.out.println(product.getName()+" "+product.getProducer());
        }

        System.out.println("5) найти всех названия производителей указанной страны");
        System.out.println(Country.USA + " = " + ProductService.getProducerNameOfFindCountry(products, Country.USA));

        System.out.println("6) найти все магазины конкретного города");
        for (Store store : ProductService.getStoresOfFindCity(products, City.MINSK)) {
            System.out.println(City.MINSK+" "+store.getNumber()+"("+store.getAddress()+")");
        }

        System.out.println("7) найти адрес магазина по указанному номеру телефона");
        System.out.println("+48456549290" + " = " + ProductService.getStoreAddressOfFindPhoneNumber(products, "+48456549290"));

        System.out.println("8) все товары указанного номера магазина");
        for (Product product : ProductService.getProductsOfFindStoreNumber(products, 3)) {
            System.out.println("Store number:3 "+ product.getName());
        }

        System.out.println("9) составить map где ключ это номер магазина, а значение - это номер телефона данного магазина");
        System.out.println(ProductService.getMapOfStoreWithNumberAndPhone(products));

        System.out.println("10) узнать все ли товары указанной категории можно доставить до покупателя");
        System.out.println(ProductCategory.FOOD + " " + ProductService.isAllCanDeliveryOfProductCategory(products, ProductCategory.FOOD));

        System.out.println("11) посчитать количество магазинов");
        System.out.println("Count store: " + ProductService.getCountStore(products));

        System.out.println("12) вывести товары отсортированные по стоимости (от большего к меньшему)");
        for (Product product : ProductService.getProductsOfSortRevers(products)) {
            System.out.println(product.getName()+" "+product.getPrice());
        }
    }

}
