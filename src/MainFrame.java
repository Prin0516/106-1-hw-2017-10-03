import javax.swing.*;
import java.awt.*;

public class MainFrame  extends JFrame {
    private Container cp;
    private JButton exbtn=new JButton("範例文");
    private JButton encrybtn=new JButton("加密");
    private JButton clearbtn=new JButton("清除");
    private JButton decrybtn=new JButton("解密");
    private JButton exitbtn=new JButton("Exit");
    private JTextField keyjtf=new JTextField("0");
    private JLabel jlb=new JLabel("Key");
    private JTextArea jtaL=new JTextArea();
    private JTextArea jtaR=new JTextArea();
    private JScrollPane jspL=new JScrollPane(jtaL);
    private JScrollPane jspR=new JScrollPane(jtaR);
    private JPanel jpl=new JPanel(new GridLayout(7,1,3,3));


    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(3,3));
        cp=this.getContentPane();
        jpl.add(exbtn);
        jpl.add(encrybtn);
        jpl.add(jlb);
        jpl.add(keyjtf);
        jpl.add(clearbtn);
        jpl.add(decrybtn);
        jpl.add(exitbtn);
        jspL.setPreferredSize(new Dimension(200,500));
        jspR.setPreferredSize(new Dimension(200,500));
        cp.add(jpl,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);






    }
}
