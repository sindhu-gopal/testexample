package coreexample;

public class Loopingstatement {

	public static void main(String[] args) {
		for(int i=1;i<=25;i=i+2) {
			System.out.println("i="+i);
		}
		for(int i=6;i>0;i=i-2) {
			if(i==4)
				break;
			System.out.println("i="+i);
		}
		int i =0;
		while(i<25)
		{
			if(i==7)
				continue;
			System.out.println("i*i "+(i*i));
			i++;
		}
		int d =2;
		do {
			int sum = d+2;
			d++;
		}while(d<60);
		System.out.println("d "+d);
	}

}
