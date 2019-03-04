/***
   * ϵͳ����Ա����
   * ˳�� �ϡ����£��󡪡���
 */
package com.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;

import com.tools.ImagePanel;
import com.tools.MyTools;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Windows1 extends JFrame  implements ActionListener,MouseListener {
	Image titleIcon,timebg;
	JMenuBar jmb=null;
	JMenu jm1,jm2 ,jm3,jm4,jm5,jm6;
	JMenuItem jmt11,jmt12,jmt13,jmt14,jmt15,jmt16,jmt17,jmt18,jmt19,jmt110,jmt111;
	ImageIcon jmt11_icon,jmt12_icon,jmt13_icon,jmt14_icon,jmt15_icon;
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	JPanel jp1,jp2,jp3,jp4,jp5;
	JLabel jl1;
	Timer timer=null;
	ImagePanel p1bg;
	JLabel p1_jl1,p1_jl2,p1_jl3,p1_jl4,p1_jl5,p1_jl6,p1_jl7,p1_jl8;
	JLabel p2_jl1,p2_jl2;
	JSplitPane jslp;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Windows1 w1=new Windows1();  
	}
	public Windows1() throws IOException
	{	//����ͼ��
		jmt11_icon=new ImageIcon("image/jm1_icon1.jpg");
		jmt12_icon=new ImageIcon("image/jm1_icon2.jpg");
		jmt13_icon=new ImageIcon("image/jm1_icon3.jpg");
		jmt14_icon=new ImageIcon("image/jm1_icon4.jpg");
		jmt15_icon=new ImageIcon("image/jm1_icon5.jpg");
		//���
		titleIcon=ImageIO.read(new File("image/title.gif"));
		//���ô�С
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(width, height-25);
		
		this.setIconImage(titleIcon);
		this.setTitle("����¥��������ϵͳ��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//һ���˵���
		jm1=new JMenu("ϵͳ����");
		jm1.setFont(MyTools.f1);
		//�����˵�
		jmt11=new JMenuItem("�л��û�",jmt11_icon);
		
		jmt11.setFont(MyTools.f2);
		jm1.add(jmt11);
		
		jmt12=new JMenuItem("�л����տ����",jmt12_icon);
		jmt12.setFont(MyTools.f2);
		jm1.add(jmt12);
		
		jmt13=new JMenuItem("��¼����",jmt13_icon);
		jmt13.setFont(MyTools.f2);
		jm1.add(jmt13);
		
		jmt14=new JMenuItem("������",jmt14_icon);
		jmt14.setFont(MyTools.f2);
		jm1.add(jmt14);
		
		jmt15=new JMenuItem("�˳�",jmt15_icon);
		jmt15.setFont(MyTools.f2);
		jm1.add(jmt15);
		//�����˵���ӵ�һ���˵�
		
		
		
		
		
		
		
		jm2=new JMenu("���¹���");
		jm2.setFont(MyTools.f1);
		
		jm3=new JMenu("�˵�����");
		jm3.setFont(MyTools.f1);
		
		jm4=new JMenu("����ͳ��");
		jm4.setFont(MyTools.f1);
		
		jm5=new JMenu("�ɱ����ⷿ");
		jm5.setFont(MyTools.f1);
		
		jm6=new JMenu("����");
		jm6.setFont(MyTools.f1);
		
		jmb=new JMenuBar();
		//����jmeunbar
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		jmb.add(jm6);
		
		//������
		jtb=new JToolBar();
		jtb.setFloatable(false);
		jb1=new JButton(new ImageIcon("image/toolBar_image/jb1.jpg"));
		jb2=new JButton(new ImageIcon("image/toolBar_image/jb2.jpg"));
		jb3=new JButton(new ImageIcon("image/toolBar_image/jb3.jpg"));
		jb4=new JButton(new ImageIcon("image/toolBar_image/jb4.jpg"));
		jb5=new JButton(new ImageIcon("image/toolBar_image/jb5.jpg"));
		jb6=new JButton(new ImageIcon("image/toolBar_image/jb6.jpg"));
		jb7=new JButton(new ImageIcon("image/toolBar_image/jb7.jpg"));
		jb8=new JButton(new ImageIcon("image/toolBar_image/jb8.jpg"));
		jb9=new JButton(new ImageIcon("image/toolBar_image/jb9.jpg"));
		jb10=new JButton(new ImageIcon("image/toolBar_image/jb10.jpg"));
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		jtb.add(jb7);
		jtb.add(jb8);
		jtb.add(jb9);
		jtb.add(jb10);
		this.add(jtb,BorderLayout.NORTH);
		//jp1
		
		jp1=new JPanel(new BorderLayout());
		
		Image p1_bg= ImageIO.read(new File("image/center_image/jp1_bg.jpg"));
		p1bg=new ImagePanel(p1_bg);
		p1bg.setLayout(new GridLayout(8, 1));
		p1_jl1=new JLabel(new ImageIcon("image/center_image/label_1.gif"));
		p1_jl1.setFont(MyTools.f3);
		p1bg.add(p1_jl1);
		p1_jl2=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_2.jpg"),0);
		p1_jl2.setFont(MyTools.f3);
		p1_jl2.setEnabled(false);
		p1bg.add(p1_jl2);
		p1_jl3=new JLabel("�� ¼ �� ��",new ImageIcon("image/center_image/label_3.jpg"),0);
		p1_jl3.setFont(MyTools.f3);
		p1_jl3.setEnabled(false);
		p1bg.add(p1_jl3);
		p1_jl4=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_4.jpg"),0);
		p1_jl4.setFont(MyTools.f3);
		p1_jl4.setEnabled(false);
		p1bg.add(p1_jl4);
		p1_jl5=new JLabel("�� �� ͳ ��",new ImageIcon("image/center_image/label_5.jpg"),0);
		p1_jl5.setFont(MyTools.f3);
		p1_jl5.setEnabled(false);
		p1bg.add(p1_jl5);
		p1_jl6=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_6.jpg"),0);
		p1_jl6.setFont(MyTools.f3);
		p1_jl6.setEnabled(false);
		p1bg.add(p1_jl6);
		p1_jl7=new JLabel("ϵ ͳ �� ��",new ImageIcon("image/center_image/label_7.jpg"),0);
		p1_jl7.setFont(MyTools.f3);
		p1_jl7.setEnabled(false);
		p1bg.add(p1_jl7);
		p1_jl8=new JLabel("ϵ ͳ �� ��",new ImageIcon("image/center_image/label_8.jpg"),0);
		p1_jl8.setFont(MyTools.f3);
		p1_jl8.setEnabled(false);
		p1bg.add(p1_jl8);
		jp1.add(p1bg);
		
		//jp2,jp3,jp4
		jp4=new JPanel(new BorderLayout());
		jp2=new JPanel(new CardLayout());
		p2_jl1=new JLabel(new ImageIcon("image/center_image/jp2_left.jpg"));
		p2_jl2=new JLabel(new ImageIcon("image/center_image/jp2_right.jpg"));
		jp2.add(p2_jl1,"left");
		jp2.add(p2_jl2,"right");
		jp3=new JPanel(new CardLayout());
		Image zhu_image=ImageIO.read(new File("image/center_image/jp3_bg.jpg"));
		ImagePanel zhuye=new ImagePanel(zhu_image);
		jp3.add(zhuye,"0");
		jp4.add(jp2,BorderLayout.WEST);
		jp4.add(jp3,BorderLayout.CENTER);
		jslp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,jp1,jp4);
		jslp.setDividerLocation(120);
		jslp.setDividerSize(0);
		//this.add(jp4,BorderLayout.EAST);
		//jp5
		timebg=ImageIO.read(new File("image/time_bg.jpg"));
		jp5=new JPanel(new BorderLayout());
		timer=new Timer(1000, this);
		timer.start();
		jl1=new JLabel("��ǰʱ�䣺"+Calendar.getInstance().getTime().toLocaleString());
		jl1.setFont(MyTools.f1);
		ImagePanel ip=new ImagePanel(timebg);
		ip.setLayout(new BorderLayout());
		jp5.add(ip,BorderLayout.CENTER);
		ip.add(jl1,BorderLayout.EAST);
		this.add(jp5,BorderLayout.SOUTH);
		this.add(jslp,BorderLayout.CENTER);
		this.setJMenuBar(jmb);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.jl1.setText("��ǰʱ�䣺"+Calendar.getInstance().getTime().toLocaleString());
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
