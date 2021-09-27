package p1;

public class ThreadINFO {
	public static void main(String[] args) {
	Thread t= new Thread ("My Thread");
	log(" ",t);
}
	public static void log(String indent,Thread t) {
		System.out.println(indent + "Thread name:"+t.getName());
		System.out.println(indent +"ID:"+t.getId());
		System.out.println(indent +"Priority:"+t.getPriority()); 
		System.out.println(indent + "State:"+t.getState());
		System.out.println(indent + "Thread Group:"+t.getThreadGroup().getName());
		System.out.println(indent + "IsAlive:"+t.isAlive());
		System.out.println(indent + "Is daemon:"+t.isDaemon() + "\n");
	}

	
}
