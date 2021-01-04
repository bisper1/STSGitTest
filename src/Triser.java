
public class Triser extends Character {
	@Override
	public void move() {
		System.out.println("트레이서가 빠르게 이동합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("트레이서가 멈춥니다.");
	}
	
	@Override
	public void attack(int count) {
		System.out.println("트레이서가 펄스권총으로 " + count + "번 공격합니다.");
	}
	
	@Override
	public void skill() {
		System.out.println("트레이서가 펄스폭탄을 사용합니다.");
	}
	
}
