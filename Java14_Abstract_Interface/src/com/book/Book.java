package com.book;

public class Book {

	private String name;
	private int page;
	private int price;
	private String category;
	
	// 기본 생성자
	public Book() {
		
	}
	// 파라미터 3개짜리 생성자( 이름, 가격, 카테고리(종류))
	public Book(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
		
		this.page = 100;	// 기본 값 설정
		
	}
	
	// 파라미터 2개짜리 생성자 ( 이름, 페이지)
	public Book(String name, int page) {
		this.name = name;
		this.page = page;
		
		this.price = 7000;
		this.category = "알 수 없음";
	}
	
	// 파라미터 4개짜리 생성자 ( 이름, 페이지, 가격, 종류)
	public Book(String name, int page, int price, String category) {
		this.name = name;
		this.page = page;
		this.price = price;
		this.category = category;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}

	
	//toString
	public String toString() {
	return "책의 이름은 "+getName()+"이고 페이지 수는 "+getPage()+"이며 가격은 "+getPrice()+"이고 카테고리는 "+getCategory()+"이다.";
	
	}
	
}







