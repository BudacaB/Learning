
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        
        Gift book1 = new Gift("A", 2);
        Gift book2 = new Gift("B", 1);
        Gift book3 = new Gift("C", 4);
        
        Package gifts = new Package();
        gifts.addGift(book1);
        gifts.addGift(book2);
        gifts.addGift(book3);
        System.out.println(gifts.totalWeight());

    }
}
