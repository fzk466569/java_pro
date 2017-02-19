package TankThread;

class Shot implements Runnable
{
	int x;
	int y;
	int direct;
	int speed=5;
	boolean isLive=true;
	
	public Shot(int x,int y,int direct)
	{
		this.x=x;
		this.y=y;
		this.direct=direct;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(direct)
			{
			case 0:
				y-=speed;
				break;
			case 1:
				x+=speed;
				break;
			case 2:
				y+=speed;
				break;
			case 3:
				x-=speed;
				break;
			}
			System.out.println("X="+x+"Y="+y);
			//子弹何时死亡
			
			//判断该子弹是否碰到边缘
			if(x<0 | x>800 | y<0 | y>600)
			{
				this.isLive=false;
				break;
			}
		}
	}
}

class Tank
{
	int x=0;
	int y=0;
	int direct=0;//0up,1right,2down,3left
	//设置坦克速度
	int speed=1;
	int color;
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Tank(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class Hero extends Tank
{
	//子弹
	Shot s=null;
	
	public Hero(int x,int y)
	{
		super(x,y);
	}
	
	//开火
	public void shotEnemy()
	{
		switch(this.direct)
		{
		case 0:
			s=new Shot(x+20,y,0);
			break;
		case 1:
			s=new Shot(x+50,y+20,1);
			break;
		case 2:
			s=new Shot(x+20,y+50,2);
			break;
		case 3:
			s=new Shot(x,y+20,3);
		}
		
		Thread t=new Thread(s);
		t.start();
		
	}
	//坦克向上移动
	public void moveUp()
	{
		y-=speed;
	}
	public void moveLeft()
	{
		x-=speed;
	}
	public void moveDown()
	{
		y+=speed;
	}
	public void moveRight()
	{
		x+=speed;
	}
}

class EnemyTank extends Tank
{
	public EnemyTank(int x,int y)
	{
		super(x,y);
	}
}
