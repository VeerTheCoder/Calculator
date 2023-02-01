class Class{
	
	public static void main(String[] ag){
		calc obj=new calc();
		calc obj1=new calc(20,40);
		calc obj2=new calc(15,9,'-');
		calc obj3=new calc(45,5,'/');
		calc obj4=new calc(33,6,'%');
	}
static class calc{
	int x,y,z;
	char c;
	calc(){
		x=15;
		y=25;
		z=x+y;
		System.out.println("Sum= "+z);
	}
	calc(int a,int b){
		x=a;
		y=b;
		z=x+y;
		System.out.println("Sum= "+z);
	}
	calc(int i,int j,char k){
		x=i;
		y=j;
		c=k;
		switch(c){
			case '+':
			z=x+y;
			System.out.println("Sum= "+z);
			break;
			case '-':
			z=x-y;
			System.out.println("Subtraction= "+z);
			break;
			case '*':
			z=x*y;
			System.out.println("Multiplilcation= "+z);
			break;
			case '/':
			z=x/y;
			System.out.println("Division= "+z);
			break;
			case '%':
			z=x%y;
			System.out.println("Remainder= "+z);
			break;
			default:
			System.out.println("Invalid Expression");

		}
	}
}
}