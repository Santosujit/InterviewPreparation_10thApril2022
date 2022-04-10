package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {

//		What do you mean by Virtual Capacity of an ArrayList

		ArrayList<Object> ar = new ArrayList<Object>();
		
//		when you write this line, an object will be created, actual size is 0 = Pc
//		and 10 memory locations will be kept for this, this is the virtual capacity, Vc=10

//		ar.size() will give you the Pc

		ar.add(100);
		System.out.println(ar.size());// Pc = 1,Vc=9, Pc will keep increasing, Vc decreasing
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
//		ArrayList<Object> ar = new ArrayList<Object>(20);you can change the Vc=20 like this
	}

}
