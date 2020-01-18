package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityOfBD = new ArrayList<>();
		cityOfBD.add("Pabna");
		cityOfBD.add("Rajshahi");
		cityOfBD.add("Comilla");
		cityOfBD.add("Dhaka");
		cityOfBD.add("Sylhet");
		List<String> cityOfUsa = new ArrayList<>();
		cityOfUsa.add("Ohio");
		cityOfUsa.add("Utah");
		cityOfUsa.add("Pennsylvania");
		cityOfUsa.add("California");
		cityOfUsa.add("Florida");
		List<String> cityOfInd = new ArrayList<>();
		cityOfInd.add("Kolkata");
		cityOfInd.add("Mumbai");
		cityOfInd.add("Delhi");
		cityOfInd.add("Chennai");
		cityOfInd.add("Banarsi");
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("BD",cityOfBD);
		list.put("IND", cityOfInd);
		list.put("USA",cityOfUsa);
		System.out.println(list);
		System.out.println(" ");
		System.out.println("Printout the values using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}
		System.out.println(" ");
		System.out.println("Printout the values using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
