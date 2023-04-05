/*
Vector 용량 100개
1~100까지 랜덤 수를 Vector 용량 100개 모두 넣어 놓는다.
​
배팅 금액을 입력받는다.
사용자가 1~100까지 중 선택한다.
​
선택한 방에 있는 값과 컴퓨터의 랜덤 값과 비교
이긴 쪽이 배팅액을 가져간다.
​
전체 판돈 각각 50,000원 중 한쪽이라도 다 잃으면 프로그램 종료
*/
​
import java.util.Vector;
import java.util.Random;
​
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
​
class CollectionStudy3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		Vector<Integer> v = new Vector<>(100);
		Random r = new Random();
​
		
		int me_don  = 50000;		//내 돈
		int com_don = 50000;		//컴퓨터 돈
		int pandon  = 50000;	
		int put		= 0;//판돈
		int me		= 0;
​

		for( int i=0; i<v.capacity(); i++){
			v.add(r.nextInt(100)+1);
		}
		//판돈 입력
​
while(me_don > 0){
	while(true){
		System.out.print("판 돈 : ");				
		put = Integer.parseInt(br.readLine());
​
		if(put <= pandon) break;
		else{ 
			System.out.println(" 판돈은" + pandon + "원 까지 걸 수 있습니다.");}
		}
​
		int r1 = (int)(Math.random() * 100 +1);
​
		//내가 입력
		System.out.print( " 1 ~ 100번 카드 중 선택 : ");
		me = v.get(Integer.parseInt(br.readLine()) );
		
		//결과
		System.out.println("내 카드 : " + me + " / 컴퓨터 카드 " + r1);
		if(me > r1){
			System.out.println("승리");
			System.out.println("내 돈 : " + (me_don + put) + " / 컴퓨터 돈 : " + (com_don - put));	
		}
		else if(me ==r1){
			System.out.println("무승부");
		}
		else{ 
			System.out.println("패배");
			System.out.println("내 돈 : " + (me_don -= put) + " / 컴퓨터 돈 : " + (com_don + put));	
		}
​
	
		} 
	}
}