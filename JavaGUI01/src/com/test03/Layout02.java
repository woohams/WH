package com.test03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Layout02 extends Frame{
	
	private void makeButton(String name, GridBagLayout gridBag, GridBagConstraints constraints) {
		Button btn = new Button(name);	// ��ư�� �ְ�
		gridBag.setConstraints(btn, constraints);	// �Ӽ��� �ְ�
		add(btn);	// add
	}
	
	public void go() {
		
		// ���ڹ��� Layout(��� ���� ������, �ٵ���)
		GridBagLayout gridBag = new GridBagLayout();
		// �Ӽ� (��������)
		GridBagConstraints constraints = new GridBagConstraints();
		
		setLayout(gridBag);
		
		// fill : componnent�� ũ�� - NONE, HORIZONTAL(����,����), VERTICAL(����,����), BOTH(����,����)
		constraints.fill = GridBagConstraints.BOTH;	// BOTH : ����,���� ����ä��
		
		// weightx : ���� ����(%)
		constraints.weightx = 1.0;	// �߰� ���� ������ �й��ϴ� ����� �����մϴ�.
		makeButton("Btn01", gridBag, constraints);
		makeButton("Btn02", gridBag, constraints);
		makeButton("Btn03", gridBag, constraints);
		
		// gridwidth : row�� �Ӽ� (���� cell ����)
		// REMAINDER : component�� row�� �������̴�.
		constraints.gridwidth = GridBagConstraints.REMAINDER;	// REMAINDER : �� ���۳�Ʈ�� �� �Ǵ� ���� ������ ����������� ����
		makeButton("Btn04" , gridBag, constraints);
		
		constraints.weightx = 0.0;
		makeButton("Btn05" , gridBag, constraints);
		
		// RELATIVE : component�� row�� ������ "����"
		constraints.gridwidth = GridBagConstraints.RELATIVE;	// RELATIVE : �� ���۳�Ʈ�� �� �Ǵ� ���� ������ ���۳�Ʈ(gridwidth, gridheight),
		makeButton("Btn06" , gridBag, constraints);				//			�Ǵ� �� ���۳�Ʈ ������ �߰� �� ���۳�Ʈ (gridx, gridy)�� ���� ��ġ�ǵ��� �����մϴ�.
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;	
		makeButton("Btn07" , gridBag, constraints);
		
		// ���� 2ĭ�� �Ҵ�
		constraints.gridwidth = 2;
		// ���� 2ĭ�� �Ҵ�
		constraints.gridheight = 2;
		constraints.weighty = 1.0;
		makeButton("Btn08" , gridBag, constraints);
		
		constraints.weighty = 0.0;	// �긦 �����ν� Btn09�� Btn10�� ũ�Ⱑ ���̳���. Btn09�� weighty�� 0.0(�⺻)�� �Ǽ� ���� ������ Btn10�� ����.
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight =1;
		makeButton("Btn09" , gridBag, constraints);
		makeButton("Btn10" , gridBag, constraints);
				
		constraints.gridwidth = 2;	// width�� 2�� �����ν� Btn12�� �ݹ��� ������ �ȴ�.
		makeButton("Btn11" , gridBag, constraints);
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		makeButton("Btn12" , gridBag, constraints);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Layout02().go();
		
	}

}
