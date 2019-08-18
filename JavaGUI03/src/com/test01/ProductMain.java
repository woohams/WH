package com.test01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ProductMain extends JFrame{

	private JTabbedPane tabbedPane;
	private JToolBar toolBar;
	private JPanel pTab1, pTab2, pBottom, pNorth, pN1, pN2;
	private JTable table1, table2;
	private JScrollPane scrollPane1, scrollPane2;
	private JRadioButton rdPdName, rdPrice;
	private ButtonGroup btGroup;
	private JComboBox<String> cbPdName;
	private JLabel lbId, lb1;
	private JTextField tfId, tfPrice1, tfPrice2;
	private JButton btSearch, btAdd, btEdit, btExit;
	private DefaultTableModel model1 = new DefaultTableModel();
	private DefaultTableModel model2 = new DefaultTableModel();
	
	String[] colNames = {"��ȣ","��ǰ��","����","��ǰ����","�����"};
	
	public ProductMain() {
		super("��ǰ ����");
		
		toolBar = new JToolBar();
		btAdd = new JButton("���");
		btEdit = new JButton("����");
		btExit = new JButton("����");

		tabbedPane = new JTabbedPane();
		pTab1 = new JPanel(new BorderLayout());
		pTab2 = new JPanel(new BorderLayout());

		pBottom=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		lbId=new JLabel("���̵� : ");
		tfId=new JTextField(10);

		table1 = new JTable();

		scrollPane1=new JScrollPane();
		scrollPane1.setPreferredSize(new Dimension(300, scrollPane1.getHeight()));

		pNorth = new JPanel(new GridLayout(2, 1, 5,5));
		pN1 = new JPanel();

		rdPdName = new JRadioButton("��ǰ������ �˻�", true);
		cbPdName = new JComboBox<String>();

		pN2=new JPanel();

		rdPrice = new JRadioButton("�������� �˻�");
		tfPrice1=new JTextField(10);
		tfPrice2=new JTextField(10);
		lb1=new JLabel("~");
		btSearch = new JButton("�˻�");
		
		btGroup = new ButtonGroup();
		
		
		go();
	}
	
	private void go(){		

		toolBar.add(btAdd);
		toolBar.add(btEdit);
		toolBar.add(btExit);
		add(toolBar,"North");
		
		tabbedPane.addTab("��ǰ���", pTab1);
		tabbedPane.addTab("��ǰ�˻�", pTab2);
		add(tabbedPane,"Center");

		pBottom.add(lbId);
		pBottom.add(tfId);
		add(pBottom, "South");

		pBottom.add(lbId);
		pBottom.add(tfId);
		add(pBottom, "South");

		// tab1
		model1.addColumn("��ȣ");
		model1.addColumn("��ǰ��");
		model1.addColumn("����");

		table1.setModel(model1);
		scrollPane1.setViewportView(table1);
		pTab1.add(scrollPane1, "West");

		// tab2
		pNorth.setBorder(new TitledBorder("��ȸ����"));
		FlowLayout fLayout = (FlowLayout)pN1.getLayout();
		fLayout.setAlignment(FlowLayout.LEFT);

		cbPdName.addItem("�󺥴�");
		cbPdName.addItem("�ڽ���");
		cbPdName.setPreferredSize(
				new Dimension(170, 25));
		pN1.add(rdPdName);
		pN1.add(cbPdName);

		pNorth.add(pN1);
		pTab2.add(pNorth, "North");

		FlowLayout fLayout2 = (FlowLayout) pN2.getLayout();
		fLayout2.setAlignment(FlowLayout.LEFT);

		btGroup.add(rdPdName);
		btGroup.add(rdPrice);
		
		pN2.add(rdPrice);
		pN2.add(tfPrice1);
		pN2.add(lb1);
		pN2.add(tfPrice2);
		pN2.add(btSearch);
		
		pNorth.add(pN2);
		
		model2.addColumn("��ȣ");
		model2.addColumn("��ǰ��");
		model2.addColumn("����");
		model2.addColumn("��ǰ ����");
		model2.addColumn("�����");

		table2 = new JTable();
		table2.setModel(model2);
		
		scrollPane2 = new JScrollPane();

		table2.getTableHeader().setBackground(Color.black);
		table2.getTableHeader().setForeground(Color.yellow);
		table2.getTableHeader().setReorderingAllowed(false);
		table2.getTableHeader().setPreferredSize(
			new Dimension(scrollPane2.getWidth(), 28));
		table2.setRowHeight(24);
		
		scrollPane2.setViewportView(table2);
		
		pTab2.add(scrollPane2,"Center");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProductMain();
	}
}







































