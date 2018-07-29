import org.testng.annotations.Test;

public class Chrome {
	
	
	@Test(priority=1)
	public void test() {
		System.out.println("This is priority test one");
	}
	
	
	@Test(priority=2)
	public void testing() {
		System.out.println("This is priority test two");
	}
}
