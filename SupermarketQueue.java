public class SupermarketQueue implements PersonQueue {
	private Person head;
	private Person tail;
	
	public SupermarketQueue() {
		head=null;
		tail=null;
	}
	
	public void insertPerson(Person person) {
		if (head==null) {
			head=person;
		}
		else {
			tail.setNext(person);
		}
		tail=person; // the new person has now been added to the head of the queue 
	}
	
	public Person retrieve() {
		if (head == null) {
			return null;
		}
		else {
			Person currentHead = head;
			head=head.getNext();
			return currentHead;
		}
	}
	
	public int getSize() {
		int size=0;
		Person thisPerson = head;
		while (thisPerson != null) {
			thisPerson=thisPerson.getNext();
			size++;
		}
		return size;
	}

}