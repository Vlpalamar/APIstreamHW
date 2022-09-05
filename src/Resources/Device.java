package Resources;

import lombok.Data;

import java.time.Year;
@Data
public class Device {
    public enum Type{
        phone, forKitchen,
    }
    public enum Color
    {
        green,black,gray,white,rad,blue;
    }


    private String name;
    private int year;
    private int price;
    private  Color color;
    private Type type;

}
