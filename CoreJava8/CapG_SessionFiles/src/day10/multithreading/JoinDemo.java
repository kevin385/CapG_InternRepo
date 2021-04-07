package day10.multithreading;

class Engagement extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Marriage extends Thread
{
	public void run()
	{
		for(int i=6;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Family extends Thread
{
	public void run()
	{
		for(int i=20;i<=25;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Engagement engagement=new Engagement();
			Marriage marr=new Marriage();
			Family fam=new Family();
			engagement.setName("Engagement");
			marr.setName("marriage");
			fam.setName("family");
			
			engagement.start();
			engagement.join();
			marr.start();	
			fam.start();
			
	}

}