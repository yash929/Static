abstract class Vehicle{
	String st,sp;
	abstract void Start();
	abstract void Stop();
}
 class twowheeler extends Vehicle
{
	void Start()
	{
		System.out.println("2 Wheeler Started");
	}
	void Stop()
	{
		System.out.println("2 Wheeler Stoped");
	}
}
class fourwheeler extends Vehicle
{
	void Start()
	{
		System.out.println("4 Wheeler Started");
	}
	void Stop()
	{
		System.out.println("4 Wheeler Stoped");
	}
}
class Abstraction
{
	public static void main(String args[])
	{
		twowheeler tw=new twowheeler();
		tw.Start();
		tw.Stop();
		fourwheeler fw=new fourwheeler();
		fw.Start();
		fw.Stop();
	}
} 