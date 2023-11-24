
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        
        Person test = new Person("bla", Education.BA);
        Employees emp = new Employees();
        
        emp.add(test);
        
        emp.print(Education.BA);
    }
}
