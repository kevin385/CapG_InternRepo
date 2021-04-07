package day10.multithreading;

class Waterbottle1
{
 void drink(int time)
	{
	 synchronized(this)
	 {
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking "+i);
		}
	 }
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is eating "+i);
		}
	}
}

class Drinkwater1 extends Thread
{
	Waterbottle1 w=new Waterbottle1();
	public void run()
	{
		w.drink(5);
	}
}


public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinkwater1 d=new Drinkwater1();
		Thread sachin= new Thread(d);
		Thread ravi=new Thread(d);
		sachin.setName("sachin");
		ravi.setName("ravi");
		
		sachin.start();
		ravi.start();
	}

}