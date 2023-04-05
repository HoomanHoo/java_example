/*
Collection			Set				HashSet			------- index 없음
									TreeSet

					List			Vector		Stack  ---- index 있음
									ArrayList

					Queue			LinkedList

Map					HashMap
					HashTable

*/


import java.util.HashSet;

class HashSetEx {
	public static void main(String[] args) {
		HashSet <String> hs = new HashSet <String> ();

		System.out.println("add " + hs.add("홍길동"));
		System.out.println("add " + hs.add("이순신"));
		System.out.println("add " + hs.add("김유신"));
		System.out.println(hs.add("홍길동")); //중복을 허용하지 않기 때문에 add의 리턴값으로 false가 출력된다
		
		for ( String s : hs ){ //객체가 관리하는 데이터를 String 타입으로 받겠다는 의미이다
		System.out.println("print " + s);
		}
		System.out.println("size " + hs.size()); //객체의 사이즈 출력 - 3
		System.out.println();

		System.out.println("search " + hs.contains("이순신")); //검색 대상이 존재하면 true
		System.out.println("search " + hs.contains("누구냐")); //검색 대상이 존재하지 않으면 false

		System.out.println("remove " + hs.remove("이순신")); //대상 문자열 삭제
		System.out.println("search " + hs.contains("이순신"));

		for ( String s : hs ){ //객체가 관리하는 데이터를 String 타입으로 받겠다는 의미이다
		System.out.println("print " + s);
		}
		System.out.println("size " + hs.size()); //객체의 사이즈 출력 - 2
	}
}
