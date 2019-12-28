public class FizzBuzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i ++) {
			String result = of(i);
			System.out.println(result);
		}
	}
	
	public static  String of(int i) {
		if(i%3 == 0) {
			
				return "Fizz";
			
		}else if(i%5 == 0) {
			return "Buzz";
		}else{
			return String.valueOf(i) ;
		}
	}

}
