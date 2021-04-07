package day10.multithreading;

class Waterbottle
{
	synchronized void drink(int time)
	{
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Drinkwater extends Thread
{
	Waterbottle w=new Waterbottle();
	public void run()
	{
		w.drink(5);
	}
}


public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinkwater d=new Drinkwater();
		Thread sachin= new Thread(d);
		Thread ravi=new Thread(d);
		sachin.setName("sachin is drinking");
		ravi.setName("ravi is drinking");
		
		sachin.start();
		ravi.start();
	}

}