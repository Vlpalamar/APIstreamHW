import Resources.Device;

import java.util.ArrayList;

public class Task3 implements Runnable{

    ArrayList<Device> devices;
    public Task3(){
        devices= new ArrayList<Device>();
        InitializeDevices();
    }

    private void InitializeDevices() {

        Device phone1= new Device();
        phone1.setColor(Device.Color.black);
        phone1.setName("top phone");
        phone1.setYear(2003);
        phone1.setType(Device.Type.phone);
        phone1.setPrice(2000);
        devices.add(phone1);

        Device phone2= new Device();
        phone2.setColor(Device.Color.green);
        phone2.setName("top2 phone");
        phone2.setYear(2022);
        phone2.setType(Device.Type.phone);
        phone2.setPrice(1200);
        devices.add(phone2);

        Device microwave= new Device();
        microwave.setColor(Device.Color.white);
        microwave.setName("microwave");
        microwave.setYear(2014);
        microwave.setType(Device.Type.forKitchen);
        microwave.setPrice(700);
        devices.add(microwave);

        Device fridge= new Device();
        fridge.setColor(Device.Color.gray);
        fridge.setName("fridge");
        fridge.setYear(1999);
        fridge.setType(Device.Type.forKitchen);
        fridge.setPrice(4300);
        devices.add(fridge);
    }

    @Override
    public void run() {
        System.out.println("All: ");
        showAll();
        System.out.println("\n\n");



        showAllByColor(Device.Color.green);
        System.out.println("\n\n");

        showAllByYear(2003);
        System.out.println("\n\n");

        showAllMoreExpensiveThan(1488);
        System.out.println("\n\n");

        showAllByType(Device.Type.forKitchen);
        System.out.println("\n\n");

        showAllInRange(2010, 2222);
        System.out.println("\n\n");
    }

    public void showAll() {
        devices.stream()
                .forEach(System.out::println);
    }

    public void showAllByColor(Device.Color color)
    {
        System.out.println("showAllByColor: "+ color);
        devices.stream()
                .filter(x->x.getColor()==color)
                .forEach(System.out::println);

    }

    public void showAllByYear(int year)
    {
        System.out.println("showAllByYear:"+ year);
        devices.stream()
                .filter(x->x.getYear()==year)
                .forEach(System.out::println);
    }

    public void showAllMoreExpensiveThan(int price)
    {
        System.out.println("showAllMoreExpensiveThan: "+price);
        devices.stream()
                .filter(x->x.getPrice()>price)
                .forEach(System.out::println);

    }

    public void showAllByType(Device.Type type)
    {
        System.out.println("showAllByType: "+type+"");
        devices.stream()
                .filter(x->x.getType()==type)
                .forEach(System.out::println);
    }

    public void showAllInRange(int from, int to)
    {
        System.out.printf("showAllInRange: %d to %d\n", from,to);

        devices.stream()
                .filter(x->x.getYear()>from && x.getYear()<to)
                .forEach(System.out::println);
    }


}
