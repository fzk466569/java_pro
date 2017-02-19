package Thread;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个cat对象
		Cat cat1=new Cat();
		//启动线程，会导致run函数的运行
		/*如果是继承的是接口，则这样启动
		 * Thread t=new Thread(cat)
		 * t.start();
		 */
		cat1.start();
	}

}

class Cat extends Thread
{
	//重写run函数
	public void run()
	{
		while(true)
		{
			//休眠一秒sleep会导致改线程进入阻塞状态
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello world!");			
		}

	}
}



