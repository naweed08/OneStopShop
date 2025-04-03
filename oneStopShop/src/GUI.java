import javax.swing.*;

public class GUI {

    private JFrame frame = new JFrame();

    public GUI() {
        frame.setTitle("OneStopShop");
        frame.setSize(1100, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu();
        frame.setVisible(true);

    }

    public void menu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu file = new JMenu("File");
        menu.add(file);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);

        JMenu edit = new JMenu("Edit");
        menu.add(edit);
    }

    public static void main(String[] args) {
        new GUI();
    }




}
