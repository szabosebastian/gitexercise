public class main {
    public static void main(String[] args) {
        Future future = new Future();
        future.future("Dragon");

        Count count = new Count();
        count.count(10);

        Greet.greet("Hello");


        Cheer cheer = new Cheer();
        cheer.cheer("Helló, ", "We are Team awesome!");

        KickMe kickMe = new KickMe();
        kickMe.kick();
    }
}
