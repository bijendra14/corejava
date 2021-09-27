package p1;

public class Threadinfoc {
	public static void main(String[] args) throws Expection {
		Thread t = Thread.currentThread();
		ThreadGroup tg=t.getThreadGroup();
		while(tg.getParent()!=null)
			tg=tg.getParent();
	}
	HelloWithThread t1=new HelloWithThread("Tdhoni");
	t1.setPriority(1);
	HelloWithThread t2=new HelloWithThread("yuvraj");
	t2.setPriority(1);
	t1.start();
	t2.strat();
	
	info("",tg);

}
