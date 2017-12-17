
public class PersonStack {
	private Person [] stack;
	private int top;
	private int size;
	public PersonStack()
	{
		top=-1;
		size=50;
		stack=new Person[50];
	}
	public PersonStack(int size){
		top=-1;
		this.size=size;
		stack=new Person[this.size];
	}
	public boolean push(Person item){
		if(!isFull()){
		top++;
		stack[top]=item;
		return true;
		}
		else
		{
			return false;
		}
	}
	public Person pop(){
		return stack[top--];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return(top==stack.length-1);
	}
	public static void main(String args[])
	{
		PersonStack i=new PersonStack();
		/*if(!i.isFull())
		{
			i.push(2);
			i.push(4);
			i.push(4);
		}
		System.out.println(i.pop());
		System.out.println(i.pop());
		System.out.println(i.pop());*/
		
		Person person1 = new Person("Madhur",19);
		Person person2 = new Person("Varun",22);
		
		PersonStack p1=new PersonStack();
		p1.push(person1);
		p1.push(person2);
		System.out.println(p1.pop().toString());
		System.out.println(p1.pop().toString());
		
	}
	

}



