package chapter04;

public class Point {
	
	private int x;
	private int y;
	
	public Point (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 생성한 객체 p의 기본값은 getClass() + "@" + hashCode()
	// 그런데 이 toString을 오버라이드 하면 객체 안의 값을 볼 수 있다.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	@Override
	// 내용 기반으로 해쉬코드를 생성하고 있음
	// equals와 hashCode를 같이 오버라이드 하는 이유?
	// 객체안의 내용이 같은지 확인 할 때, 성능 위해 해쉬코드를 내용기반으로 오버라이드함, 같은 해쉬코드를 찾은 후 실제 내용을 비교함
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	

}
