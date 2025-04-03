import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GUI {

    private JFrame frame;
    DefaultTableModel tableModel;
    private JLabel totalLabel;

    private Inventory inventory;
    private TillSystem till;

    public GUI() {
        inventory = new Inventory();
        till = new TillSystem();
        preLoadItems();

        frame = new JFrame();
        frame.setTitle("OneStopShop");
        frame.setSize(1100, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        menu();
        generateLayout();

        frame.setVisible(true);
    }

    private void preLoadItems() {
        inventory.addProduct(new Product("Banana", 0.99, 1, LocalDate.now().plusDays(5)));
        inventory.addProduct(new Product("Apple", 1.49, 1, LocalDate.now().plusDays(6)));
        inventory.addProduct(new Product("Coke", 1.99, 1, LocalDate.now().plusMonths(3)));
        inventory.addProduct(new Product("Cigarettes", 10.00, 1, LocalDate.now().plusYears(1)));
    }

    public void menu(){
        JMenuBar menu = new JMenuBar();
        menu.setLayout(new BorderLayout());

        // Left of menu
        JPanel menuToLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        menu.add(file);
        menu.add(edit);
        menu.add(menuToLeft, BorderLayout.WEST);

        //------ Center user and date info -----
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        JLabel centerDateLabel = new JLabel("[naweed - " + today + "]");
        centerDateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        menu.add(centerDateLabel, BorderLayout.CENTER);

        //------- Log in Button ----------------
        JPanel menuRightSide = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        menuRightSide.add(new JButton("Log in"));
        menu.add(menuRightSide, BorderLayout.EAST);

        frame.setJMenuBar(menu);
    }

    private void generateLayout() {
        //------- Center Panel -----------------
        String[] columns = {"Description", "Quantity", "Price", "Subtotal"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panelC = new JPanel(new BorderLayout());
        panelC.add(scrollPane, BorderLayout.CENTER);

        //------- Bottom Total Panel -----------
        JPanel totalPanel = new JPanel(new BorderLayout());
        totalPanel.add(new JLabel("Total"), BorderLayout.WEST);
        totalLabel = new JLabel("£0.00", SwingConstants.RIGHT);
        totalPanel.add(totalLabel, BorderLayout.EAST);
        panelC.add(totalPanel, BorderLayout.SOUTH);

        //------- East Buttons Panel -----------
        JPanel panelE = new JPanel(new GridLayout(3, 2, 10, 10));
        String[] categories = {"Vegetables", "Fruits", "Drinks", "Tobacco", "Card", "Cash"};
        for (String cat : categories) {
            JButton button = new JButton(cat);
            button.setFont(new Font("Arial", Font.PLAIN, 16));
            panelE.add(button);

        }

        //------- South Total Panel ------------
        JPanel panelS = new JPanel(new BorderLayout());

        //------- Discount Buttons on left -----
        JPanel discountPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        discountPanel.add(new JButton("Staff Discount"));
        discountPanel.add(new JButton("Blue light discount"));
        discountPanel.add(new JButton("Search for item"));
        discountPanel.add(new JButton("View Inventory"));
        panelS.add(discountPanel, BorderLayout.CENTER);

        //------- Numeric keypad to right ------
        JPanel numPad = new JPanel(new GridLayout(4, 3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            numPad.add(new JButton(String.valueOf(i)));
        }
        numPad.add(new JButton("0"));
        numPad.add(new JButton("."));
        numPad.add(new JButton("Enter"));
        panelS.add(numPad, BorderLayout.EAST);

        //------- Set panels to frame ----------
        frame.add(panelC, BorderLayout.CENTER);
        frame.add(panelE, BorderLayout.EAST);
        frame.add(panelS, BorderLayout.SOUTH);
    }

    private void catSelection(String categoryName) {
        java.util.List<Product> productList = new ArrayList<>();

        switch (categoryName.toLowerCase()) {
            case "fruits" -> {
                Fruits fruits = new Fruits("", 0.0, 0, LocalDate.now());
                productList = fruits.getFruitList();
            }
            case "vegetables" -> {
                Vegetables vegetables = new Vegetables("", 0.0, 0, LocalDate.now());
                productList = vegetables.getVegetableList();
            }
            case "drinks" -> {
                Drinks drinks = new Drinks("", 0.0, 0, LocalDate.now());
                productList = drinks.getDrinksList();
            }
            case "tobacco" -> {
                Tobacco tobacco = new Tobacco("", 0.0, 0, LocalDate.now());
                productList = tobacco.getTobaccoList();
            }
        }

        //POP up window for each product
        JDialog prodDialog = new JDialog(frame, categoryName + " Options", true);
        prodDialog.setLayout(new GridLayout(productList.size(), 1));
        for (Product p : productList) {
            JButton button = new JButton(p.getDescription() + " (£" + p.getPrice() + ")");
            button.addActionListener(e -> {
                prodDialog.dispose(); //closes pop up window
                enterQuantity(p);
            });
            prodDialog.add(button);
        }
        prodDialog.setSize(300, 200);
        prodDialog.setLocationRelativeTo(frame);
        prodDialog.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }




}
