import Resources.Product;

import java.util.ArrayList;

public class Task2 implements Runnable {
    /**
     *Для набора названий продуктов (продукты могут повторяться) нужно:
     * ■ Показать все продукты;
     * ■ Показать все продукты с названием меньше пяти
     * символов;
     * ■ Посчитать сколько раз встречается продукт, чье название ввёл пользователь;
     * ■ Показать все продукты, которые начинаются на заданную букву;
     * ■ Показать все продукты из категории «Молоко».
     */




    private ArrayList<Product> products= new ArrayList<Product>();

    public Task2()
    {


        initializeProducts();
    }

    private  void initializeProducts()
    {
        Product chees= new Product();
        chees.setName("сыр");
        chees.setCategory(Product.Category.Молочные);
        products.add(chees);

        Product butter= new Product();
        butter.setName("масло");
        butter.setCategory(Product.Category.Молочные);
        products.add(butter);

        Product bread= new Product();
        bread.setName("хлеб");
        bread.setCategory(Product.Category.Мучные);
        products.add(bread);

        Product cake= new Product();
        cake.setName("торт");
        cake.setCategory(Product.Category.Кондитерские);
        products.add(cake);

        Product pie= new Product();
        pie.setName("пирог");
        pie.setCategory(Product.Category.Кондитерские);
        products.add(pie);

        Product pie2= new Product();
        pie2.setName("Пирог");
        pie2.setCategory(Product.Category.Кондитерские);
        products.add(pie2);


    }


    @Override
    public void run() {
        showAll();

        showNamesShorterThenSize(5);
        showCountOfInputName("ПиРог");
        showAllFromLetter("П");

        showAllOfCattegory(Product.Category.Молочные);
    }

    private void showAllOfCattegory(Product.Category category) {
        products.stream()
                .filter(x->x.getCategory()==category)
                .forEach(System.out::println);
    }

    public void showNamesShorterThenSize(int size) {
        products.stream()
                .filter(x->x.getName().length()<size)
                .forEach(System.out::println);
    }

    public void showAll()
    {
        products.stream()
                .forEach( System.out::println);

        System.out.println("\n");
    }

    public void showCountOfInputName(String name)
    {
        long count= products.stream()
                .filter(x->x.getName().toLowerCase().equals(name.toLowerCase()))
                .count() ;

        System.out.println(name.toLowerCase()+" встречаеться "+count+" раз");
    }

    public void showAllFromLetter(String ch)
    {
      products.stream()
              .filter(x->x.getName().toLowerCase().charAt(0)==ch.toLowerCase().charAt(0))
              .forEach(System.out::println);
    }




}
