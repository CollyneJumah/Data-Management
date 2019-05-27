import catholic_action.Login;
    import javax.swing.*;    
    public class ProgressBarExample extends JFrame{    
    JProgressBar jb;    
    int i=0,num=0;     
    ProgressBarExample(){    
    jb=new JProgressBar(0,2000);    
    jb.setBounds(40,40,160,30);         
    jb.setValue(0);    
    jb.setStringPainted(true);
    jb.setAlignmentX(CENTER_ALIGNMENT);
    jb.setAlignmentY(CENTER_ALIGNMENT);
    jb.setOrientation(i);
    
    add(jb);    
    setSize(300,150);    
    setLayout(null);    
    }    
    public void iterate(){    
    while(i<=2000){    
      jb.setValue(i);    
      i=i+20;    
      try{Thread.sleep(50);}catch(Exception e){}    
    }    
    }    
    public static void main(String[] args) {    
        ProgressBarExample m=new ProgressBarExample();    
        m.setVisible(true);    
        m.iterate(); 
        Login lg= new Login();
        lg.setVisible(true);
    }    
    }    


//    import javax.swing.*;  
//    import java.awt.event.*;  
//    class PopupMenuExample  
//    {  
//         PopupMenuExample(){  
//             final JFrame f= new JFrame("PopupMenu Example");  
//             final JPopupMenu popupmenu = new JPopupMenu("Edit");   
//             JMenuItem cut = new JMenuItem("Cut");  
//             JMenuItem copy = new JMenuItem("Copy");  
//             JMenuItem paste = new JMenuItem("Paste");  
//             popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);        
//             f.addMouseListener(new MouseAdapter() {  
//                public void mouseClicked(MouseEvent e) {              
//                    popupmenu.show(f , e.getX(), e.getY());  
//                }                 
//             });  
//             f.add(popupmenu);   
//             f.setSize(300,300);  
//             f.setLayout(null);  
//             f.setVisible(true);  
//         }  
//    public static void main(String args[])  
//    {  
//            new PopupMenuExample();  
//    }}  