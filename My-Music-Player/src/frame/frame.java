/**
 * 
 */
/**
 * @author Administrator
 *
 */
package frame;
import java.awt.*;

import javax.swing.*;



	public class frame { 
		
		
		public  frame() {
			JFrame mainframe = new JFrame("MY-Music-Player");
			mainframe.setTitle("MY_Music_player");                           //���ô��ڵı���
			mainframe.setBounds(350,140,1300,800);                             //���ô��ڵ�λ�����С
			ImageIcon ICON_T = new ImageIcon(getClass().getResource("/Picture/����Ȧ.png")); //����ͼƬ����Ϊ����ͼ��
			mainframe.setIconImage(ICON_T.getImage());
			mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		   //���ô��ڿɹر�

			//����һ��Panel�����Ҹ����䱳����ɫΪ��ɫ
			JPanel Panel1 = new JPanel();
			Panel1.setBackground(Color.WHITE);
			//����ͼƬ
			ImageIcon leftone = new ImageIcon(Image.class.getResource("/picture/left-circle.png")); 
			ImageIcon middleone = new ImageIcon(Image.class.getResource("/picture/bofang.png"));
			ImageIcon Rightone = new ImageIcon(Image.class.getResource("/picture/right-circle.png"));
			JLabel Label1 = new JLabel(leftone);
			JLabel Label2 = new JLabel(middleone);
			JLabel Label3 = new JLabel(Rightone);
			Panel1.add(Label1);
			Panel1.add(Label2);
			Panel1.add(Label3);
			Panel1.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
			//����һ����ָ���,���������������Panel1
			JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT); 
			vSplitPane.setDividerLocation(1);
			vSplitPane.setDividerSize(0);
			vSplitPane.setEnabled(false);
			mainframe.add(vSplitPane,BorderLayout.SOUTH);
			vSplitPane.setRightComponent(Panel1);              //�ָ����ұ����Panel1

			//����һ��Panel�����Ҹ����䱳����ɫΪ��ɫ
			JPanel Panel2 = new JPanel();
			Panel2.setBackground(Color.RED);
			Panel2.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
			
			//����ͼƬ
			/*
			ImageIcon yinyue = new ImageIcon(Image.class.getResource("/picture/music.png"));
			JLabel music = new JLabel(yinyue);
			Panel2.add(music);
			*/
			
			
			
			//����һ�����ָ���,���Ұ�
			JSplitPane hSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
			hSplitPane.setDividerLocation(100);
			hSplitPane.setDividerSize(1);
			hSplitPane.setEnabled(false);
			mainframe.add(hSplitPane,BorderLayout.WEST);
			hSplitPane.setLeftComponent(Panel2);
			

			mainframe.setVisible(true);
			mainframe.setLocationRelativeTo(null);
		
			
		}

		

	}
