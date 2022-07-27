
public class ThreadClass extends Thread{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		ThreadClass tc = new  ThreadClass();
  		tc.start();
 	}

}
