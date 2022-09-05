package Resources;

import lombok.Data;


@Data
public class Product {

    public enum Category {
        Молочные, Мучные, Кондитерские

    }

    private String name;
    private Category category;
}
