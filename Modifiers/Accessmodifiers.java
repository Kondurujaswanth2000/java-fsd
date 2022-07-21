package sc;

public class Accessmodifiers {
		public void methodpublic() {
			System.out.println("This is public method");
		
		}
		protected void methodProtected() {
			System.out.println("This is protected method");
			
		}
		
		private void methodPrivate() {
			System.out.println("This is private method");
		}
		
		void methodDefault() {
			System.out.println("This is default method");
		}
		
		
		
		public static void main(String[] args) {
			Accessmodifiers obj = new Accessmodifiers();
			
		    obj.methodpublic();
		    obj.methodProtected();
		    obj.methodPrivate();
		    obj.methodDefault();
		    
			
		}
	}