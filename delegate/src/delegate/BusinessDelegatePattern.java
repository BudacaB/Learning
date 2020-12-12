package delegate;

public class BusinessDelegatePattern {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        businessDelegate.setServiceType("One");
        client.doTask();

        businessDelegate.setServiceType("Two");
        client.doTask();
    }
}
