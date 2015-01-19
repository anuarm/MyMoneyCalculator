package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import model.Money;

public class ExchangeDisplay extends JDialog implements ui.ExchangeDisplay {
    
    private JDialog exchangeDialog;

    @Override
    public void display(Money money) { 
        this.exchangeDialog = new JDialog() ;
        exchangeDialog.setTitle("Resultado de cambio de divisa");
        exchangeDialog.setLayout(new BorderLayout());
        exchangeDialog.add(new Label(money.getAmount()+ " " + money.getCurrency()));
        exchangeDialog.setModal(true);
        exchangeDialog.setResizable(false);
        exchangeDialog.setSize(230, 120);
        JButton ok = new JButton("Ok") ; 
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exchangeDialog.dispose();
            } 
          });
        exchangeDialog.add (ok , BorderLayout.SOUTH) ; 
        exchangeDialog.setLocationRelativeTo(null);
        exchangeDialog.setVisible(true);
    }

}