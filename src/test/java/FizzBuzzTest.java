import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
/*
 * ÁõÎÄ
 * */
public class FizzBuzzTest {
	@Test
	public void should_return_Fizz_given_number_divisible_by_3() {
		assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");	
	}
	
	@Test
	public void should_return_Buzz_given_number_divisible_by_5() {
		assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
	}
	
	@Test
	public void should_FizzBuzz_Fizz_given_number_divisible_by_3and5() {
		assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
	}
}
