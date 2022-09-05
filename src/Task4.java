import Resources.Projector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task4 implements Runnable {

    ArrayList<Projector> projectors;
   public  Task4()
   {

       projectors= new ArrayList<Projector>();
       Initialize();
   }

    @Override
    public void run() {
       showAll();
       System.out.println("\n");

       ShowAllByProducer(Projector.Producer.Asus);
       System.out.println("\n");

       ShowAllByYear(2019);
       System.out.println("\n");

       ShowAllMoreExpencive(1000);
       System.out.println("\n");

       SortByPriceIncr();
       System.out.println("\n");

       SortByPriceDecr();
       System.out.println("\n");

        SortByYearIncr();
        System.out.println("\n");

        SortByYearDecr();
        System.out.println("\n");
    }

    public void SortByYearDecr() {
        System.out.println("SortByYearDecr: ");
        List<Projector> sortedProjs=
                projectors.stream()
                        .sorted(Comparator.comparingInt(Projector::getYear)
                        .reversed())
                        .toList();

        sortedProjs.stream()
                .forEach(System.out::println);
    }

    public void SortByYearIncr() {
       System.out.println("SortByYearIncr: ");
       List<Projector> sortedProjs=
               projectors.stream()
                       .sorted(Comparator.comparingInt(Projector::getYear))
                       .toList();

        sortedProjs.stream()
                .forEach(System.out::println);
    }

    public void SortByPriceDecr() {
        System.out.println("SortByPriceDecr: ");
        //можно и не добовлять, ради разнообразия
        List<Projector> sortedProjs=
                projectors.stream()
                        .sorted(Comparator.comparingInt(Projector::getPrice)
                        .reversed())
                        .toList();

        sortedProjs.stream()
                .forEach(System.out::println);
    }

    public void SortByPriceIncr() {
       System.out.println("SortByPriceIncr: ");
       //можно и не добовлять, ради разнообразия
        List<Projector> sortedProjs=
       projectors.stream()
               .sorted(Comparator.comparingInt(Projector::getPrice))
               .toList();
        sortedProjs.stream()
                .forEach(System.out::println);

   }

    public void ShowAllMoreExpencive(int price) {
       System.out.println("ShowAllMoreExpencive: "+ price);
       projectors.stream()
               .filter(x->x.getPrice()>price)
               .forEach(System.out::println);

    }

    public void ShowAllByYear(int year) {
        System.out.println("ShowAllByYear: "+ year);
        projectors.stream()
                .filter(x->x.getYear()==year)
                .forEach(System.out::println);
    }


    public void showAll() {
       System.out.println("Show all");
       projectors.stream()
               .forEach(System.out::println);

    }

    public void ShowAllByProducer(Projector.Producer producer) {
       System.out.println("ShowAllByProducer: "+ producer);
       projectors.stream()
               .filter(x->x.getProducer()==producer)
               .forEach(System.out::println);

    }
    private void Initialize()
    {
        Projector p1= new Projector();
        p1.setName("p1");
        p1.setYear(2014);
        p1.setPrice(800);
        p1.setProducer(Projector.Producer.Acer);
        projectors.add(p1);

        Projector p2= new Projector();
        p2.setName("das2");
        p2.setYear(2019);
        p2.setPrice(1100);
        p2.setProducer(Projector.Producer.XiaoMi);
        projectors.add(p2);

        Projector p3= new Projector();
        p3.setName("sas3");
        p3.setYear(2019);
        p3.setPrice(1100);
        p3.setProducer(Projector.Producer.Samsung);
        projectors.add(p3);

        Projector p4= new Projector();
        p4.setName("s23s4");
        p4.setYear(2009);
        p4.setPrice(300);
        p4.setProducer(Projector.Producer.Asus);
        projectors.add(p4);
    }


}
