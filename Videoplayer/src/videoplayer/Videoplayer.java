// username : khalid
// password : 1321

package videoplayer;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Videoplayer extends Frame implements ActionListener
{

    
    public class Node
    {
        Node next,prev;
        Object data;
        Node(String Link)
        {
            this.next=first;
            this.prev=last;
            data=Link;
        }
    }
    
    Node first,last;
    int count;
    public Videoplayer()
    {
        
        last=first=null;
        count=0;
    }
    
    public boolean isempty()
    {
        return first==null;
    }
    
    public void insertfirst(String Link)
    {
        Node newvideo = new Node("C:\\Users\\Laptop-Academy.com\\Desktop\\New folder\\"+Link+".mp4");
        if(isempty())
           first=newvideo;
        else
        {
            newvideo.next=first;
            first=newvideo;
        }
        System.out.println(newvideo.data+" inserted successfully");
        count++;
        System.out.println("New Video uploaded now you have "+count+" videos in your playlist");
    }
    
    public void removefirst()
    {
        if(isempty())
            System.out.println("list already empty");
        else
            first=first.next;
    }
    
    public void remove(String name)
    {
        Node temp = first;
        if(isempty())
            System.out.println("list is empty");
        else if(first.data.equals(name))
            removefirst();
        else
        {
            while(!temp.next.data.equals(name)&&temp.next!=first)
            {
                temp=temp.next;
            }
            if(temp.next==first)
                
            if(temp.data.equals(name))
            {
                temp.next=temp.next.next;
                temp.next.prev=temp;
            }
        }
    }
    
     public void search(String name)
    {
        if(isempty())
            System.out.println("list is empty");
        else if (first.data.equals(name))
            test(name);
        else
        {
            Node temp = first.next;
            while(!temp.data.equals(name)&&temp!=first)
            {
                temp=temp.next;
            }
            if(temp.data.equals(name))
                test(name);
            else if(temp==first)
                System.out.println("item is not in the list");
            else
                System.out.println("no contion works");
        }
    }
    
    
    public void test(String link)
      {
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File(link));
        } catch (IOException ex) {
            Logger.getLogger(Videoplayer.class.getName()).log(Level.SEVERE, "file is not in the list", ex);
        }
    }      
    
    public void play(String link)
    {
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File(link));
        } catch (IOException ex) {
            Logger.getLogger(Videoplayer.class.getName()).log(Level.SEVERE, "file is not in the list", ex);
        }
    }
    
    
    
    
    
    
    
    

     // Welcome Frame
 
    URL Img0=getClass().getResource("logo2.png");
    ImageIcon logo0 =new ImageIcon(Img0);
    JLabel icon0 =new JLabel(logo0);
    
    
    
    URL Img1=getClass().getResource("user.png");
    ImageIcon logo1 =new ImageIcon(Img1);
    JLabel user =new JLabel(logo1);
    
    URL Img2=getClass().getResource("pass.png");
    ImageIcon logo2 =new ImageIcon(Img2);
    JLabel pass =new JLabel(logo2);
    
    //create check pass screen
    JLabel telllabel = new JLabel("Please, Enter your Username & Password :");
    JLabel userlabel = new JLabel("Username :");
    JLabel passlabel = new JLabel("Password :");
    //create Text Fields for Welcome Frame
    JTextField usertext = new JTextField();
    JTextField passtext = new JTextField();
    //create Button Login for Welcome Frame
    JButton submitpass = new JButton("Log In");
    //create Fonts
    Font font = new Font("SansSerif", Font.BOLD, 15);
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Font font2 = new Font("SansSerif", Font.BOLD, 25);
    Font font3 = new Font("SansSerif", Font.BOLD, 17);
    
   
    //Choose Frame
    JFrame chooseframe = new JFrame();
    JLabel welcome=new JLabel("Welcome to World Cup 2022");
    URL Img=getClass().getResource("logo.png");
    ImageIcon logo =new ImageIcon(Img);
    JLabel icon =new JLabel(logo); 
    JLabel choose=new JLabel("Please, Enter your Choice :");
    JButton add = new JButton("Add Video");
    JButton search = new JButton("Search Video");
    JButton delete = new JButton("Delete Video");
    JButton logout = new JButton("Log out");
    
    
    
    
    //Add Video Frame
    JFrame add_video =new JFrame ();
    URL Img3=getClass().getResource("logo3.png");
    ImageIcon logo3 =new ImageIcon(Img3);
    JLabel icon3 =new JLabel(logo3);
    JLabel addv=new JLabel("please, Enter your Video");
    JLabel labeladdv=new JLabel("Video :");
    JTextField addtv= new JTextField();
    JButton addprevious= new JButton("Previous");
    JButton insert= new JButton("Add");
    
    
    
    //search Video Frame
    JFrame search_video =new JFrame ();
    JLabel icons3 =new JLabel(logo3);
    JLabel searchv=new JLabel("please, Enter your Video");
    JLabel labelsearchv=new JLabel("Video :");
    JTextField searchtv= new JTextField();
    JButton searchprevious= new JButton("Previous");
    JButton search_v= new JButton("Search");
    
    
    
    //Delete Video Frame
    JFrame Delete_Video =new JFrame ();
    JLabel icond3 =new JLabel(logo3);
    JLabel deletev=new JLabel("please, Enter your Video");
    JLabel labeldeletev=new JLabel("Video :");
    JTextField deletetv= new JTextField();
    JButton deleteprevious= new JButton("Previous");
    JButton delete_v= new JButton("Delete");
    
    
    
    
    void Videoplayer()
    {
    
     //close operation
        
        this.addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        );
          
        
        
       //Welcome Form
        setLayout(null);
        setBounds(500, 50, 600, 650);
        setBackground(Color.LIGHT_GRAY);
       //logo & heading Label
        
        icon0.setBounds(55,40,500,300);
        welcome.setBounds(170,330,300,40);
        welcome.setFont(font1);
        //Add logo & heading Label
       
        add(icon0); 
        add(welcome);
        //create username & password
        telllabel.setBounds(110,390,360,30);
        user.setBounds(110,440,40,70);
        userlabel.setBounds(160,450,100,30);
        pass.setBounds(110,480,40,70);
        passlabel.setBounds(160,505,100,30);
        //add fonts username & password
        telllabel.setFont(font);
        userlabel.setFont(font);
        passlabel.setFont(font);
        //Welcome Frame Text Fields
        usertext.setBounds(260,450,210,30);
        passtext.setBounds(260,505,210,30);
        //Welcome Frame Button Log in
        submitpass.setBounds(260,560,100,50);
        
        //add to password frame
        add(telllabel);
        add(user);
        add(pass);
        add(passlabel);
        add(userlabel);
        add(usertext);
        add(passtext);
        add(submitpass);
        //add actionlistener to password frame
        submitpass.addActionListener(this);
       
        setVisible(true);
        
        
        //create Choose Frame
        chooseframe.setLayout(null);
        chooseframe.setBounds(500, 50, 600, 650);
        icon.setBounds(50,-30,500,300);
        choose.setBounds(175,240,300,40);
        choose.setFont(font1);
        add.setBounds(200, 295, 200, 50);       
        search.setBounds(200, 365, 200, 50);
        delete.setBounds(200, 435, 200, 50);
        logout.setBounds(250, 505, 100, 50);
        
        //add button to choose frame
        chooseframe.add(icon);
        chooseframe.add(choose);
        chooseframe.add(add);
        chooseframe.add(search);
        chooseframe.add(delete);
        chooseframe.add(logout);
        //add action listener to choose frame
        add.addActionListener(this);
        search.addActionListener(this);
        delete.addActionListener(this);
        logout.addActionListener(this); 
        
        
        
        
         //Add Video Frame
        add_video.setLayout(null);
        add_video.setBounds(500, 50, 600, 650);
        icon3.setBounds(50,40,500,320);
        //add_video heading Label
        addv.setBounds(150,350,300,40);
        addv.setFont(font2);
        //add_video Labels Fonts
        labeladdv.setFont(font3);
        //add_video Label
        labeladdv.setBounds(150,420,100,30);
        //add_video Text Fields
        addtv.setBounds(230,420,210,30);
        //Create add_video Buttons
        addprevious.setBounds(150, 500, 100, 50);
        insert.setBounds(345, 500, 100, 50);  
        //Add add_video Buttons
        add_video.add(icon3);
        add_video.add(addv);
        add_video.add(labeladdv);
        add_video.add(addtv);
        add_video.add(insert);
        add_video.add(addprevious);
        //add_video Buttuns Action Listener
        insert.addActionListener(this); 
        addprevious.addActionListener(this);
        
    
    
        
        
        //search_Video Frame
        search_video.setLayout(null);
        search_video.setBounds(500, 50, 600, 650);
        icons3.setBounds(50,40,500,320);
        //search_Video heading Label
        searchv.setBounds(150,350,300,40);
        searchv.setFont(font2);
        //search_Video Labels Fonts
        labelsearchv.setFont(font3);
        //search_Video Label
        labelsearchv.setBounds(150,420,100,30);
        //search_Video Text Fields
        searchtv.setBounds(230,420,210,30);
        //Create search_Video Buttons
        searchprevious.setBounds(150, 500, 100, 50);  
        search_v.setBounds(345, 500, 100, 50);
         
        //Add search_Video Buttons
        search_video.add(icons3);
        search_video.add(searchv);
        search_video.add(labelsearchv);
        search_video.add(searchtv);
        search_video.add(search_v);
        search_video.add(searchprevious);
        //search_Video Buttuns Action Listener
        search_v.addActionListener(this); 
        searchprevious.addActionListener(this);
        
        

        
        
     //Delete_Video Frame
        Delete_Video.setLayout(null);
        Delete_Video.setBounds(500, 50, 600, 650);
        icond3.setBounds(50,40,500,320);
        //Delete_Video heading Label
        deletev.setBounds(150,350,300,40);
        deletev.setFont(font2);
        //Delete_Video Labels Fonts
        labeldeletev.setFont(font3);
        //Delete_Video Label
        labeldeletev.setBounds(150,420,100,30);
        //Delete_Video Text Fields
        deletetv.setBounds(230,420,210,30);
        //Create Delete_Video Buttons
        deleteprevious.setBounds(150, 500, 100, 50);  
        delete_v.setBounds(345, 500, 100, 50);
         
        //Add Delete_Video Buttons
        Delete_Video.add(icond3);
        Delete_Video.add(deletev);
        Delete_Video.add(labeldeletev);
        Delete_Video.add(deletetv);
        Delete_Video.add(delete_v);
        Delete_Video.add(deleteprevious);
        //Delete_Video Buttuns Action Listener
        delete_v.addActionListener(this); 
        deleteprevious.addActionListener(this);
        
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */     
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       if (ae.getSource()==submitpass)
        {
         if(usertext.getText().equals("khalid")&&passtext.getText().equals("1321"))
         {
             chooseframe.setVisible(true);
             setVisible(false);
             usertext.setText("");
             passtext.setText("");
         }
         else
         {
             telllabel.setText("Wrong Username or Password try again :");
             usertext.setText("");
             passtext.setText("");
         }
        }
    
       else if(ae.getSource()==logout)
        { 
            chooseframe.setVisible(false);   
            setVisible(true);
        }
       
       
        else if (ae.getSource()==add)
        {
            add_video.setVisible(true);
            chooseframe.setVisible(false); 
        }
       
        else if(ae.getSource()==addprevious)
        { 
            add_video.setVisible(false);   
            chooseframe.setVisible(true);
        }
       
        
         else if (ae.getSource()==search)
        {
            search_video.setVisible(true);
            chooseframe.setVisible(false); 
        }
       
        else if(ae.getSource()==searchprevious)
        { 
            search_video.setVisible(false);   
            chooseframe.setVisible(true);
        }
        
        
         else if (ae.getSource()==delete)
        {
            Delete_Video.setVisible(true);
            chooseframe.setVisible(false); 
        }
       
        else if(ae.getSource()==deleteprevious)
        { 
            Delete_Video.setVisible(false);   
            chooseframe.setVisible(true);
        }
       
       
       else if(ae.getSource()==insert)
       {
       insertfirst(searchtv.getText());
       searchtv.setText(" ");
       }
       else if(ae.getSource()==search_v)
       {
       search("C:\\Users\\Laptop-Academy.com\\Desktop\\New folder"+searchtv.getText()+".mp4");
       
     
       }
       
       else if(ae.getSource()==delete_v)
       {
       
        remove("C:\\Users\\Laptop-Academy.com\\Desktop\\New folder\\"+searchtv.getText()+".mp4");
  
       }
       
       
       
       
    }
    
    
    public static void main(String[] args)
    {
       Videoplayer v=new Videoplayer();
       v.Videoplayer();
     
    }
    
    
}
