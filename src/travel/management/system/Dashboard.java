/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class Dashboard extends JFrame {
    Dashboard() {
        setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel ();
                p1.setLayout(null);
                p1.setBackground(new Color(0,0,102));
                p1.setBounds(0,0,1600,65);
                add(p1);
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
                Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel icon = new JLabel(i3);
                icon.setBounds(5, 0,70, 70);
                p1.add(icon);
                
                JLabel heading = new JLabel("Dashboard");
                heading.setBounds(80, 10, 300, 40);
                heading.setForeground(Color.WHITE);
                heading.setFont(new Font("Tahoma",Font.BOLD,30));
                p1.add(heading);
                
                JPanel p2 = new JPanel();
                p2.setLayout(null);
                p2.setBackground(new Color(0,0,102));
                p2.setBounds(0,0,1600,65);
                add(p2);
                
                JButton addPersonalDetails = new JButton("Add personal details");
                addPersonalDetails.setBounds(0, 0 ,300, 50);
                addPersonalDetails.setBackground(new Color(0,0,102));
                addPersonalDetails.setForeground(Color.WHITE);
                addPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,30));
                addPersonalDetails.setMargin(new Insets(0,0,0,60));
                p2.add( addPersonalDetails);
                
                JButton UpdatePersonalDetails = new JButton("Update personal details");
                UpdatePersonalDetails.setBounds(0, 0 ,300, 50);
                UpdatePersonalDetails.setBackground(new Color(0,0,102));
                UpdatePersonalDetails.setForeground(Color.WHITE);
                UpdatePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,30));
                UpdatePersonalDetails.setMargin(new Insets(0,0,0,60));
                p2.add(UpdatePersonalDetails);
                
                
                JButton ViewPersonalDetails = new JButton("View personal details");
                ViewPersonalDetails.setBounds(0, 0 ,300, 50);
                ViewPersonalDetails.setBackground(new Color(0,0,102));
                ViewPersonalDetails.setForeground(Color.WHITE);
                ViewPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,30));
                ViewPersonalDetails.setMargin(new Insets(0,0,0,60));
                p2.add(ViewPersonalDetails);
                
                JButton deletePersonalDetails = new JButton("delete personal details");
                deletePersonalDetails.setBounds(0, 0 ,300, 50);
                deletePersonalDetails.setBackground(new Color(0,0,102));
                deletePersonalDetails.setForeground(Color.WHITE);
                deletePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,30));
                deletePersonalDetails.setMargin(new Insets(0,0,0,60));
                p2.add(deletePersonalDetails);
                
                JButton checkpackages = new JButton("Check Package");
                checkpackages .setBounds(0, 0 ,300, 50);
                checkpackages .setBackground(new Color(0,0,102));
                checkpackages .setForeground(Color.WHITE);
                checkpackages .setFont(new Font("Tahoma",Font.BOLD,30));
                checkpackages .setMargin(new Insets(0,0,0,60));
                p2.add(checkpackages );
                
                JButton Bookpackages = new JButton("Book Package");
                Bookpackages .setBounds(0, 0 ,300, 50);
                Bookpackages .setBackground(new Color(0,0,102));
                Bookpackages .setForeground(Color.WHITE);
                Bookpackages .setFont(new Font("Tahoma",Font.BOLD,30));
                Bookpackages .setMargin(new Insets(0,0,0,60));
                p2.add(Bookpackages );
                
                
                JButton Viewpackages = new JButton("View Package");
                Viewpackages .setBounds(0, 0 ,300, 50);
                Viewpackages .setBackground(new Color(0,0,102));
                Viewpackages .setForeground(Color.WHITE);
                Viewpackages .setFont(new Font("Tahoma",Font.BOLD,30));
                Viewpackages .setMargin(new Insets(0,0,0,60));
                p2.add(Viewpackages );
                
                JButton ViewHotels = new JButton("View Hotels");
                ViewHotels .setBounds(0, 0 ,300, 50);
                ViewHotels .setBackground(new Color(0,0,102));
                ViewHotels.setForeground(Color.WHITE);
                ViewHotels.setFont(new Font("Tahoma",Font.BOLD,30));
                ViewHotels .setMargin(new Insets(0,0,0,60));
                p2.add(ViewHotels );
                
                JButton BookHotels = new JButton("Book Hotels");
                BookHotels .setBounds(0, 0 ,300, 50);
                BookHotels .setBackground(new Color(0,0,102));
                BookHotels.setForeground(Color.WHITE);
                BookHotels.setFont(new Font("Tahoma",Font.BOLD,30));
                BookHotels .setMargin(new Insets(0,0,0,60));
                p2.add(BookHotels );
                
                JButton viewBookedHotels = new JButton("viewBookedHotels");
                viewBookedHotels .setBounds(0, 0 ,300, 50);
                viewBookedHotels.setBackground(new Color(0,0,102));
                viewBookedHotels.setForeground(Color.WHITE);
                viewBookedHotels.setFont(new Font("Tahoma",Font.BOLD,30));
                viewBookedHotels .setMargin(new Insets(0,0,0,60));
                p2.add(viewBookedHotels );
                
                JButton destinations = new JButton("Destinations");
                destinations.setBounds(0, 0 ,300, 50);
                destinations.setBackground(new Color(0,0,102));
                destinations.setForeground(Color.WHITE);
                destinations.setFont(new Font("Tahoma",Font.BOLD,30));
                destinations .setMargin(new Insets(0,0,0,60));
                p2.add(destinations);
                
                JButton Payments = new JButton("Payments");
                Payments.setBounds(0, 0 ,300, 50);
                Payments.setBackground(new Color(0,0,102));
                Payments.setForeground(Color.WHITE);
                Payments.setFont(new Font("Tahoma",Font.BOLD,30));
                Payments.setMargin(new Insets(0,0,0,60));
                p2.add(Payments);
                
                JButton about = new JButton("About");
                about.setBounds(0, 0 ,300, 50);
                about.setBackground(new Color(0,0,102));
                about.setForeground(Color.WHITE);
                about.setFont(new Font("Tahoma",Font.BOLD,30));
                about.setMargin(new Insets(0,0,0,60));
                p2.add(about);
                
                ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
                Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel image = new JLabel(i6);
                image.setBounds(0, 0 , 1650,1000);
                add(image);
                
                JLabel text = new JLabel("Travel and Tourism management");
                text.setBounds(400,70,1200,70);
                text.setForeground(Color.WHITE);
                text.setFont(new Font("Raleway", Font.PLAIN, 40));
                image.add(text); 
        
    }
    
   
}