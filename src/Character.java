// 추상클래스로 변경
public abstract class Character {
//	상속받은 클래스가 사용할 규격을 만들어주는 메서드
//	public void move() {
//		System.out.println("이동합니다.");
//	}
//	
//	public void stop() {
//		System.out.println("멈춥니다.");
//	}
//	
//	public void attack() {
//		System.out.println("공격합니다.");
//	}
//	
//	public void skill() {
//		System.out.println("기술을 사용합니다.");
//	}
	
	public abstract void move();
	public abstract void stop();
	public abstract void attack(int count);
	public abstract void skill();
}
