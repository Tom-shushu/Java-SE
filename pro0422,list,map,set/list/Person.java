package pro0422.list;

public class Person implements Comparable<Person>{

	private Integer personId;
	private String personName;
	private Integer personAge;

	public Person(int i) {
		personId = i + 1;
		int k = (int) (Math.random() * 2 + 2);
		personName = "";
		for (int j = 0; j < k; j++) {
			char c = (char) ((int) (Math.random() * 5000 + 20000));
			personName += c;
		}
		personAge = (int) (Math.random() * 30 + 18);
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}

	@Override
	public int compareTo(Person o) {
		System.out.println("比较了自身和传递过来的o的编号情况\t"+this.getPersonId()+"\t"+o.getPersonId());
		return this.getPersonAge()-o.getPersonAge();
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;
		boolean b = this.getPersonId().equals(person.getPersonId());
		System.out.println(b+"!!!!!");
		return b;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	
}
