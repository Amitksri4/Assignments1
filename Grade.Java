
class Student		//Model
{
	int marks;
	int age;
	//char grade;
	


}

class MarksCal
{
	public String result(int marks,int age)
	{
		if((marks>70) || (marks>60 && age<15))
		return "A Grade";
		else if( (marks>=61 && marks <=70)||(marks >=45 && marks<=60 && age <15) )
		return "B Grade";
		else return "C Grade";
		
	}

}

class Grade 	//View
{

	public static void main(String[] args)

	{
		Student std=new Student();
		MarksCal mcal =new MarksCal();

		System.out.print("Enter  Marks of Student : ");
		std.marks=Integer.parseInt(System.console().readLine());

		System.out.print("Enter Age of Student : ");
		std.age=Integer.parseInt(System.console().readLine());	
		System.out.println(mcal.result(std.marks,std.age));
		

	}
}		