package nestedClasses;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();//Button.onclick() 실행
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
//		btn.setOnClickListener(new Button.OnClickListener() {
//			
//			@Override
//			public void onClick() {
//				System.out.println("영상을 보냅니다.");//익명구현객체
//				
//			}
//		});
		
	
	}

}
