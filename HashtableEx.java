import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
import java.util.Vector;
class HashtableEx 
{
	public static void main(String[] args) 
	{
		Hashtable <Integer, String> ht = new Hashtable<Integer ,String>();

		if(! ht.containsKey(0)) ht.put(0, "홍길동");
		if(! ht.containsKey(9)) ht.put(9, "김유신");
		if(! ht.containsKey(3)) ht.put(3, "대조영");
		if(! ht.containsKey(7)) ht.put(7, "이순신");
		if(! ht.containsKey(4)) ht.put(4, "을지문덕");
		ht.put(3,"강감찬"); //3번 인덱스의 데이터를 강감찬으로 덮어쓰기 했다

		System.out.println("크기: " + ht.size());

		Enumeration <String> en = ht.elements(); // value만 Enumeration en에 저장한다
		while(en.hasMoreElements()){
			System.out.println("print " + en.nextElement()); // value만 출력하며 출력시 데이터를 내림차순 해준다
		}

		Enumeration <Integer> e = ht.keys(); //key만 Enumeration e에 저장한다
		while ( e.hasMoreElements()){
			System.out.println("print keys " +e.nextElement()); //key 만 출력하며 출력시 데이터를 내림차순 해준다
		}

			Enumeration <Integer> enu = ht.keys(); //key만 Enumeration e에 저장한다
		while ( enu.hasMoreElements()){
			System.out.println("print keys " +ht.get(enu.nextElement())); //key 값에 해당하는 value를 출력하며 출력시 데이터를 내림차순 해준다
																			//get(key) 가 key 값에 해당하는 value 값을 리턴해준다
		}

		System.out.println("delete " + ht.remove(0)); // key값이 0인 value를 삭제한다 이 때 삭제한 value 값을 리턴해준다

		//Set<Integer> s = ht.keySet();
		//Integer[] strarr = new Integer[s.size()];
		Object[] in = ht.keySet().toArray(); // 형변환이 안되기 때문에 Object 배열로 받아서 출력해준다 -> 배열은 통째로 형변환이 불가능하다 / Iterater 때문에 Set으로 형변환을 한다(메모리 관리)
		for( Object i : in){
			System.out.println("print " + i); //key 값으로 연산할 일은 없다 데이터를 묶음으로 저장할 것이 아니라면
		}

		Vector <String> vv = new Vector<>(ht.values()); //Collection으로 value 값을 반환해주기 때문에 Vector로 자동 형변환이 된다
		for (int i = 0; i < vv.size(); i++){
			System.out.println("Values " + vv.get(i)); // get(indexNumber)은 입력된 인덱스에 해당하는 값을 리턴해준다
		}
	}
}
