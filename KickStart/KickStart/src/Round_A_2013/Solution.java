package Round_A_2013;

import java.util.Scanner;

public class Solution{
	static Scanner s = new Scanner(System.in);
	public static void main(String arg[]) {
		moist();
  		s.close();
	}
  	
  	public static void moist() {
  		int test = s.nextInt();
  		int tt = 1;
  		while(tt <= test) {
  			int n = s.nextInt();
  			int change= 0;
  			String s1 = s.nextLine();
  			String s2 = "";
  			for(int i = 0; i < n; i++){
  			    s1 = new String (s.nextLine());
  			    if(!s2.isEmpty()){
  			        if(s1.compareTo(s2) < 0) change++;
  			        else s2 = s1;
  			    }else s2 = s1;
  			}
  			System.out.println("Case #"+tt+": "+change);
  			tt++;
  		}
  	}
}