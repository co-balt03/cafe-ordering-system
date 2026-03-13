import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main extends JFrame {

    private JPanel contentPane;

    // Coffee
    JCheckBox chkEspresso, chkAmericano, chkCappuccino;
    JTextField txtEspresso, txtAmericano, txtCappuccino;

    // Non Coffee
    JCheckBox chkChocolate, chkMatcha;
    JTextField txtChocolate, txtMatcha;

    // Pastries
    JCheckBox chkCroissant, chkMuffin;
    JTextField txtCroissant, txtMuffin;

    // Desserts
    JCheckBox chkCheesecake, chkBrownies;
    JTextField txtCheesecake, txtBrownies;

    // Discounts
    JRadioButton rdoStudent, rdoSenior;
    ButtonGroup discountGroup;

    // Buttons
    JButton btnCompute, btnClear, btnPlace;

    // Receipt Area
    JTextArea receiptArea;

    // Prices
    double priceEspresso = 120;
    double priceAmericano = 130;
    double priceCappuccino = 150;

    double priceChocolate = 140;
    double priceMatcha = 150;

    double priceCroissant = 100;
    double priceMuffin = 110;

    double priceCheesecake = 160;
    double priceBrownies = 120;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                main frame = new main();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public main() {

        setTitle("Cafe Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 836, 513);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // COFFEE
        JLabel lblCoffee = new JLabel("Coffee");
        lblCoffee.setBounds(30,50,100,20);
        contentPane.add(lblCoffee);

        chkEspresso = new JCheckBox("Espresso");
        chkEspresso.setBounds(30,80,120,20);
        contentPane.add(chkEspresso);

        txtEspresso = new JTextField();
        txtEspresso.setBounds(160,80,50,20);
        contentPane.add(txtEspresso);

        chkAmericano = new JCheckBox("Americano");
        chkAmericano.setBounds(30,110,124,20);
        contentPane.add(chkAmericano);

        txtAmericano = new JTextField();
        txtAmericano.setBounds(160,111,50,20);
        contentPane.add(txtAmericano);

        chkCappuccino = new JCheckBox("Cappuccino");
        chkCappuccino.setBounds(30,140,124,20);
        contentPane.add(chkCappuccino);

        txtCappuccino = new JTextField();
        txtCappuccino.setBounds(160,140,50,20);
        contentPane.add(txtCappuccino);

        // NON COFFEE
        JLabel lblNonCoffee = new JLabel("Non Coffee Drinks");
        lblNonCoffee.setBounds(30,190,150,20);
        contentPane.add(lblNonCoffee);

        chkChocolate = new JCheckBox("Hot Chocolate");
        chkChocolate.setBounds(30,220,124,20);
        contentPane.add(chkChocolate);

        txtChocolate = new JTextField();
        txtChocolate.setBounds(160,220,50,20);
        contentPane.add(txtChocolate);

        chkMatcha = new JCheckBox("Matcha Latte");
        chkMatcha.setBounds(30,250,124,20);
        contentPane.add(chkMatcha);

        txtMatcha = new JTextField();
        txtMatcha.setBounds(160,250,50,20);
        contentPane.add(txtMatcha);

        // PASTRIES
        JLabel lblPastries = new JLabel("Pastries");
        lblPastries.setBounds(228,50,100,20);
        contentPane.add(lblPastries);

        chkCroissant = new JCheckBox("Croissant");
        chkCroissant.setBounds(228,80,126,20);
        contentPane.add(chkCroissant);

        txtCroissant = new JTextField();
        txtCroissant.setBounds(360,80,50,20);
        contentPane.add(txtCroissant);

        chkMuffin = new JCheckBox("Blueberry Muffin");
        chkMuffin.setBounds(228,110,126,20);
        contentPane.add(chkMuffin);

        txtMuffin = new JTextField();
        txtMuffin.setBounds(360,110,50,20);
        contentPane.add(txtMuffin);

        // DESSERT
        JLabel lblDessert = new JLabel("Desserts");
        lblDessert.setBounds(228,190,100,20);
        contentPane.add(lblDessert);

        chkCheesecake = new JCheckBox("Cheesecake");
        chkCheesecake.setBounds(228,220,113,20);
        contentPane.add(chkCheesecake);

        txtCheesecake = new JTextField();
        txtCheesecake.setBounds(360,220,50,20);
        contentPane.add(txtCheesecake);

        chkBrownies = new JCheckBox("Brownies");
        chkBrownies.setBounds(228,250,113,20);
        contentPane.add(chkBrownies);

        txtBrownies = new JTextField();
        txtBrownies.setBounds(360,250,50,20);
        contentPane.add(txtBrownies);

        // DISCOUNT
        JLabel lblDiscount = new JLabel("Discount");
        lblDiscount.setBounds(30,300,100,20);
        contentPane.add(lblDiscount);

        rdoStudent = new JRadioButton("Student (10%)");
        rdoStudent.setBounds(30,327,120,20);
        contentPane.add(rdoStudent);

        rdoSenior = new JRadioButton("Senior (20%)");
        rdoSenior.setBounds(30,349,120,20);
        contentPane.add(rdoSenior);

        discountGroup = new ButtonGroup();
        discountGroup.add(rdoStudent);
        discountGroup.add(rdoSenior);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(431,33,350,400);
        contentPane.add(scrollPane);
        
                // RECEIPT
                receiptArea = new JTextArea();
                scrollPane.setViewportView(receiptArea);
                receiptArea.setEditable(false);

        // BUTTONS
        btnCompute = new JButton("Compute Total");
        btnCompute.setBounds(30,403,120,30);
        contentPane.add(btnCompute);

        btnClear = new JButton("Clear Order");
        btnClear.setBounds(160,403,120,30);
        contentPane.add(btnClear);

        btnPlace = new JButton("Place Order");
        btnPlace.setBounds(290,403,120,30);
        contentPane.add(btnPlace);

        // COMPUTE BUTTON
        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double subtotal = 0;
                String receipt = "";

                try {
                	
                    if(chkEspresso.isSelected()){
                        int qty = Integer.parseInt(txtEspresso.getText());
                        double itemTotal = qty * priceEspresso;
                        subtotal += itemTotal;
                        receipt += "Espresso x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkAmericano.isSelected()){
                        int qty = Integer.parseInt(txtAmericano.getText());
                        double itemTotal = qty * priceAmericano;
                        subtotal += itemTotal;
                        receipt += "Americano x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkCappuccino.isSelected()){
                        int qty = Integer.parseInt(txtCappuccino.getText());
                        double itemTotal = qty * priceCappuccino;
                        subtotal += itemTotal;
                        receipt += "Cappuccino x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkChocolate.isSelected()){
                        int qty = Integer.parseInt(txtChocolate.getText());
                        double itemTotal = qty * priceChocolate;
                        subtotal += itemTotal;
                        receipt += "Hot Chocolate x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkMatcha.isSelected()){
                        int qty = Integer.parseInt(txtMatcha.getText());
                        double itemTotal = qty * priceMatcha;
                        subtotal += itemTotal;
                        receipt += "Matcha Latte x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkCroissant.isSelected()){
                        int qty = Integer.parseInt(txtCroissant.getText());
                        double itemTotal = qty * priceCroissant;
                        subtotal += itemTotal;
                        receipt += "Croissant x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkMuffin.isSelected()){
                        int qty = Integer.parseInt(txtMuffin.getText());
                        double itemTotal = qty * priceMuffin;
                        subtotal += itemTotal;
                        receipt += "Blueberry Muffin x"+qty+" = "+itemTotal+ "\n";
                    }
                    
                    if(chkCheesecake.isSelected()){
                        int qty = Integer.parseInt(txtCheesecake.getText());
                        double itemTotal = qty * priceCheesecake;
                        subtotal += itemTotal;
                        receipt += "Cheesecake x"+qty+" = "+itemTotal+"\n";
                    }
                    
                    if(chkBrownies.isSelected()){
                        int qty = Integer.parseInt(txtBrownies.getText());
                        double itemTotal = qty * priceBrownies;
                        subtotal += itemTotal;
                        receipt += "Brownies x"+qty+" = "+itemTotal+"\n";
                    }

                    double discount = 0;
                    String discountType = "None";

                    if(rdoStudent.isSelected()){
                        discount = subtotal * 0.10;
                        discountType = "Student Discount";
                    }

                    if(rdoSenior.isSelected()){
                        discount = subtotal * 0.20;
                        discountType = "Senior Discount";
                    }

                    double total = subtotal - discount;

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                    receiptArea.setText(
                            "=========== Cafe Receipt ===========\n"+
                            "Date: "+sdf.format(new Date())+"\n\n"+
                            receipt+
                            "\nSubtotal: "+subtotal+
                            "\nDiscount: "+discountType+
                            "\nDiscount Amount: "+discount+
                            "\n----------------------------------"+
                            "\nTOTAL: "+total+
                            "\n=================================="
                    );

                } catch(Exception ex){
                    receiptArea.setText("Invalid quantity input.");
                }
            }
        });

        // CLEAR BUTTON
        btnClear.addActionListener(e -> {

            JCheckBox[] checks = {
                    chkEspresso,chkAmericano,chkCappuccino,
                    chkChocolate,chkMatcha,
                    chkCroissant,chkMuffin,
                    chkCheesecake,chkBrownies
            };

            JTextField[] fields = {
                    txtEspresso,txtAmericano,txtCappuccino,
                    txtChocolate,txtMatcha,
                    txtCroissant,txtMuffin,
                    txtCheesecake,txtBrownies
            };

            for(JCheckBox c : checks) c.setSelected(false);
            for(JTextField f : fields) f.setText("");

            discountGroup.clearSelection();
            receiptArea.setText("");
        });

        // PLACE ORDER
        btnPlace.addActionListener(e -> {
            receiptArea.append("\n\nOrder Completed. Thank you!");
        });
    }
}