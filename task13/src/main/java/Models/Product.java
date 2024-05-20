package Models;

import ENUM.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private float price;
    private ProductCategory category;
    private boolean delivery;
    private List<Store> storeAvailability;
    private Producer producer;
}
