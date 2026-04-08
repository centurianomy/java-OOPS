import java.util.*;
class Main{
	public static void main(String args[]){
		int w,i,f;
		int[] frames= new int[50];

		System.out.println("Enter window size: ");
		Scanner sc=new Scanner(System.in);
		w=sc.nextInt();

		System.out.println("Enter number of frames transmit: ");
		f=sc.nextInt();
	
		System.out.println("Enter "+ frames +" frames: ");
		for(i=1; i<=f; i++){
			frames[i]=sc.nextInt();
		}
			System.out.println("\n with sliding window protocol the frames will be sent in the following manner(assuming no corruption of frames)\n");
			System.out.println("after sending "+w+" frames each stage sender waits for ack sent by the receiver");
			
			for(i=1; i<=f; i++){
				if(i%w==0){
					System.out.println(frames[i]);
					System.out.println("ack of above frames sent is received by sender \n");
				}
				else{
					System.out.println(frames[i]);
				}
			}
	
		if(f%w!=0){
			System.out.println("ack of above frames sent is received by sender \n");
		}
	}
}
