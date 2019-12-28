import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/*
 * ÁõÎÄ
 * */
public class FizzBuzzTest {
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void should_return_Fizz_given_number_divisible_le_0() throws Exception {
		expectedException.expect(Exception.class);
		expectedException.expectMessage("Invalid input");
		  
		FizzBuzz.of(0);	
	}
	
	@Test
	public void should_return_Fizz_given_number_divisible_by_3() throws Exception {
		assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");	
	}
	
	@Test
	public void should_return_Buzz_given_number_divisible_by_5() throws Exception {
		assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
	}
	
	@Test
	public void should_FizzBuzz_Fizz_given_number_divisible_by_3and5() throws Exception {
		assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
	}
}
