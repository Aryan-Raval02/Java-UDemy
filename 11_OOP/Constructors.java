class Customer{
    private String custId;
    private String name;
    private String address;
    private String phone;

    public String getAddress() {
        return address;
    }
    public String getCustId() {
        return custId;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    Customer(String custId, String name){
        this.custId = custId;
        this.name = name;
    }
    Customer(String custId, String name, String address, String phone){
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void displayData(){
        System.out.println("Customer Id     : "+getCustId()+"\nCustomer Name    : "+getName()+"\nCustomer Address   : "+getAddress()+"\nCustomer Contact    : "+getPhone());
    }

}


public class Constructors {
    public static void main(String[] args) {
        Customer c =new Customer("AX12", "Aryan Raval");
        Customer c1 =new Customer("AX13", "Kush Raval","Jayambe","+91 7874591247");
        c.displayData();
        c1.displayData();
        c.setAddress("Yamuna");
        c.setPhone("+91 9879449982");

        c.displayData();
    }
}
