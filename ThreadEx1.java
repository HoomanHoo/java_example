import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Calendar;

class Thread1 extends Thread {
	public void run(){
		int i = 0;
		while (true){
			i++;
			System.out.println(i);
		}
	}

}

class Thread2 extends JFrame implements Runnable{
	JFrame f = null;
	JLabel label = null;

	public Thread2(){
		f= new JFrame();
		label = new JLabel ("", JLabel.CENTER);
		f.add(label);
		f.setSize(450, 400);
		f.setLocation(400, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(label);
	}
	public void run(){
		while (true){
			Calendar now = Calendar.getInstance();
			label.setText(
			now.get(Calendar.HOUR_OF_DAY) + ":" +
			now.get(Calendar.MINUTE) + ":" +
			now.get(Calendar.SECOND)
			);
		}
	}
}



class ThreadEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();

		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.run();
	}
}
