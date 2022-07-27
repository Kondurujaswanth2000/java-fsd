class MyOwnThread1 extends Thread{
	public void run(){
		
		for(int count=1; count<=5;count++){
			System.out.println("Hello All!!!");
			try {
				Thread.sleep(3000);// sleep 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	}

}
public class SleepExample {
	public static void main(String[] args) {
			MyOwnThread1 sl=new MyOwnThread1();
			sl.start();
	}

}
