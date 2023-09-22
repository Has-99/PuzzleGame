import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class picpuzzle extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,keyB;
	Icon key;
	Icon ic0=new ImageIcon("pic/keyB0.jpg");
	Icon ic10=new ImageIcon("pic/keyB10.jpg");
	Icon ic20=new ImageIcon("pic/keyB20.jpg");
	Icon samicon1=new ImageIcon("pic/main.jpg");
	Icon samicon2=new ImageIcon("pic/main2.jpg");
	Icon samicon3=new ImageIcon("pic/main3.jpg");
	Icon ic1=new ImageIcon("pic/1.jpg");
	Icon ic2=new ImageIcon("pic/5.jpg");
	Icon ic3=new ImageIcon("pic/2.jpg");
	Icon ic4=new ImageIcon("pic/7.jpg");
	Icon ic5=new ImageIcon("pic/4.jpg");
	Icon ic6=new ImageIcon("pic/6.jpg");
	Icon ic7=new ImageIcon("pic/8.jpg");
	Icon ic8=new ImageIcon("pic/9.jpg");
	Icon ic9=new ImageIcon("pic/3.jpg");

	Icon ic11=new ImageIcon("pic/12.jpg");
	Icon ic12=new ImageIcon("pic/13.jpg");
	Icon ic13=new ImageIcon("pic/16.jpg");
	Icon ic14=new ImageIcon("pic/11.jpg");
	Icon ic15=new ImageIcon("pic/14.jpg");
	Icon ic16=new ImageIcon("pic/19.jpg");
	Icon ic17=new ImageIcon("pic/17.jpg");
	Icon ic18=new ImageIcon("pic/15.jpg");
	Icon ic19=new ImageIcon("pic/18.jpg");

	Icon ic21=new ImageIcon("pic/24.jpg");
	Icon ic22=new ImageIcon("pic/25.jpg");
	Icon ic23=new ImageIcon("pic/21.jpg");
	Icon ic24=new ImageIcon("pic/27.jpg");
	Icon ic25=new ImageIcon("pic/23.jpg");
	Icon ic26=new ImageIcon("pic/29.jpg");
	Icon ic27=new ImageIcon("pic/28.jpg");
	Icon ic28=new ImageIcon("pic/22.jpg");
	Icon ic29=new ImageIcon("pic/26.jpg");

	picpuzzle(){

		super("pic_puzzle");

		b1=new JButton(ic1);
		b1.setBounds(10,80,100,100);
		b2=new JButton(ic2);
		b2.setBounds(110,80,100,100);
		b3=new JButton(ic3);
		b3.setBounds(210,80,100,100);
		b4=new JButton(ic4);
		b4.setBounds(10,180,100,100);
		b5=new JButton(ic5);
		b5.setBounds(110,180,100,100);
		b6=new JButton(ic6);
		b6.setBounds(210,180,100,100);
		b7=new JButton(ic7);
		b7.setBounds(10,280,100,100);
		b8=new JButton(ic8);
		b8.setBounds(110,280,100,100);
		b9=new JButton(ic9);
		b9.setBounds(210,280,100,100);
		sample=new JButton(samicon1);
		sample.setBounds(380,100,200,200);

		JLabel l1=new JLabel("Picture:");
		l1.setBounds(330,200,70,20);
		JLabel l2=new JLabel("NOTE:This icon can swap with neighbour icon =>");
		l2.setBounds(5,15,500,20);
		JLabel l3=new JLabel("Click on picture to start new game");
		l3.setBounds(380,320,200,20);
		l3.setForeground(Color.green);

		keyB=new JButton(ic0);
		keyB.setBounds(330,5,50,50);
		key=b9.getIcon();

		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);add(l1);add(l2);add(keyB);add(l3);
		b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
		sample.addActionListener(this);
		setLayout(null);
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			Icon s1=b1.getIcon();
			if(b2.getIcon()==key){
				b2.setIcon(s1);
				b1.setIcon(key);
			} else if(b4.getIcon()==key){
				b4.setIcon(s1);
				b1.setIcon(key);
			}
		}

		if(e.getSource()==b2){
			Icon s1=b2.getIcon();
			if(b1.getIcon()==key){
				b1.setIcon(s1);
				b2.setIcon(key);
			} else if(b5.getIcon()==key){
				b5.setIcon(s1);
				b2.setIcon(key);
			}
			else if(b3.getIcon()==key){
				b3.setIcon(s1);
				b2.setIcon(key);
			}
		}

		if(e.getSource()==b3){
			Icon s1=b3.getIcon();
			if(b2.getIcon()==key){
				b2.setIcon(s1);
				b3.setIcon(key);
			} else if(b6.getIcon()==key){
				b6.setIcon(s1);
				b3.setIcon(key);
				}
		}

		if(e.getSource()==b4){
			Icon s1=b4.getIcon();
			if(b1.getIcon()==key){
				b1.setIcon(s1);
				b4.setIcon(key);
			} else if(b5.getIcon()==key){
				b5.setIcon(s1);
				b4.setIcon(key);
			}
			else if(b7.getIcon()==key){
				b7.setIcon(s1);
				b4.setIcon(key);
			}
		}

		if(e.getSource()==b5){
			Icon s1=b5.getIcon();
			if(b2.getIcon()==key){
				b2.setIcon(s1);
				b5.setIcon(key);
			} else if(b4.getIcon()==key){
				b4.setIcon(s1);
				b5.setIcon(key);
			}
			else if(b6.getIcon()==key){
				b6.setIcon(s1);
				b5.setIcon(key);
			}
			else if(b8.getIcon()==key){
				b8.setIcon(s1);
				b5.setIcon(key);
			}
		}

		if(e.getSource()==b6){
			Icon s1=b6.getIcon();
			if(b3.getIcon()==key){
				b3.setIcon(s1);
				b6.setIcon(key);
			} else if(b5.getIcon()==key){
				b5.setIcon(s1);
				b6.setIcon(key);
			}
			else if(b9.getIcon()==key){
				b9.setIcon(s1);
				b6.setIcon(key);
			}
		}

		if(e.getSource()==b7){
			Icon s1=b7.getIcon();
			if(b4.getIcon()==key){
				b4.setIcon(s1);
				b7.setIcon(key);
			} else if(b8.getIcon()==key){
				b8.setIcon(s1);
				b7.setIcon(key);
			}
		}

		if(e.getSource()==b8){
			Icon s1=b8.getIcon();
			if(b7.getIcon()==key){
				b7.setIcon(s1);
				b8.setIcon(key);
			} else if(b5.getIcon()==key){
				b5.setIcon(s1);
				b8.setIcon(key);
				}
			else if(b9.getIcon()==key){
				b9.setIcon(s1);
				b8.setIcon(key);
			}

		}

		if(e.getSource()==b9){
			Icon s1=b9.getIcon();
			if(b8.getIcon()==key){
				b8.setIcon(s1);
				b9.setIcon(key);
			} else if(b6.getIcon()==key){
				b6.setIcon(s1);
				b9.setIcon(key);
				}
		}

		if(e.getSource()==sample){
			Icon s1=sample.getIcon();
			if(s1==samicon3){
				sample.setIcon(samicon1);
				b1.setIcon(ic1);
				b2.setIcon(ic2);
				b3.setIcon(ic3);
				b4.setIcon(ic4);
				b5.setIcon(ic5);
				b6.setIcon(ic6);
				b7.setIcon(ic7);
				b8.setIcon(ic8);
				b9.setIcon(ic9);
				key=b9.getIcon();
				keyB.setIcon(ic0);
			}
			else if(s1==samicon1){
				sample.setIcon(samicon2);
				b1.setIcon(ic11);
				b2.setIcon(ic12);
				b3.setIcon(ic13);
				b4.setIcon(ic14);
				b5.setIcon(ic15);
				b6.setIcon(ic16);
				b7.setIcon(ic17);
				b8.setIcon(ic18);
				b9.setIcon(ic19);
				key=b6.getIcon();
				keyB.setIcon(ic10);
				}
			else{
				sample.setIcon(samicon3);
				b1.setIcon(ic21);
				b2.setIcon(ic22);
				b3.setIcon(ic23);
				b4.setIcon(ic24);
				b5.setIcon(ic25);
				b6.setIcon(ic26);
				b7.setIcon(ic27);
				b8.setIcon(ic28);
				b9.setIcon(ic29);
				key=b6.getIcon();
				keyB.setIcon(ic20);
				}

		}
	}

	public static void main(String args[]){
	new picpuzzle();
	}
}