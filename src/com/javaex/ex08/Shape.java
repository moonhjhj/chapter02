package com.javaex.ex08;

public abstract class Shape {

	protected String lineColor;
	protected String fillColor;

	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}

	public Shape() {
		super();
	}

	public Shape(String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	/**********섞어쓰기 할 때 draw를 자식클래스에서 받아오기 위해서 그냥 아무거나 하나 작성*************/
	/*public void draw() {
		System.out.println("바보");
	}
	*/
	
	/*********자식class에서 draw 코드를 꼭 짜도록 해줌 abstract*********/
	public abstract void draw();
	public abstract double area();

}
