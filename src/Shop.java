public class Shop {
    {
        name = "Hola";
        System.out.println("Step 1" + this.name);
    }
    String name;
    static {
        System.out.println("step 2");
    }
    public static void main(String... args) {
        Shop n = new Shop();
//        System.out.println("Step 2");
//        {
//            System.out.println("Step 3");
//        }

        int a = 500;
        byte b = 50;
        a = a + b;
    }
}
