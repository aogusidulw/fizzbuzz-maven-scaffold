public class FizzBuzz {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i ++) {
			String result = of(i);
			System.out.println(result);
		}
	}
	
	public static  String of(int i) throws Exception {
		if( i <= 0) {
			throw new Exception("Invalid input");
		}else if(i%3 == 0) {
			if(i%5 == 0) {
				if(i%7 == 0) {
					return "FizzBuzzWhizz";
				}
				return "FizzBuzz";
			}else if(i%7 == 0){
				return "FizzWhizz";
			}else {
				return "Fizz";
			}
		}else if(i%5 == 0) {
			if(i%7 == 0){
				return "BuzzWhizz";
			}
			return "Buzz";
		}else if(i%7 == 0){
			return "Whizz";
		}else{
			return String.valueOf(i) ;
		}
	}

}
