package Thread;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��cat����
		Cat cat1=new Cat();
		//�����̣߳��ᵼ��run����������
		/*����Ǽ̳е��ǽӿڣ�����������
		 * Thread t=new Thread(cat)
		 * t.start();
		 */
		cat1.start();
	}

}

class Cat extends Thread
{
	//��дrun����
	public void run()
	{
		while(true)
		{
			//����һ��sleep�ᵼ�¸��߳̽�������״̬
			
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



