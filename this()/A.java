			//2. used to invoke current class method(implicity- by default->hum this lagaye na lagaye jvm automaticvally uses this).


class A
{
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		//m();  //same as this.m()
		this.m(); //implicitely happening 
	}
}