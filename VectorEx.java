import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.HashSet;

class VectorEx {
	public static void main(String[] args) {
		Vector <String> v = new Vector<>(5,3); // capacity 초기값 5  주고 값이 다 차면 3씩 더 증가를 시킨다


		System.out.println("size " + v.size()); //size 0
		System.out.println("capacity " + v.capacity()); //capacity 5
		

		System.out.println("add " + v.add("홍길동")); //size 1
		System.out.println("add " + v.add("이순신")); //size 2
		System.out.println("add " + v.add("김유신")); //size 3
		v.addElement("홍길동"); // 데이터 추가 여부를 리턴하지 않음		size 4
		v.add(2, "대조영"); //인덱스를 지정해서 해당 인덱스에 데이터를 추가함		size 5
		v.insertElementAt("강감찬", 3); //인덱스를 지정해서 해당 인덱스에 데이터를 추가함		size 6

		System.out.println("size " + v.size()); //size 6
		System.out.println("capacity " + v.capacity()); //capacity 8


		HashSet <String> hs = new HashSet<>();
		hs.add("홍길동");
		hs.add("가나다");
		hs.add("김유신");
		System.out.println("delete " + v.removeAll(hs)); // 중복 요소 전부 삭제, 하나라도 삭제되면 true를 리턴한다 하나만 삭제하려면 remove()에서 인덱스를 지정하고 실행하면 된다

		for( int i = 0; i<v.size(); i++) {
			System.out.println("print " + v.get(i)); //일반 배열처럼 순서대로 출력된다
		}
		System.out.println();

		/*
		interface 활용법
		1. implements 하고 추상메서드를 전부 재정의
		2. 대신 구현한 클래스를 상속받고 필요한 메서드만 재정의해서 사용
		3. 익명 내부 클래스를 이용해서 추상메서드를 재정의하고 구현해서 객체를 생성
		4. 객체를 완성/만들어주는 메서드를 호출해서 객체를 리턴 받고 사용 (Iterator(), Enumeration())

		class 활용법
		1. 객체 생성 / 상속받기
		2. 멤버 전체가 static인 경우 클래스명.멤버 사용
		3. 추상클래스인 경우 대신 객체를 생성해주는 메서드를 통해 객체를 리턴받고 사용
		4. 자식 클래스로 객체를 생성해서 사용 - 부모클래스 변수명 = new 자식클래스():
		5. Class.forName("클래스의 전체 경로") 사용 - 클래스 이름을 지정하지 않음(클래스 이름이 자주 바뀔 때 - ex) 데이터베이스 종류를 바꿀 때 - 사용한다)

		*/

		Iterator <String> it = v.iterator();
		while(it.hasNext()){
			System.out.println("Iterator " + it.next());
		}

		System.out.println();

		Enumeration <String> en = v.elements();
		while(en.hasMoreElements()){
			System.out.println("Elements " + en.nextElement());
		}

		System.out.println();
		
		String[] str = new String[v.size()]; // index의 수를 지정해줘야 한다
		v.copyInto(str); //데이터를 복사하려는 빈 배열을 매개변수로 입력한다
		for (int i = 0 ; i < str.length; i++){
			System.out.println("Array " + str[i]);
		}

		System.out.println("size " + v.size()); //size 3
		System.out.println("capacity " + v.capacity()); //capacity 8

		v.trimToSize(); //size에 맞게 capacity를 줄인다
		
		System.out.println("size " + v.size()); //size 3
		System.out.println("capacity " + v.capacity()); //capacity 3
		//("") - 빈 문자열 을 넣어서 의도적으로 capacity를 원하는 만큼으로 조정할 수 있다 


	}
}
