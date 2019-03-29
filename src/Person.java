public class Person {

    String name;
    int age;
    Address address;

    String sport() {
        return "我在运动";
    }


    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }



    public String toString() {
        return "名字是："+name+age+" " + address;
    }
}
