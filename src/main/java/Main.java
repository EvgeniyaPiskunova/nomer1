import org.apache.commons.lang3.StringUtils;
import org.home.abs.Cat;
import org.home.abs.Dog;

public class Main {

    public static void main(String[] args) {
        System.out.println(StringUtils.capitalize("sergey"));
        numberTest();
        simpleTest();
        nullTest();
        emptyTest();


       // public static void test()
//        System.out.println("Sergey!!!".equals(
//                pad("Sergey", 10,"!")
//        ));


        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sayYourName();
        dog.sayYourName();
    }

    static int pad(String sergey, int i, String s) {
        throw new RuntimeException("Durak");
        //return i;
    }

    public static void simpleTest() {
        System.out.println(
                "Sergey".equals(StringUtils.capitalize("sergey")));
    }

    public static void numberTest() {
        System.out.println(
                "12345".equals(StringUtils.capitalize("12345")));
    }

    public static void nullTest() {
        System.out.println(
                null == StringUtils.capitalize(null));
    }
    public static void emptyTest() {
        System.out.println(
                " ".equals( StringUtils.capitalize(" ")));
    }

}