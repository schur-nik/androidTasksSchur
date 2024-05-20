package Services;

import ENUM.City;
import ENUM.Country;
import ENUM.ProductCategory;
import Models.Producer;
import Models.Product;
import Models.Store;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {

    //1) определить самый дорогой и дешевый товар
    public static List<Product> getProductOfMinMaxPrice(List<Product> products) {
        return List.of(products.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(new Product()),
                       products.stream().min(Comparator.comparingDouble(Product::getPrice)).orElse(new Product()));
    }

    //2) найти все товары которые возможно доставить до покупателя
    public static List<Product> getProductsOfCanDelivery(List<Product> products) {
        return products.stream()
                .filter(Product::isDelivery)
                .collect(Collectors.toList());
    }

    //3) посчитать среднюю стоимость товара указанной категории
    public static double getAvgCostOfProductCategory(List<Product> products, ProductCategory category) {
        return products.stream()
                .filter(product -> product.getCategory() == category)
                .map(product -> Float.valueOf(product.getPrice()).doubleValue())
                .mapToDouble(price -> price)
                .average().orElse(0d);
    }

    //4) найти все товары определенного производителя
    public static List<Product> getProductsOfFindProducer(List<Product> products, Producer producer) {
        return products.stream()
                .filter(product -> product.getProducer().equals(producer))
                .collect(Collectors.toList());
    }

    //5) найти всех названия производителей указанной страны
    public static String getProducerNameOfFindCountry(List<Product> products, Country country) {
        return products.stream()
                .filter(product -> product.getProducer().getCountry() == country)
                .map(product -> product.getProducer().getName())
                .collect(Collectors.toSet())
                .toString();
    }

    //6) найти все магазины конкретного города
    public static List<Store> getStoresOfFindCity(List<Product> products, City city) {
        return products.stream()
                .flatMap(product -> product.getStoreAvailability().stream())
                .filter(store -> store.getCity() == city)
                .collect(Collectors.toSet())
                .stream().toList();
    }

    //7) найти адрес магазина по указанному номеру телефона
    public static String getStoreAddressOfFindPhoneNumber(List<Product> products, String phoneNumber) {
        return products.stream()
                 .flatMap(product -> product.getStoreAvailability().stream())
                 .filter(store -> store.getPhone_number().equals(phoneNumber))
                 .map(Store::getAddress)
                 .collect(Collectors.toSet())
                 .toString();
    }

    //8) все товары указанного номера магазина
    public static List<Product> getProductsOfFindStoreNumber(List<Product> products, int storeNumber) {
        Store findStore = products.stream()
                .flatMap(product1 -> product1.getStoreAvailability().stream())
                .filter(store -> store.getNumber() == storeNumber)
                .findFirst().orElseGet(Store::new);
        return products.stream()
                .filter(product -> product.getStoreAvailability()
                .contains(findStore))
                .toList();
    }

    //9) составить map, где ключ это номер магазина, а значение - это номер телефона данного магазина
    public static Map<Integer, String> getMapOfStoreWithNumberAndPhone(List<Product> products) {
        return products.stream()
                .flatMap(product -> product.getStoreAvailability().stream())
                .collect(Collectors.toMap(Store::getNumber, Store::getPhone_number, (oldValue, newValue) -> oldValue));
    }

    //10) узнать все ли товары указанной категории можно доставить до покупателя
    public static boolean isAllCanDeliveryOfProductCategory(List<Product> products, ProductCategory productCategory) {
        return products.stream()
                .filter(product -> product.getCategory() == productCategory)
                .allMatch(Product::isDelivery);
    }

    //11) посчитать количество магазинов
    public static int getCountStore(List<Product> products) {
        return products.stream()
                .flatMap(product -> product.getStoreAvailability().stream())
                .collect(Collectors.toSet())
                .size();
    }

    //12) вывести товары отсортированные по стоимости (от большего к меньшему)
    public static List<Product> getProductsOfSortRevers(List<Product> products) {
        return products.stream()
                .sorted((p1,p2) -> p1.getPrice() == p2.getPrice() ? 0 : p1.getPrice() - p2.getPrice() > 0 ? -1 : 1)
                .toList();
    }
}
