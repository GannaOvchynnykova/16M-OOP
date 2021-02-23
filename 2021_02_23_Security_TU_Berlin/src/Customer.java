public class Customer {
    private String userID;
    private String telNumber;
    private static int count = 1;


    public Customer() {
        this.userID = String.valueOf(count);
        count++;
    }

    public void setUserID() {
        this.userID = "userID" + String.valueOf(count);
        count++;
    }

    public String getUserID(){
        return userID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userID='" + userID + '\'' +
                '}';
    }
}

class CustomerTest{
    public static void main(String[] args) {
        Customer user = new Customer();
        System.out.println(user.getUserID());

        Customer masha = new Customer();
        System.out.println(masha.getUserID());

        Customer oleg = new Customer();
        System.out.println(oleg);
    }
}
