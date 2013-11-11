import org.junit.*;
import static org.junit.Assert.*;

public class SuperMarketQTest {
	@Test
	public void testQCreation() {
	/// having some actual logic in the test class is a bad idea i.e. creating the queue below is not good
	// instead this class should call the appropriate method in the actual program to be tested
	// to perform any logic and then just test the results
	//
	// this should influence how you code i.e. having greater use of return values and more modular
	// code in the main class but all is good
		int i;
		SupermarketQueue inQueue = new SupermarketQueue();

		for (i=0; i<10; i++) {
			Person newPerson = new Person("Customer" + i);
			System.out.println("Customer " + newPerson.getName() + " added");
			inQueue.insertPerson(newPerson);
		}
		
		//test that the queue size is 10
		int expectedSize = i;
		int actualSize = inQueue.getSize();
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void testFirstPerson() {
		int i;
		SupermarketQueue inQueue = new SupermarketQueue();

		for (i=0; i<10; i++) {
			Person newPerson = new Person("Customer" + i);
			System.out.println("Customer " + newPerson.getName() + " added");
			inQueue.insertPerson(newPerson);
		}
		
		//test that Customer0 is the first person loaded
		
		Person currentHead = inQueue.retrieve();
		String currentPerson=currentHead.getName();
		assertEquals(currentPerson, "Customer0");
	}
}