import java.util.Calendar;


class Thread1 extends Thread {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + " Thread1 ");
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + " Thread2 ");
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread3 extends Thread {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + " Thread3 ");
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



class ThreadEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		Thread t3 = new Thread3();

	//	t1.setPriority(Thread.MAX_PRIORITY);
	//	t3.setPriority(Thread.MAX_PRIORITY);


		t1.start();
		try {
		t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t3.start();
	}
}
