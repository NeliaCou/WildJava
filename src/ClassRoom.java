public class ClassRoom {

    public static void main(String[] args) {
        Wilder greg = new Wilder("Greg", true);
        Wilder alice = new Wilder("Alice", false);
        Wilder bob = new Wilder("Bob", true);

        System.out.println(greg.whoAmI());
        System.out.println(alice.whoAmI());
        System.out.println(bob.whoAmI());

    }
}