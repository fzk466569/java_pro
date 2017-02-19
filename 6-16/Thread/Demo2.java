package Thread;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		//创建线程对象
		Thread t=new Thread(dog1);
		t.start();
		//调用Dog的run()；
	}

}

class Dog implements Runnable
{
	int times=0;
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("123");
		}
	}
	
}