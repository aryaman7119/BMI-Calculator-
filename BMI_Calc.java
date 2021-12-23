 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 

public class BMI_Calc extends javax.swing.JFrame {
 
    BMI_Calc() {
        JFrame f = new JFrame();//creating instance of JFrame 
        
        JLabel lb1 = new JLabel("Height(meters):");
        lb1.setBounds(20, 20, 100, 40);//x axis, y axis, width, height
        f.add(lb1); //adding component in JFrame
 
        JLabel lb2 = new JLabel("Weight(KG):");
        lb2.setBounds(20, 80, 100, 40);
        f.add(lb2);
        
        JLabel lbResult = new JLabel("Result");
        lbResult.setBounds(20, 130, 300, 40);
        f.add(lbResult); 
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        f.add(txtHeight); 
 
        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 80, 200, 40);
        f.add(txtWeight); 
 
        JButton btn = new JButton("BMI Calculator");//creating instance of JButton  
        btn.setBounds(20, 180, 300, 40);//x axis, y axis, width, height

        

        

        
        
        //Event
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());
                
                double bmi = weight / Math.pow(height, 2);
 
                 if (bmi < 18.5) {
                     lbResult.setText("underweight - BMI : "+bmi);
                 } else if (bmi < 25) {
                     lbResult.setText("normal - BMI : "+bmi);
                 } else if (bmi < 30) {
                     lbResult.setText("overweight - BMI : "+bmi);
                 } else {
                     lbResult.setText("obese - BMI : "+bmi);
                 }
            }
        });
 
        f.add(btn);//adding button in JFrame  
 
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("BMI Calculator");
 
    }
 
    public static void main(String[] args) {
        new BMI_Calc();
    }
}
 