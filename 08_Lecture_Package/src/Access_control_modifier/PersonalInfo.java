package Access_control_modifier;

class PersonalInfo {
	String name;
	int age;
	char gender; // ³², ¿©
	String bloodType; // A, B, AB, O
	
	private PersonalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	PersonalInfo(String name, int age, char gender) {
		this(name, age); 
		this.gender = gender;
	}
	PersonalInfo(String name, int age, char gender, String bloodType) {
		this(name, age); 
		this.gender = gender;
		this.bloodType = bloodType;
	}
}