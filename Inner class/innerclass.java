package jashu;

public class innerclass {

		
		void validate(String lockertype) {
			
			if(lockertype.equals("JaswanthKonduru")) {
				
				class local {
					
					void check() {
						System.out.println("your password is correct");
					}
					
				}
					
					local.a=new local();
					a.check();
				
			}	
					
					else {
						System.out.println("not correct password");
						
					}
					
				
		}		
			
		
		public static void main(String[] args) {
			
			innerclass y = new innerclass();
			y.validate()
			
		}
}
