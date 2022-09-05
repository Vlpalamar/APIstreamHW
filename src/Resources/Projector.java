package Resources;

import lombok.Data;

@Data
public class Projector
{
    public enum Producer
    {Asus, Samsung, XiaoMi, Acer }

    private String name;
    private int year;
    private int price;
    private Producer producer;
}
