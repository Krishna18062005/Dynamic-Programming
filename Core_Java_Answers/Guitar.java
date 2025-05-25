// Exercise 19 (Part 2): Interface Implementation - Guitar Class

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar.");
    }
    
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
    }
}