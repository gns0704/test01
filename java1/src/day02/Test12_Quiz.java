package day02;

import java.util.Random;
import java.util.Scanner;

public class Test12_Quiz {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			Random rnd=new Random();
			int count=0;
			for(int i=1;i<=10;i++) {
				int n1=rnd.nextInt(10)+1;
				int n2=rnd.nextInt(10)+1;
				System.out.print(n1 +"rr+" + n2 +"=");
				int n3=scan.nextInt();
				if(n3==(n1+n2)) {
					count++;//맞은 갯수세기
				}
			}
			System.out.println("맞은갯수:" + count);
			System.out.println("점수:" + count*10);
		
	}
}
