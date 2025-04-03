import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GUI {

    private JFrame frame = new JFrame();

    public GUI() {
        frame.setTitle("OneStopShop");
        frame.setSize(1100, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        menu();

        //------- Center Panel -----------------
        DefaultTableModel tableModel;
        String[] columns = {"Description", "Quantity", "Price", "Subtotal"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        //------- Bottom Total Panel -----------
        JPanel totalPanel = new JPanel(new GridLayout(2, 1));
        totalPanel.add(new JLabel("Total"));
        totalPanel.add(totalPanel, BorderLayout.SOUTH);


        JPanel panelC = new JPanel();
        panelC.setBackground(Color.lightGray);

        //------- Center Panel Headers ---------
        JPanel headerPanel = new JPanel(new GridLayout(1,4));
        headerPanel.add(new JLabel("Description"));
        headerPanel.add(new JLabel("Price"));
        headerPanel.add(new JLabel("Quantity"));
        headerPanel.add(new JLabel("Subtotal"));
        panelC.add(headerPanel, BorderLayout.NORTH);

        //------- East Buttons Panel -----------
        JPanel panelE = new JPanel();
        panelE.setLayout(new GridLayout(4, 1, 4, 4));
        panelE.setBackground(Color.ORANGE);
        panelE.add(new JButton("Vegetables"));
        panelE.add(new JButton("Fruits"));
        panelE.add(new JButton("Drinks"));
        panelE.add(new JButton("Tobacco"));

        //------- South Total Panel ------------
        JPanel panelS = new JPanel(new BorderLayout());
        panelS.setBackground(Color.BLUE);

        //------- Discount Buttons on left -----
        JPanel discountPanel = new JPanel(new GridLayout(1, 2));
        discountPanel.add(new JButton("Staff Discount"));
        discountPanel.add(new JButton("Blue light discount"));
        panelS.add(discountPanel, BorderLayout.CENTER);

        //------- Numeric keypad to right ------
        JPanel numPad = new JPanel(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            numPad.add(new JButton(String.valueOf(i)));
        }
        numPad.add(new JButton("0"));
        numPad.add(new JButton("."));
        numPad.add(new JButton("->"));
        panelS.add(numPad, BorderLayout.EAST);

        //------- Set panels to frame ----------
        frame.add(panelC, BorderLayout.CENTER);
        frame.add(panelE, BorderLayout.EAST);
        frame.add(panelS, BorderLayout.SOUTH);

        panelC.setPreferredSize(new Dimension(300,400));
        panelE.setPreferredSize(new Dimension(450,600));
        panelS.setPreferredSize(new Dimension(600,300));

        frame.setVisible(true);

    }

    public void menu(){
        JMenuBar menu = new JMenuBar();
        menu.setLayout(new BorderLayout());

        JPanel menuToLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        menu.add(file);
        menu.add(edit);
        menu.add(menuToLeft, BorderLayout.WEST);

        //------ Center user and date info -----
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        JLabel centerDateLabel = new JLabel("[naweed - " + formattedDate + "]");
        centerDateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        menu.add(centerDateLabel, BorderLayout.CENTER);

        //------- Log in Button ----------------
        JButton login = new JButton("Log in");
        JPanel menuRightSide = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        menuRightSide.add(login);
        menu.add(menuRightSide, BorderLayout.EAST);

        frame.setJMenuBar(menu);
    }

    public static void main(String[] args) {
        new GUI();
    }




}
