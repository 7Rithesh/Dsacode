package OOPS;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Engine obj = new cars();
//        obj.engineCC();
//        obj.price(10);
//        epicGames ep = new epicGames();
//        ep.gamesStatus();
//        ep.gamesDetails();
        Human rithesh = new Human(20, "Rithesh");
        Human twin = (Human) rithesh.clone();
        System.out.println(twin.name + " age is " +twin.age);
    }
}