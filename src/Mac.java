
public class Mac extends Character {
	@Override
	public void move() {
		System.out.println("맥크리가 이동합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("맥크리가 멈춥니다.");
	}
	
	@Override
	public void attack(int count) {
		System.out.println("맥크리가 권총으로 " + count + "번 공격합니다.");
	}
	
	@Override
	public void skill() {
		System.out.println("맥크리가 황야의 무법자를 사용합니다.");
	}
	
	public void skill2() {
		System.out.println("맥크리가 섬광탄을 사용합니다.");
	}
}
