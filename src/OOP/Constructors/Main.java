package OOP.Constructors;

public class Main {
    public static void main(String[] args) {
//        Test
//        first cus
    VipCustomer customer1 = new VipCustomer("James",50.00,"abc@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());
        VipCustomer customer2 = new VipCustomer();
        System.out.println(customer2.getName());
        VipCustomer cusotmer3 = new VipCustomer("Alex",50.00);
        System.out.println(cusotmer3.getName());
    }

}
