

public class Main {

    public static void main(String[] args) {
        Address nanchang = new Address("江西", "南昌");
        Address ganzhou = new Address("江西","赣州");


        Person zhang = new Person("张",  50,ganzhou);
        System.out.println(zhang);



        Person li = new Person("李", 18 , ganzhou);
        System.out.println(li);



    }
}
