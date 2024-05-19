package Models;

import ENUM.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private int number;
    private City city;
    private String address;
    private String phone_number;

}
