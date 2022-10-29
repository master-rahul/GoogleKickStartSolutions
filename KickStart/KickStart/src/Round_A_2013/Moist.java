package Round_A_2013;

import java.util.Scanner;
import java.util.Stack;

class MyString {
    public String mString;

    public MyString() { mString = ""; }
    
    public MyString(String mString) { this.mString = mString; }        

    public int compareTo(String s) {
    	
    	this.mString = this.mString.toLowerCase();
    	s = s.toLowerCase();
    	int i = 0;
    	while( i < this.mString.length() && i < s.length()) {
    		if((this.mString.charAt(i) -'a') > (s.charAt(i)-'a')) return this.mString.charAt(i) - s.charAt(i);
    		else if((this.mString.charAt(i) -'a') < (s.charAt(i)-'a')) return this.mString.charAt(i) - s.charAt(i);
    		else i++;
    	}
    	if(this.mString.length() == s.length()) return 0;
    	else if(this.mString.length() > s.length()) return this.mString.charAt(i) - 'a';
    	else return s.charAt(i) - 'a';
    }
}

public class Moist{
	
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		int tt = 1;
		while(tt <= test) {
			int n = s.nextInt();
			Stack<MyString> s1 = new Stack<MyString>();
			Stack<MyString> s2 = new Stack<MyString>();
			int change = 0;
			MyString temp = new MyString();
			temp.mString = s.nextLine();
			for(int i = 0; i < n; i++) {
				temp = new MyString(s.nextLine());
				if(!s1.isEmpty()) {
					if(temp.compareTo(s1.peek().mString) < 0) {
						change++;
						while(!s1.isEmpty() && temp.compareTo(s1.peek().mString) < 0) s2.push(s1.pop());
						s1.push(temp);
						while(!s2.isEmpty()) s1.push(s2.pop());
					}else s1.push(temp);
				}else s1.push(temp);
			}
			System.out.println("Case #"+tt+": "+change);
			tt++;
		}
		s.close();
	}   
}
