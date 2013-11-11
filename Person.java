public class Person {
	private String name;
	private Person nextPerson;
	
	public Person(String name) {
		this.name = name;
		this.nextPerson=null;
	}
	
    public String getName() {
	  return this.name;
    }

    public void setNext(Person person) {
	  this.nextPerson = person;		
    }

    public Person getNext() {
	  return this.nextPerson;		
    }
}