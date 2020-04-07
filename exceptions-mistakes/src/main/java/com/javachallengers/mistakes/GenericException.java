package src.main.java.com.javachallengers.mistakes;

public class GenericException {

    public static void main(String[] args) {
        saveCustomer();
    }

    static void saveCustomer() {
        try {
            // Perform logic
            System.out.println(1 / 1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
