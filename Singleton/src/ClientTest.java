public class ClientTest {
    public static void main(String[] args) {
       EageInitialization eager1 = EageInitialization.getInstance();
       eager1.setName("John");
        System.out.println(eager1.getName());
       EageInitialization eager2 = EageInitialization.getInstance();
        System.out.println(eager2.getName());
        //Both output are John. So, it just keeps only permanent value

    }
}
