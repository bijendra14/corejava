package p1;

public class THREADINFOCONT {
	public static void main(String[] args) {
			
		public static void info(String indent,ThreadGroup tg) {
			int threadCount=tg.activeCount();
			Thread[]threads=new Thread[thredCount];
			tg.enumerate(threads); //get active threads
			System.out.println(indent +"THREAD GROUP NAME:"+tg.getName());
			System.out.println(indent + "is deamon:"+tg.isDaemon());
			for (int i=0; i<threads.length;i++) {
				log(indent+"\t",threads[i]);
			}
			intgroupCount=tg.activeGroupCount();
			ThreadGroup[]groups=new ThreadGroup[groupCount];
			tg.enumerate(groups);//
			for(int i=0;i<group.length;i++) {
		    info(indent +"\t",groups[i]);
				
			}
			
		}
	}

}
