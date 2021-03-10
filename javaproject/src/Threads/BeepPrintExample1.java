package Threads;

import java.awt.Toolkit;
class WorkrThread extends Thread{
	@Override
	public void run() {
		super.run();
	}
}
class NewThread implements Runnable{
	@Override
	public void run() {
		
	}
}
public class BeepPrintExample1 {
	public static void main(String[] args) {
		
		//Thread 상속받아서 새로운 workerThread클래스 생성.
		Thread thread = new Thread();
		thread.start();
		
		//Runable I/f 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값
		Thread thread1 = new Thread (new NewThread());
		thread1.start();
		
		//Runnable I/F구현하는 익명클래스를 생성
		thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
		}

	}
}


