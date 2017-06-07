public class Main {
    public static void main(String[] args) {
        // Test your program here
       
        String word = "carrot";
        Change change1 = new Change('a', 'b');


        Change Change2 = new Change('r', 'x');


        System.out.println(word);
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(change1);
        scandiesAway.addChange(Change2);
        System.out.println(scandiesAway.change(word));
    }
}
