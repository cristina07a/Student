package Student;

public class Student 
{
	private String Name;
	private float Grade;
	
	
	public float GetGrade() {
		return Grade;
	}
	public void SetGrade(float grade) {
		this.Grade = grade;
	}
	public Student(String name, float grade) 
	{
		SetName(name);
		Grade = grade;
	}
	public String GetName() {
		return Name;
	}
	public void SetName(String name) {
		Name = name;
	}
}
