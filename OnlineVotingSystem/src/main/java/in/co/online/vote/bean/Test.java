package in.co.online.vote.bean;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		
		int max=500101; int min=100101;
		
		int random = (int )(Math. random() * max + min);
		
		System.out.println(random);
	}

}
