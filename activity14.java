import java.awt.*;
import javax.swing.JFrame;
public class activity14 extends Canvas{
    public static void main(String[] args){
        JFrame frame = new JFrame("Example");
        Canvas canvas = new activity14();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint (Graphics page){
        setBackground(new Color(0,150,255));
        page.setColor(new Color(0,40,0));
        page.fillRect(0, 400, 800, 400);
        page.setColor(new Color(35, 5, 0));
        page.fillRect(385,500,30,300);
        page.setColor(new Color(0,50,0));
        page.fillOval(200,100,400,430);
    }
}
