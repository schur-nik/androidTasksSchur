package Models;

import ENUM.Country;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producer {
    private String name;
    private Country country;
}
