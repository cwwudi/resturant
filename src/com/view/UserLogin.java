package com.view;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.model.UserModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class UserLogin extends JDialog implements ActionListener {
	int width,height;
	JButton jcon,jcancel;
	JLabel jlb1,jlb2,jlb3;
	JTextField jname;
	JPasswordField jpassword;
	Font font=new Font("宋体",Font.PLAIN,16);
	Font font2=new Font("黑体", Font.PLAIN, 12);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		UserLogin u=new UserLogin();
	}
    public UserLogin() throws IOException
    { 	
    	//组件
    	jcon=new JButton("确定");
    	jcon.setFont(font);
    	jcon.setBounds(110, 300, 70, 30);
    	jcon.addActionListener(this);
    	this.add(jcon);
    	
    	jcancel=new JButton("取消");
    	jcancel.setFont(font);
    	jcancel.setBounds(210, 300, 70, 30);
    	jcancel.addActionListener(this);
    	this.add(jcancel);
    	
    	jlb1=new JLabel("请输入用户名：");
    	jlb1.setFont(font);
    	jlb1.setBounds(60,190,150,30);
    	
    	this.add(jlb1);
    	
    	jlb2=new JLabel("密        码:");
    	jlb2.setFont(font);
    	jlb2.setBounds(60, 240, 150, 30);
    	this.add(jlb2);
    	
    	jlb3=new JLabel("(员工号)");
    	jlb3.setFont(font2);
    	jlb3.setForeground(Color.red);
    	jlb3.setBounds(120, 210, 100, 30);
    	this.add(jlb3);
    	
    	jname=new JTextField();
    	jname.setBounds(180, 190, 120, 30);
    	jname.setBorder(BorderFactory.createLoweredBevelBorder());
    	this.add(jname);
    	
    	jpassword=new JPasswordField();
    	jpassword.setBounds(180, 240, 120, 30);
    	jpassword.setBorder(BorderFactory.createLoweredBevelBorder());
    	this.add(jpassword);
    	
    	//创建背景
    	this.setLayout(null);
    	BackImage bi=new BackImage();
    	bi.setBounds(0, 0, 360, 360);
    	this.setUndecorated(true);
    	this.add(bi);
    	this.setSize(360, 360);
    	width=Toolkit.getDefaultToolkit().getScreenSize().width;
		height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200,height/2-150);
		
		
    	this.setVisible(true);
    	
    }
    
    
    public class BackImage extends JPanel
    {   Image image;
    	public BackImage() throws IOException
    	{
    		 image=ImageIO.read(new File("image/login.gif"));
    		 
    	}
    	public void paintComponent(Graphics g)
    	{
    		g.drawImage(image,0,0,360,360,this);
    	}
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jcon)
		{	
			String id=jname.getText().trim();
			String psd=new String(jpassword.getPassword());
			//System.out.println(id+psd);
			UserModel um=new UserModel();
			String zhiwei=um.checkUser(id, psd).trim();
			System.out.print(zhiwei);
			if(zhiwei.equals("经理")||zhiwei.equals("主管")||zhiwei.equals("管理员"))
			{
				try {
					new Windows1();
					this.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==jcancel)
		{
			this.dispose();
		}
	}
}
