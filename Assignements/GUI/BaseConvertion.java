
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class BaseConvertion extends JFrame {

    JButton calculateBtn = new JButton("Calculate"), 
            exitBtn = new JButton("EXIT");

    JTextField originalNumberTF = new JTextField(20), currentBaseTF = new JTextField(20),
            newBaseTF = new JTextField(20), newNumberTF = new JTextField(20);

    JLabel originalNumberLabel = new JLabel("Enter A positive integer:", SwingConstants.RIGHT),
            currentBaseLabel = new JLabel("Enter current base:", SwingConstants.RIGHT), newBaseLabel = new JLabel("Enter new base:", SwingConstants.RIGHT),
            newNumberLabel = new JLabel("Number in new base:" , SwingConstants.RIGHT);

    GridLayout gridLayout;
    Container container;

    BaseConvertion() {
        setTitle("Base changer program");
        gridLayout = new GridLayout(5, 2);
        container = getContentPane();
        setLayout(gridLayout);

        add(originalNumberLabel);
        add( originalNumberTF);

        add(currentBaseLabel);
        add( currentBaseTF);
        add(newBaseLabel);
        add(newBaseTF);
        add(newNumberLabel);
        add(newNumberTF);
        add(calculateBtn);
        add(exitBtn);
        setSize(300, 300);
        setVisible(true);

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int originalNumber = Integer.parseInt(originalNumberTF.getText());
                int currentBase = Integer.parseInt(currentBaseTF.getText());
                int newBase = Integer.parseInt(newBaseTF.getText());
                int finalNumber = convertToBases(originalNumber, currentBase, newBase);
                newNumberTF.setText(String.valueOf(finalNumber));
            }

        });

        exitBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

    }



    public static void main(String[] args) {

        /* Scanner scan = new Scanner(System.in);

        System.out.println("This program converts from base 10 to 2 successive bases");

        System.out.println("Enter A positive integer: ");
        int originalNumber = scan.nextInt();

        System.out.println("Enter current base: ");
        int currentBase = scan.nextInt();

        System.out.println("Enter new base");
        int newBase = scan.nextInt();

        int finalNumber = convertToBases(originalNumber, currentBase, newBase);

        System.out.println("Number in new base: " + finalNumber); */

        
        BaseConvertion textFieldFrame = new BaseConvertion();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 300); // set frame size
        textFieldFrame.setVisible(true);


    }

    public static int convertToBases(int number, int currentBase, int convertionBase) {

        int result;

        if( currentBase != 10)
        {
            if(convertionBase == 10)
                return convertToBaseTen(number, currentBase);
            else{

                result = convertToBaseTen(number, currentBase);
                return  convertFromBaseTenToAnotherBase(result, convertionBase);
            }
        }
        else
        {
            return convertFromBaseTenToAnotherBase(number, convertionBase);
        }

    }

    public static int convertFromBaseTenToAnotherBase(int number, int base) {

        String newNumber = "";
        int quotient = number;
        int remainder = 0;

        
        while (quotient >= base) {
            remainder = quotient % base;
            newNumber = remainder + newNumber; // 21
            quotient = quotient / base;
            
        }
        
        if (remainder != 0 || quotient != 0) {
            newNumber = quotient + newNumber;
        }
        

        return Integer.parseInt(newNumber);
    }

    public static int convertToBaseTen(int number, int base) {

        String numberString = String.valueOf(number);

        int lengthNumber = numberString.length();

        int result = 0;
       

        for (int i = 1, j = 0; i <= lengthNumber; i++, j++) {
            result += Math.pow(base, lengthNumber - i) * Integer.parseInt(String.valueOf(numberString.charAt(j))); //
        }

        return result;
    }

}
