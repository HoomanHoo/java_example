import java.util.Stack;
class StackEx {
	public static void main(String[] args) {
		String[] groupA
			={"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
//출력순서				4			   3		  2		     1

		Stack <String> s = new Stack<>(); //Stack은 Vector의 상속을 받았기 때문에 기본 생성자만으로도 사용할 수 있다

		for (int i = 0; i< groupA.length; i++){
			System.out.println("add " + s.push(groupA[i])); //add 메서드를 통해 값을 넣을 수 있다
		}

		System.out.println("search " + s.search("사우디")); //인덱스는 제일 나중에 넣은 순서가 1을 가지고 그 다음부터 2 3 4.... 로 증가한다

		System.out.println("remove" + s.remove(1)); // 쿠웨이트가 삭제됨 -> Stack과 나머지 객체 자료형의 인덱스가 다르기 때문에 Stack의 인덱스가 적용되지 않는다(remove는 Vector의 메서드이다)
		System.out.println("remove " + s.remove("대한민국")); //내부 요소를 명시해서 사용하는 것은 가능하다



		while(! s.empty()){
		//	System.out.println("print " + s.peek());  peek()은 데이터를 리턴해주기만 한다
		System.out.println("print " + s.pop()); // pop()은 데이터를 출력한 후 해당 데이터를 Stack에서 삭제한다 LIFO 구조기 때문에 가장 마지막에 넣은 대한민국이 가장 먼저 출력된다
		}

		System.out.println("search " + s.search("사우디"));
	}
}
