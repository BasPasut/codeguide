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

##KISS (Keep It Simple, Stupid!)
KISS, the explanation of this priciple is follow its name. When you write program, you have to think how you can write this program
in the simplest way because when we write simple code, it'll use less time and it easier to find a mistake than complex code. So,
you will definitely improve testability and your code would probably be self-documented and much easier to refactor in the future, if required.
For example : When you want to print number 1-10,
```
		int i = 1;
		System.out.println(i);
		System.out.println(i+1);
		System.out.println(i+2);
		System.out.println(i+3);
		System.out.println(i+4);
		System.out.println(i+5);
		System.out.println(i+6);
		System.out.println(i+7);
		System.out.println(i+8);
		System.out.println(i+9);
```
Instead of write very long code above, why don't we just use simpler way.

```
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(i);
		}
``` 
Reference: https://people.apache.org/~fhanik/kiss.html
	   http://softwareengineering.stackexchange.com/questions/178294/kiss-principle-applied-to-programming-language-design
