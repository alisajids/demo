package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		Runnable r1 = () ->{ System.out.println("New Thread1"); };
	
		//Thread accepts the Runnable task on its constructor.
//		new Thread(r1).start();
		
		Thread r2 = new Thread(){
			public void run() {
				System.out.println("New Thread2"); 
			}
	};

//	r2.start();
		
		
		 ExecutorService service = Executors.newFixedThreadPool(3);
		 service.execute(r1); //Executor provides a execute() method which accepts a Runnable task
		 service.execute(r2);
		
		 
		 Callable<String> callable = new Callable<String>() {
			 public String call() {
			      return "new Thread3";
			    }
		};
		 Future<String> future = service.submit(callable);
		 System.out.println(future.isDone());
		if(future.isDone()) {
			System.out.println(future.get()); 
		}
		
		//ThreadLocal is a special class for which each thread accessing the variable would have a separate instance of it 
		ThreadLocal < Integer > count = new ThreadLocal < > () {
			 @Override
			 public Integer initialValue() {
			 return Integer.valueOf(0);
			 }
			};
		 
		List<String> list = List.of("sajid","sam");
		
		//Convert List to Map
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(s->list.indexOf(s)+1, s->s));
		
		map.entrySet().stream().forEach(entry->System.out.println("Key::"+entry.getKey()+"  value::"+ entry.getValue()));
		
		//Convert List to Set
		Set<String> set = list.stream().collect(Collectors.toSet());
		set.stream().forEach(s->System.out.println(s));
	}
}
