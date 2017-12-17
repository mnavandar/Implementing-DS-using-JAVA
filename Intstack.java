
public class Intstack {
	private int [] stack;
	private int top;
	private int size;
	public Intstack()
	{
		top=-1;
		size=50;
		stack=new int[50];
	}
	public Intstack(int size){
		top=-1;
		this.size=size;
		stack=new int[this.size];
	}
	public boolean push(int item){
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
	public int  pop(){
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
		Intstack i=new Intstack();
		if(!i.isFull())
		{
			i.push(2);
			i.push(4);
			i.push(4);
		}
		System.out.println(i.pop());
		System.out.println(i.pop());
		System.out.println(i.pop());
		
	}
	

}
