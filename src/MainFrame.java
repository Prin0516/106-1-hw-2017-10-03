import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private int a=1;


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
        jtaL.setLineWrap(true);
        jtaR.setLineWrap(true);
        jtaR.setEnabled(false);
        cp.add(jpl,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);
        int b=55;
        toTwo(b);

        exbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("The Department of Computer Science and Information Engineering, formerly the Department of Information Technology, was established in 2001. The department first offered a Master program only. In 2002, the undergraduate program was established. The Doctoral program was established in 2006. Each year the department admits about 80 undergraduates, 15 graduate students and 3 Ph.D. students.\n" +
                        "\n");
            }
        });
        encrybtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=jtaL.getText();
                char data[]=str.toCharArray();
                int len=data.length;
                String key=keyjtf.getText();
                int key2[]=new int[key.length()];
                for(int i=0;i<key.length();i++){
                    for(int j=0;j<key.length();j++){
                    key2[j]= Integer.parseInt(toTwo(key.charAt(i)));

                }
                    System.out.println(key2[i]);}
                for(int i=0;i<len;i++){
                    if(i%4==0){

                    }else if(i%4==1){

                    }else if(i%4==2){

                    }else if(i%4==3){

                    }



                }
                str=new String(data);
            }
        });
        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("");
                jtaR.setText("");
                keyjtf.setText("");
            }
        });
         decrybtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });


    }
    public void toTen(int a){



    }
    public String toTwo(int a){
        String str="";
        while(a>=1){
            if(a%2==0){
                str+="0";
            }else if(a%2==1){
                str+="1";
            }
            a=a/2;
        }
        return str;
    }

}
