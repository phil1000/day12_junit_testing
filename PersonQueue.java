public interface PersonQueue {
	void insertPerson(Person person);
	Person retrieve();
	int getSize();
}