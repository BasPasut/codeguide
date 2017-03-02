#Codeguide
##SRP (Single Responsibility Principle)


 The single responsibility principle means every class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class. It will make your code clear and easy to read because instead of create all your methods in one class with a lot of purpose, 
we will break down into many class and each class will have only one purpose. For example,
```
class Student{
	String name;
	int studentID;
	String email;
	
	public Student(String name,int studentID,String email){
		this.name = name;
		this.studentID = studentID;
		if(!checkEmail(this.email)){
			this.email = email;
		}
		else{
			throw new Error("Cannot have ! , # , $ , % , * in an email name. Please correct again.");
		}
		
	}
	public boolean checkEmail(String email){
		if(email.contains("!") || email.contains("#") || email.contains("$") || email.contains("%") || email.contains("*")){
			return false;
		}
		return true;
	}
}
```
 From the example above, as you can see that Student class doesn't have the responsiblity of checkEmail. So, it will be better if we create another class that
will have that responsibility instead of Student class.  
```
class Student {
	String name;
	int studentID;
	Email email;

	public Student(String name, int studentID, Email email) {
		this.name = name;
		this.studentID = studentID;
		this.email = email;

	}
}

class Email {
	private String email;

	public Email(String email) {
		if (!checkEmail(this.email)) {
			this.email = email;
		} 
		else {
			throw new Error("Cannot have ! , # , $ , % , * in an email name. Please correct again.");
		}
	}

	public boolean checkEmail(String email) {
		if (email.contains("!") || email.contains("#") || email.contains("$") || email.contains("%")
				|| email.contains("*")) {
			return false;
		}
		return true;
	}
}
```

Reference: http://blog.gauffin.org/2011/07/single-responsibility-prinicple/