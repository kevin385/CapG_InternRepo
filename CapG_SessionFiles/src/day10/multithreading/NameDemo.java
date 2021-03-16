package day10.multithreading;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=6;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}






public class NameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name of the main method :"+Thread.currentThread().getName());
		
		A t1=new A();
		B t2=new B();
		t1.setName("A Thread");
		t2.setName("B thread");
		t1.start();
		t2.start();
	}

}