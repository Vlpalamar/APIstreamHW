import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 implements  Runnable{

    /**
    *Для набора случайно сгенерированных целых чисел
нужно:
■ Количество положительных;
■ Количество отрицательных;
■ Количество двухзначных;
■ Количество зеркальных чисел. Например, 121 или 4224
     */


    private Random rand= new Random();
    private ArrayList<Integer> arr= new ArrayList<Integer>();

    public Task1(int min, int max, int size)
    {
        for (int i = 0; i < size; i++) {
            arr.add(rand.nextInt(min,max));

        }

    }


    public void showAll()
    {System.out.println(arr+"\n\n");}

    @Override
    public void run() {
        showAll();

        showPosCount();
        showNegCount();
        showTwoDigitCount();
        showMirrorCount();

    }


    public void showPosCount()
    {
        long posCount = 0;
        posCount= arr.stream()
                .filter(x -> x>0)
                .count();

        System.out.println("posCount: "+posCount);
    }

    public void showNegCount()
    {
        long negCount= 0;
        negCount= arr.stream()
                .filter(x -> x<0)
                .count();

        System.out.println("negCount: "+negCount);
    }

    public  void showTwoDigitCount()
    {
        long twoDigitCount= 0;
        twoDigitCount= arr.stream()
                .filter(x->x>9)
                .filter(x->x<100)
                .count() +
                       arr.stream()
                .filter(x->x<-9)
                .filter(x->x>-100)
                .count() ;

        System.out.println("twoDigitCount: "+twoDigitCount);
    }

    public void showMirrorCount()
    {
        long mirrorCount= 0;
        mirrorCount= arr.stream()
                .filter(x->isMirror(x))
                .count();

        System.out.println("mirrorCount: "+mirrorCount);
    }


    private boolean isMirror(int number)
    {
        if (number<0) number*=-1;
        String str="";
        str+=number;

        if (str.equals(new StringBuilder(str).reverse().toString()))
            return true;
        else
            return false;
    }
}
