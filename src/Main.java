import javax.swing.*;



public class Main {
    public static void main(String[] args) {

        try {

            CurrencyConverter currencyConverter = new CurrencyConverter();

            currencyConverter.setTitle("Currency Converter App");
            currencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            currencyConverter.setSize(500, 400);
            currencyConverter.setLocationRelativeTo(null);
            currencyConverter.setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}




