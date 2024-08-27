package OOPS;

public class epicGames implements gtaV, ghostWire{
    @Override
    public void gamesDetails() {
        System.out.println("This game is free");
    }
    @Override
    public void gamesStatus() {
        System.out.println("This game is Paid");
    }
}