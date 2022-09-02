import java.util.Arrays;

class Determiner {

	public static void determineWhoIsWho(Employee[] employees) {
		for (Employee employee : employees) {
			if (employee.getClass() == Employee.class) {
				System.out.println("EMP");
			}
			if (employee instanceof Developer) {
				System.out.println("DEV");
			}
			if (employee instanceof DataAnalyst) {
				System.out.println("DA");
			}
		}
	}
}

// Don't change the code below
class Employee {

	protected String name;
	protected String email;
	protected int experience;

	public Employee(String name, String email, int experience) {
		this.name = name;
		this.email = email;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getExperience() {
		return experience;
	}
}

class Developer extends Employee {

	private final String mainLanguage;
	private final String[] skills;

	public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
		super(name, email, experience);
		this.mainLanguage = mainLanguage;
		this.skills = skills;
	}

	public String getMainLanguage() {
		return mainLanguage;
	}

	public String[] getSkills() {
		return Arrays.copyOf(skills, skills.length);
	}
}

class DataAnalyst extends Employee {

	private final boolean phd;
	private final String[] methods;

	public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
		super(name, email, experience);
		this.phd = phd;
		this.methods = methods;
	}

	public boolean isPhD() {
		return phd;
	}

	public String[] getMethods() {
		return Arrays.copyOf(methods, methods.length);
	}
}