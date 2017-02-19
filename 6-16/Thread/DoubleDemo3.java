package Thread;

public class DoubleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig pig=new Pig(10);
		Bird bird=new Bird(10);
		Thread t1=new Thread(pig);
		Thread t2=new Thread(bird);
		t1.start();
		t2.start();
	}

}
class Bird implements Runnable
{
	int n=0;
	int res=0;
	int times=0;
	public Bird(int n)
	{
		this.n=n;
	}
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
			res+=times;
			System.out.println("��ǰ���Ϊ��"+res);
			if(times==n)
			{
				System.out.println("����ǣ�"+res);
				break;
			}
		}
	}
}

class Pig implements Runnable
{
	int n=0;
	int times=0;
	public Pig(int n)
	{
		this.n=n;
	}
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
			System.out.println("pig�̣߳��������"+times+"��hello");
			if(times==n)
			{
				break;
			}
		}
	}
	
}