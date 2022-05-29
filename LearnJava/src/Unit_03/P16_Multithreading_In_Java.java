package Unit_03;
import java.util.Scanner;

/*
 * MULTITHREADING  PREQUISITES
 * 
 * 1---MultiProcessing
 *    1-Sequential Multiprocessing (worst)
 *    2-Parallel Multiprocessing (best-does not envolve user its depend on core)
 *    3-Concurrent Multiprocessing (os -context switch)
 *    
 * 2---MultiTasking  
 *    1-Sequential Multitasking(30% important)
 *    2--Parallel Multitasking-->Not Possible
 *    3-Concurrent Multitasking(70 % Important)
 */

public class P16_Multithreading_In_Java {
		
		public static void main(String[] args) {
 			 abc2 obj=new abc2();
      		 obj.threadConcept();
			 obj.threadSynchronization();
			 obj.interThreadCommunication();
			 obj.ProducerConsumerProblems();
			 obj.Wait_And_Notify();
     		c1 obj1=new c1();
 			c2 obj2=new c2();
			obj1.show1();
     		obj2.show2();	
			Thread t1=new Thread(new T1(),"T1");
			Thread t2=new Thread(new T2(),"T2");
			Thread t3=new Thread(new T3(),"T3");
			t1.start();
			t2.start();
			t3.start();
			
	  }
	}
	class abc2
	{
		void threadConcept(){
			
		}
		void threadSynchronization(){
			
		}
		void interThreadCommunication(){
			
		}
		void ProducerConsumerProblems(){
			
		}
		void Wait_And_Notify(){
			
		}
	}
	class c1{
		void show1()
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println(a);
		}
	}
	class c2{
		void show2()
		{
			for(int i=0;i<10;i++) {
			System.out.println("Hey-2");
			}
		}
	}
	class T1 extends Thread{
		public void run()
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println(a);
		}
	}
	class T2 extends Thread{
		public void run()
		{
			for(int i=0;i<10;i++) {
			System.out.println("Hey-2");
			}
		}
	}
	class T3 extends Thread{
		public void run()
		{
			for(int i=0;i<10;i++) {
			System.out.println("Hey-3");
			}
		}
	}


// ctrl + shift + T = class search
// ctrl + O
// wait(): it is used to unnecessary engage the program
