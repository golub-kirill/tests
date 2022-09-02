class Sum {
	public static int sumOfAreas(Shape[] array) {
		// write your code here
		int sum = 0;
		for (Shape shape : array) {
			if (shape.getClass() == Square.class) {
				sum += Math.pow(((Square) shape).getSide(), 2);
			}
			if (shape.getClass() == Rectangle.class) {
				sum += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
			}
		}
		return sum;
	}
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}

class Rectangle extends Shape {
	private int width;
	private int height;

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