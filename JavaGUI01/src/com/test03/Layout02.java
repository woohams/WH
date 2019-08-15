package com.test03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Layout02 extends Frame{
	
	private void makeButton(String name, GridBagLayout gridBag, GridBagConstraints constraints) {
		Button btn = new Button(name);	// 버튼을 주고
		gridBag.setConstraints(btn, constraints);	// 속성을 넣고
		add(btn);	// add
	}
	
	public void go() {
		
		// 격자무늬 Layout(행과 열을 나눈다, 바둑판)
		GridBagLayout gridBag = new GridBagLayout();
		// 속성 (제약조건)
		GridBagConstraints constraints = new GridBagConstraints();
		
		setLayout(gridBag);
		
		// fill : componnent의 크기 - NONE, HORIZONTAL(수평,가로), VERTICAL(수직,세로), BOTH(가로,세로)
		constraints.fill = GridBagConstraints.BOTH;	// BOTH : 수평,수직 전부채움
		
		// weightx : 공간 분할(%)
		constraints.weightx = 1.0;	// 추가 수평 공간을 분배하는 방법을 지정합니다.
		makeButton("Btn01", gridBag, constraints);
		makeButton("Btn02", gridBag, constraints);
		makeButton("Btn03", gridBag, constraints);
		
		// gridwidth : row의 속성 (행의 cell 갯수)
		// REMAINDER : component가 row의 마지막이다.
		constraints.gridwidth = GridBagConstraints.REMAINDER;	// REMAINDER : 이 컴퍼넌트가 열 또는 행의 마지막 구성요소임을 지정
		makeButton("Btn04" , gridBag, constraints);
		
		constraints.weightx = 0.0;
		makeButton("Btn05" , gridBag, constraints);
		
		// RELATIVE : component가 row의 마지막 "전에"
		constraints.gridwidth = GridBagConstraints.RELATIVE;	// RELATIVE : 이 컴퍼넌트가 열 또는 행의 마지막 컴퍼넌트(gridwidth, gridheight),
		makeButton("Btn06" , gridBag, constraints);				//			또는 이 컴퍼넌트 이전에 추가 된 컴퍼넌트 (gridx, gridy)의 옆에 배치되도록 지정합니다.
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;	
		makeButton("Btn07" , gridBag, constraints);
		
		// 가로 2칸을 할당
		constraints.gridwidth = 2;
		// 세로 2칸을 할당
		constraints.gridheight = 2;
		constraints.weighty = 1.0;
		makeButton("Btn08" , gridBag, constraints);
		
		constraints.weighty = 0.0;	// 얘를 둠으로써 Btn09와 Btn10의 크기가 차이난다. Btn09의 weighty가 0.0(기본)이 되서 남은 공간을 Btn10이 차지.
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight =1;
		makeButton("Btn09" , gridBag, constraints);
		makeButton("Btn10" , gridBag, constraints);
				
		constraints.gridwidth = 2;	// width를 2로 둠으로써 Btn12와 반반을 나누게 된다.
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
