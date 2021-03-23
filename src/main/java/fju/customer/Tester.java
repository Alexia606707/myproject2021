package fju.customer;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("0001", 500);
        System.out.println(customer.id + "\t" + customer.amount + "\t" + customer.getTotal());
        SilverCustomer silverCustomer = new SilverCustomer("1111", 1000);
        System.out.println(silverCustomer.id + "\t" + silverCustomer.amount + "\t" + silverCustomer.getTotal());
    }
}
