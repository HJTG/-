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
			mainframe.setTitle("MY_Music_player");                           //设置窗口的标题
			mainframe.setBounds(350,140,1300,800);                             //设置窗口的位置与大小
			ImageIcon ICON_T = new ImageIcon(getClass().getResource("/Picture/救生圈.png")); //导入图片，作为窗口图标
			mainframe.setIconImage(ICON_T.getImage());
			mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		   //设置窗口可关闭

			//设置一个Panel，并且更改其背景颜色为白色
			JPanel Panel1 = new JPanel();
			Panel1.setBackground(Color.WHITE);
			//导入图片
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
			//设置一条横分割线,并且在其下面放置Panel1
			JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT); 
			vSplitPane.setDividerLocation(1);
			vSplitPane.setDividerSize(0);
			vSplitPane.setEnabled(false);
			mainframe.add(vSplitPane,BorderLayout.SOUTH);
			vSplitPane.setRightComponent(Panel1);              //分割线右边添加Panel1

			//设置一个Panel，并且更改其背景颜色为白色
			JPanel Panel2 = new JPanel();
			Panel2.setBackground(Color.RED);
			Panel2.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
			
			//导入图片
			/*
			ImageIcon yinyue = new ImageIcon(Image.class.getResource("/picture/music.png"));
			JLabel music = new JLabel(yinyue);
			Panel2.add(music);
			*/
			
			
			
			//设置一条竖分割线,并且把
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
