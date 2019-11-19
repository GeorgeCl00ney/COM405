
package week9_car;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener
{
    //ATTRIBUTES
    private JLabel lblTitle
            ,lblMake
            ,lblModel
            ,lblYear
            ,lblIsMOTValid
            ,lblCurrentSpeed
            ,lblMaxSpeed
            ,lblFuelLevel;
    private JTextField txtMake
            ,txtModel
            ,txtYear
            ,txtIsMOTValid
            ,txtCurrentSpeed
            ,txtMaxSpeed
            ,txtFuelLevel;
    private JButton btnAccelerate
            ,btnBrake;
    private GridBagConstraints constraints;
    private Car car;
    
    //CONSTRUCTOR
    GUI()
    {
        car = new Car("Wacky Racer","Creepy Coup",1968,true,666);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
