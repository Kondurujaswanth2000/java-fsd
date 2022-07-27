
public class customException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				System.out.println(5/0);
				//throw new ArithmeticException();
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println("Hello All!!!");
	}


}
