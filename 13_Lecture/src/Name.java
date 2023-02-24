class Name {
	String firstName; // �̸�
	String lastName; // ��

	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// HashCodeExample2 �غ��� ���� �߰�
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}

	// HashCodeExample2 �غ��� HashMapExample2 �غ��� ���� �߰�
	public boolean equals(Object obj) {
		if (!(obj instanceof Name))
			return false;
		Name name = (Name) obj;
		if (firstName.equals(name.firstName) && lastName.equals(name.lastName))
			return true;
		else
			return false;
	}
}