package com.javaex.ex07;

public class Triangle {
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;

	public Triangle() {
		super();
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println("LColor=" + lineColor + "FColor=" + fillColor + " 가로=" + width + " 세로=" + height + "삼각형을 그렸습니다.");
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Triangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
