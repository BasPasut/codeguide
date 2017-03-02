#Codeguide
##SRP (Single Responsibility Principle)


```
class Student{
	String name;
	int number;
	double avggrade;
	double mathgrade;
	double enggrade;
	
	public Student(String name,int number,double avggrade){
		this.name = name;
		this.number = number;
		this.avggrade = avggrade;
	}
	public void calGrade(double eng, double math){
		mathgrade = math;
		enggrade = eng;
		avggrade = ((eng * 1.5) + (math * 2.5))/4.0;
	}
	
	public double getGrade(){
		return avggrade;
	}
}
```