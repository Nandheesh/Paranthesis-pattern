Input 1 : 5
****()****
***(())***
**((()))**
*(((())))*
((((()))))
*(((())))*
**((()))**
***(())***
****()****

Input 2 : 2
*()*
(())
*()*


mport java.util.*;
public class Main {

    public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt(), st = n-1;
		while(st>=0){
		    System.out.println("*".repeat(st)+"(".repeat(n-st)+")".repeat(n-st)+"*".repeat(st));
		    st--;
		}
		st = 1;
		while(st<n){
		    System.out.println("*".repeat(st)+"(".repeat(n-st)+")".repeat(n-st)+"*".repeat(st));
		    st++;
		}
    }
}
