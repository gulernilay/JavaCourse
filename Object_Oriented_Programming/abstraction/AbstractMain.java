package Object_Oriented_Programming.abstraction;



public class AbstractMain {
    GameCalculator gc= new WomenGameCalculator();

    public static void main(String[] args) {
        GameCalculator gc= new WomenGameCalculator();
        gc.gameOver();
        gc.hesapla();
        gc.show(4);
    }
}
