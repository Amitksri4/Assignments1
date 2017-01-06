
class numberVar			//Model
{
	int number=0;

}

class 	numberCheck		//Controller
{

	public String checkNumber(int number)
	{
               
		if(number ==0 )
			return "You Have Entered Zero";
		else if(number >0 )
			return "You Have Entered Positive No.";
	
		else 	
                return "You Have Entered Negative No. ";
	}

}


class TestDemo		//View
{

	public static void main(String[] args)

	{
		numberVar nv=new numberVar();
		numberCheck nc=new numberCheck();

		System.out.print("Enter a Number : ");
		
		nv.number=Integer.parseInt(System.console().readLine());	
		
		System.out.print(nc.checkNumber(nv.number));
	}
}		