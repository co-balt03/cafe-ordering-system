import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;

public class main extends JFrame {

    private JPanel contentPane;

 // Coffee
    JCheckBox chkEspresso, chkAmericano, chkCappuccino, chkCaramelMacchiato, chkMocha;
    JTextField txtEspresso, txtAmericano, txtCappuccino, txtCaramelMacchiato, txtMocha;

    // Non Coffee
    JCheckBox chkChocolate, chkMatcha, chkStrawberryMilk, chkLemonade;
    JTextField txtChocolate, txtMatcha, txtStrawberryMilk, txtLemonade;

    // Pastries
    JCheckBox chkCroissant, chkChocolateCroissant, chkMuffin, chkBananaBread, chkCinnamonRoll;
    JTextField txtCroissant, txtChocolateCroissant, txtMuffin, txtBananaBread, txtCinnamonRoll;

    // Desserts
    JCheckBox chkCheesecake, chkChocolateCake, chkBrownies, chkDonut, chkIceCream;
    JTextField txtCheesecake, txtChocolateCake, txtBrownies, txtDonut, txtIceCream;

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
    double priceCaramelMacchiato = 170;
    double priceMocha = 165;

    double priceChocolate = 140;
    double priceMatcha = 150;
    double priceStrawberryMilk = 130;
    double priceLemonade = 120;

    double priceCroissant = 100;
    double priceMuffin = 110;
    double priceChocolateCroissant = 120;
    double priceBananaBread = 115;
    double priceCinnamonRoll = 130;

    double priceCheesecake = 160;
    double priceBrownies = 120;
    double priceChocolateCake = 170;
    double priceDonut = 90;
    double priceIceCream = 110;

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
        setBounds(100, 100, 1018, 667);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // COFFEE
        JLabel lblCoffee = new JLabel("Coffee");
        lblCoffee.setBounds(30,50,100,20);
        contentPane.add(lblCoffee);

        chkEspresso = new JCheckBox("Espresso ₱120");
        chkEspresso.setBounds(30,80,150,20);
        contentPane.add(chkEspresso);

        txtEspresso = new JTextField();
        txtEspresso.setBounds(229,80,50,20);
        txtEspresso.setEditable(false);
        contentPane.add(txtEspresso);

        chkAmericano = new JCheckBox("Americano ₱130");
        chkAmericano.setBounds(30,111,150,20);
        contentPane.add(chkAmericano);

        txtAmericano = new JTextField();
        txtAmericano.setBounds(229,111,50,20);
        txtAmericano.setEditable(false);
        contentPane.add(txtAmericano);

        chkCappuccino = new JCheckBox("Cappuccino ₱150");
        chkCappuccino.setBounds(30,140,169,20);
        contentPane.add(chkCappuccino);

        txtCappuccino = new JTextField();
        txtCappuccino.setBounds(229,140,50,20);
        txtCappuccino.setEditable(false);
        contentPane.add(txtCappuccino);
        
        chkCaramelMacchiato = new JCheckBox("Caramel Macchiato ₱170");
        chkCaramelMacchiato.setBounds(30,170,193,20);
        contentPane.add(chkCaramelMacchiato);

        txtCaramelMacchiato = new JTextField();
        txtCaramelMacchiato.setBounds(229,170,50,20);
        txtCaramelMacchiato.setEditable(false);
        contentPane.add(txtCaramelMacchiato);

        chkMocha = new JCheckBox("Mocha ₱165");
        chkMocha.setBounds(30,200,169,20);
        contentPane.add(chkMocha);

        txtMocha = new JTextField();
        txtMocha.setBounds(229,200,50,20);
        txtMocha.setEditable(false);
        contentPane.add(txtMocha);

        // NON COFFEE
        JLabel lblNonCoffee = new JLabel("Non Coffee Drinks");
        lblNonCoffee.setBounds(30,260,150,20);
        contentPane.add(lblNonCoffee);

        chkChocolate = new JCheckBox("Hot Chocolate ₱140");
        chkChocolate.setBounds(30,287,193,20);
        contentPane.add(chkChocolate);

        txtChocolate = new JTextField();
        txtChocolate.setBounds(229,287,50,20);
        txtChocolate.setEditable(false);
        contentPane.add(txtChocolate);

        chkMatcha = new JCheckBox("Matcha Latte ₱150");
        chkMatcha.setBounds(30,318,193,20);
        contentPane.add(chkMatcha);

        txtMatcha = new JTextField();
        txtMatcha.setBounds(229,318,50,20);
        txtMatcha.setEditable(false);
        contentPane.add(txtMatcha);
        
        chkStrawberryMilk = new JCheckBox("Strawberry Milk ₱130");
        chkStrawberryMilk.setBounds(30,350,193,20);
        contentPane.add(chkStrawberryMilk);

        txtStrawberryMilk = new JTextField();
        txtStrawberryMilk.setBounds(229,349,50,20);
        txtStrawberryMilk.setEditable(false);
        contentPane.add(txtStrawberryMilk);

        chkLemonade = new JCheckBox("Fresh Lemonade ₱120");
        chkLemonade.setBounds(30,381,193,20);
        contentPane.add(chkLemonade);

        txtLemonade = new JTextField();
        txtLemonade.setBounds(229,381,50,20);
        txtLemonade.setEditable(false);
        contentPane.add(txtLemonade);

        // PASTRIES
        JLabel lblPastries = new JLabel("Pastries");
        lblPastries.setBounds(315,50,100,20);
        contentPane.add(lblPastries);

        chkCroissant = new JCheckBox("Croissant ₱100");
        chkCroissant.setBounds(325,80,182,20);
        contentPane.add(chkCroissant);

        txtCroissant = new JTextField();
        txtCroissant.setBounds(513,80,50,20);
        txtCroissant.setEditable(false);
        contentPane.add(txtCroissant);

        chkMuffin = new JCheckBox("Blueberry Muffin ₱110");
        chkMuffin.setBounds(325,111,182,20);
        contentPane.add(chkMuffin);

        txtMuffin = new JTextField();
        txtMuffin.setBounds(513,111,50,20);
        txtMuffin.setEditable(false);
        contentPane.add(txtMuffin);
        
        chkChocolateCroissant = new JCheckBox("Chocolate Croissant ₱120");
        chkChocolateCroissant.setBounds(325,140,182,20);
        contentPane.add(chkChocolateCroissant);

        txtChocolateCroissant = new JTextField();
        txtChocolateCroissant.setBounds(513,140,50,20);
        txtChocolateCroissant.setEditable(false);
        contentPane.add(txtChocolateCroissant);

        chkBananaBread = new JCheckBox("Banana Bread ₱115");
        chkBananaBread.setBounds(325,170,182,20);
        contentPane.add(chkBananaBread);

        txtBananaBread = new JTextField();
        txtBananaBread.setBounds(513,170,50,20);
        txtBananaBread.setEditable(false);
        contentPane.add(txtBananaBread);

        chkCinnamonRoll = new JCheckBox("Cinnamon Roll ₱130");
        chkCinnamonRoll.setBounds(325,200,182,20);
        contentPane.add(chkCinnamonRoll);

        txtCinnamonRoll = new JTextField();
        txtCinnamonRoll.setBounds(513,200,50,20);
        txtCinnamonRoll.setEditable(false);
        contentPane.add(txtCinnamonRoll);

        // DESSERT
        JLabel lblDessert = new JLabel("Desserts");
        lblDessert.setBounds(315,260,100,20);
        contentPane.add(lblDessert);

        chkCheesecake = new JCheckBox("Cheesecake ₱160");
        chkCheesecake.setBounds(325,287,182,20);
        contentPane.add(chkCheesecake);

        txtCheesecake = new JTextField();
        txtCheesecake.setBounds(513,287,50,20);
        txtCheesecake.setEditable(false);
        contentPane.add(txtCheesecake);

        chkBrownies = new JCheckBox("Brownies ₱120");
        chkBrownies.setBounds(325,318,182,20);
        contentPane.add(chkBrownies);

        txtBrownies = new JTextField();
        txtBrownies.setBounds(513,318,50,20);
        txtBrownies.setEditable(false);
        contentPane.add(txtBrownies);
        
        chkChocolateCake = new JCheckBox("Chocolate Cake ₱170");
        chkChocolateCake.setBounds(325,350,182,20);
        contentPane.add(chkChocolateCake);

        txtChocolateCake = new JTextField();
        txtChocolateCake.setBounds(513,350,50,20);
        txtChocolateCake.setEditable(false);
        contentPane.add(txtChocolateCake);

        chkDonut = new JCheckBox("Donut ₱90");
        chkDonut.setBounds(325,381,182,20);
        contentPane.add(chkDonut);

        txtDonut = new JTextField();
        txtDonut.setBounds(513,381,50,20);
        txtDonut.setEditable(false);
        contentPane.add(txtDonut);

        chkIceCream = new JCheckBox("Ice Cream ₱110");
        chkIceCream.setBounds(325,412,182,20);
        contentPane.add(chkIceCream);

        txtIceCream = new JTextField();
        txtIceCream.setBounds(513,412,50,20);
        txtIceCream.setEditable(false);
        contentPane.add(txtIceCream);

        // DISCOUNT
        JLabel lblDiscount = new JLabel("Discount");
        lblDiscount.setBounds(30,427,100,20);
        contentPane.add(lblDiscount);

        rdoStudent = new JRadioButton("Student (10%)");
        rdoStudent.setBounds(40,454,120,20);
        contentPane.add(rdoStudent);

        rdoSenior = new JRadioButton("Senior (20%)");
        rdoSenior.setBounds(40,480,120,20);
        contentPane.add(rdoSenior);

        discountGroup = new ButtonGroup();
        discountGroup.add(rdoStudent);
        discountGroup.add(rdoSenior);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(606,80,350,400);
        contentPane.add(scrollPane);
        
                // RECEIPT
                receiptArea = new JTextArea();
                scrollPane.setViewportView(receiptArea);
                receiptArea.setEditable(false);


                chkEspresso.addActionListener(e -> {
                    txtEspresso.setEditable(chkEspresso.isSelected());
                    if(!chkEspresso.isSelected()) txtEspresso.setText("");
                });

                chkAmericano.addActionListener(e -> {
                    txtAmericano.setEditable(chkAmericano.isSelected());
                    if(!chkAmericano.isSelected()) txtAmericano.setText("");
                });

                chkCappuccino.addActionListener(e -> {
                    txtCappuccino.setEditable(chkCappuccino.isSelected());
                    if(!chkCappuccino.isSelected()) txtCappuccino.setText("");
                });

                chkChocolate.addActionListener(e -> {
                    txtChocolate.setEditable(chkChocolate.isSelected());
                    if(!chkChocolate.isSelected()) txtChocolate.setText("");
                });

                chkMatcha.addActionListener(e -> {
                    txtMatcha.setEditable(chkMatcha.isSelected());
                    if(!chkMatcha.isSelected()) txtMatcha.setText("");
                });

                chkCroissant.addActionListener(e -> {
                    txtCroissant.setEditable(chkCroissant.isSelected());
                    if(!chkCroissant.isSelected()) txtCroissant.setText("");
                });

                chkMuffin.addActionListener(e -> {
                    txtMuffin.setEditable(chkMuffin.isSelected());
                    if(!chkMuffin.isSelected()) txtMuffin.setText("");
                });

                chkCheesecake.addActionListener(e -> {
                    txtCheesecake.setEditable(chkCheesecake.isSelected());
                    if(!chkCheesecake.isSelected()) txtCheesecake.setText("");
                });

                chkBrownies.addActionListener(e -> {
                    txtBrownies.setEditable(chkBrownies.isSelected());
                    if(!chkBrownies.isSelected()) txtBrownies.setText("");
                });
                
                chkCaramelMacchiato.addActionListener(e -> {
                    txtCaramelMacchiato.setEditable(chkCaramelMacchiato.isSelected());
                    if(!chkCaramelMacchiato.isSelected()) txtCaramelMacchiato.setText("");
                });

                chkMocha.addActionListener(e -> {
                    txtMocha.setEditable(chkMocha.isSelected());
                    if(!chkMocha.isSelected()) txtMocha.setText("");
                });

                chkStrawberryMilk.addActionListener(e -> {
                    txtStrawberryMilk.setEditable(chkStrawberryMilk.isSelected());
                    if(!chkStrawberryMilk.isSelected()) txtStrawberryMilk.setText("");
                });

                chkLemonade.addActionListener(e -> {
                    txtLemonade.setEditable(chkLemonade.isSelected());
                    if(!chkLemonade.isSelected()) txtLemonade.setText("");
                });

                chkChocolateCroissant.addActionListener(e -> {
                    txtChocolateCroissant.setEditable(chkChocolateCroissant.isSelected());
                    if(!chkChocolateCroissant.isSelected()) txtChocolateCroissant.setText("");
                });

                chkBananaBread.addActionListener(e -> {
                    txtBananaBread.setEditable(chkBananaBread.isSelected());
                    if(!chkBananaBread.isSelected()) txtBananaBread.setText("");
                });

                chkCinnamonRoll.addActionListener(e -> {
                    txtCinnamonRoll.setEditable(chkCinnamonRoll.isSelected());
                    if(!chkCinnamonRoll.isSelected()) txtCinnamonRoll.setText("");
                });

                chkChocolateCake.addActionListener(e -> {
                    txtChocolateCake.setEditable(chkChocolateCake.isSelected());
                    if(!chkChocolateCake.isSelected()) txtChocolateCake.setText("");
                });

                chkDonut.addActionListener(e -> {
                    txtDonut.setEditable(chkDonut.isSelected());
                    if(!chkDonut.isSelected()) txtDonut.setText("");
                });

                chkIceCream.addActionListener(e -> {
                    txtIceCream.setEditable(chkIceCream.isSelected());
                    if(!chkIceCream.isSelected()) txtIceCream.setText("");
                });

        // BUTTONS
        btnCompute = new JButton("Compute Total");
        btnCompute.setBounds(183,522,120,30);
        contentPane.add(btnCompute);

        btnClear = new JButton("Clear Order");
        btnClear.setBounds(313,522,120,30);
        contentPane.add(btnClear);

        btnPlace = new JButton("Place Order");
        btnPlace.setBounds(443,522,120,30);
        contentPane.add(btnPlace);
        
        JLabel lblNewLabel = new JLabel("Menu");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(218, 11, 61, 20);
        contentPane.add(lblNewLabel);

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
                    
                    if(chkCaramelMacchiato.isSelected()){
                        int qty = Integer.parseInt(txtCaramelMacchiato.getText());
                        double itemTotal = qty * priceCaramelMacchiato;
                        subtotal += itemTotal;
                        receipt += "Caramel Macchiato x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkMocha.isSelected()){
                        int qty = Integer.parseInt(txtMocha.getText());
                        double itemTotal = qty * priceMocha;
                        subtotal += itemTotal;
                        receipt += "Mocha x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkStrawberryMilk.isSelected()){
                        int qty = Integer.parseInt(txtStrawberryMilk.getText());
                        double itemTotal = qty * priceStrawberryMilk;
                        subtotal += itemTotal;
                        receipt += "Strawberry Milk x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkLemonade.isSelected()){
                        int qty = Integer.parseInt(txtLemonade.getText());
                        double itemTotal = qty * priceLemonade;
                        subtotal += itemTotal;
                        receipt += "Fresh Lemonade x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkChocolateCroissant.isSelected()){
                        int qty = Integer.parseInt(txtChocolateCroissant.getText());
                        double itemTotal = qty * priceChocolateCroissant;
                        subtotal += itemTotal;
                        receipt += "Chocolate Croissant x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkBananaBread.isSelected()){
                        int qty = Integer.parseInt(txtBananaBread.getText());
                        double itemTotal = qty * priceBananaBread;
                        subtotal += itemTotal;
                        receipt += "Banana Bread x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkCinnamonRoll.isSelected()){
                        int qty = Integer.parseInt(txtCinnamonRoll.getText());
                        double itemTotal = qty * priceCinnamonRoll;
                        subtotal += itemTotal;
                        receipt += "Cinnamon Roll x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkChocolateCake.isSelected()){
                        int qty = Integer.parseInt(txtChocolateCake.getText());
                        double itemTotal = qty * priceChocolateCake;
                        subtotal += itemTotal;
                        receipt += "Chocolate Cake x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkDonut.isSelected()){
                        int qty = Integer.parseInt(txtDonut.getText());
                        double itemTotal = qty * priceDonut;
                        subtotal += itemTotal;
                        receipt += "Donut x"+qty+" = "+itemTotal+"\n";
                    }

                    if(chkIceCream.isSelected()){
                        int qty = Integer.parseInt(txtIceCream.getText());
                        double itemTotal = qty * priceIceCream;
                        subtotal += itemTotal;
                        receipt += "Ice Cream x"+qty+" = "+itemTotal+"\n";
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
                            "\nTOTAL: "+String.format("%.2f", total)+
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
        			chkEspresso,chkAmericano,chkCappuccino,chkCaramelMacchiato,chkMocha,
        			chkChocolate,chkMatcha,chkStrawberryMilk,chkLemonade,
        			chkCroissant,chkChocolateCroissant,chkMuffin,chkBananaBread,chkCinnamonRoll,
        			chkCheesecake,chkChocolateCake,chkBrownies,chkDonut,chkIceCream
        			};

        	JTextField[] fields = {
        			txtEspresso,txtAmericano,txtCappuccino,txtCaramelMacchiato,txtMocha,
        			txtChocolate,txtMatcha,txtStrawberryMilk,txtLemonade,
        			txtCroissant,txtChocolateCroissant,txtMuffin,txtBananaBread,txtCinnamonRoll,
        			txtCheesecake,txtChocolateCake,txtBrownies,txtDonut,txtIceCream
        			};

            for(JCheckBox c : checks) c.setSelected(false);
            for(JTextField f : fields){
                f.setText("");
                f.setEditable(false);
            }

            discountGroup.clearSelection();
            receiptArea.setText("");
        });

        // PLACE ORDER
        btnPlace.addActionListener(e -> {
            receiptArea.append("\n\nOrder Completed. Thank you!");
        });
    }
}
