public class Address {

    String province;
    String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

        public String toString(){
        return "地址是：" +province+city;
    }

}

