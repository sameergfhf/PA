import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class DequeCheck{
	public static void main(String[] args) {
		Deque<Character> dq = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for(char ch : s.toCharArray()) {
			dq.addFirst(ch);
		}
		boolean flag = true;

		while(dq.size() > 1){
			char a = dq.removeFirst();
			char b = dq.removeLast();

			if(a!=b){
				flag = false;	
				break;
			};
		};
		if(flag) System.out.println("Yes");
		else System.out.println("No");

		sc.close();
	}
}