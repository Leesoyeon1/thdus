package Controls;

public class WhilekeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;//변수선언
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------------");
				System.out.println("1.증속 | 2.감속 | 3.종료");
				System.out.println("------------------------");
				System.out.println("선택: ");//무한루프: 프로그램을 끝을 내지 못하고 계속 실행
				
			}
			keyCode = System.in.read();//사용자가 입력하는 key값을 받음
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도: " + speed);
			}else if (keyCode == 50) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else if(keyCode == 51) {
				run = false;//while구문 빠져나옴
			}
		}
	
		System.out.println("프로그램 종료");
	
	}
}
