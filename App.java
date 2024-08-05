//swing is a lightweight toolkit for creating java apps
//for creating GUI
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //game window size
        int boardWidth = 360;
        int boardHeight = 640;

        //creats game frame with top name
        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // after clink on X -> exits program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird(); //created object
        frame.add(flappyBird); 
        frame.pack(); // for add frame except topLine
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}
