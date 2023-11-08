
public class Main {

    public static void main(String[] args) {
        
        Box box = new Box(10);
        CD cd = new CD("test", "testy", 1999);
        box.add(cd);
        
        Box smallBox = new Box(5);
        CD newCd = new CD("bla", "meh", 2000);
        smallBox.add(newCd);
        
        box.add(smallBox);
        
        System.out.println(box);
    }

}
