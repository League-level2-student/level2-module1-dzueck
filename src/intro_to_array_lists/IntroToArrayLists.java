package intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> aaaaaa = new ArrayList<String>(); 
		//2. Add five Strings to your list
		aaaaaa.add("a");
		aaaaaa.add("aa");
		aaaaaa.add("aaa");
		aaaaaa.add("aaaa");
		aaaaaa.add("aaaaa");
		Integer num = 0;
		ArrayList< Integer > intList = new ArrayList< Integer >();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		num = intList.remove(2);
		System.out.println(num);
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < aaaaaa.size(); i++) {
			System.out.println(aaaaaa.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String kdsdk : aaaaaa) {
			System.out.println(kdsdk);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i < aaaaaa.size(); i+=2) {
			System.out.println(aaaaaa.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i = aaaaaa.size()-1; i >= 0; i--) {
			System.out.println(aaaaaa.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		//small problem cheif
		for(int i = 0; i < aaaaaa.size(); i++) {
			if(aaaaaa.get(i).contains("e")) {
				System.out.println(aaaaaa.get(i));
			}
		}
	}
	Integer io = 5;
}
