import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarEx { //Calendar class는 추상클래스고 날짜 연산에 사용하며 사용법이 독특하다 ->getInstance()를 사용해서 객체를 리턴받아야함
					//Calendar 클래스의 필드값을 매개변수로 하여 날짜를 구할 수 있다

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //객체를 만드는 메서드를 이용하여 객체를 만든다
		StringBuffer sb = new StringBuffer();
		sb.append("현재 시각: ");
		sb.append(now.get(Calendar.YEAR) + "년 ");
		sb.append(now.get(Calendar.MONTH)+1 + "월 ");
		sb.append(now.get(Calendar.DAY_OF_MONTH) + "일 ");
		sb.append(now.get(Calendar.DAY_OF_YEAR) + "번째 날 ");
		sb.append(now.get(Calendar.WEEK_OF_YEAR) + "번째 주 ");

		switch(now.get(Calendar.DAY_OF_WEEK)){
			case Calendar.MONDAY : sb.append("월요일 "); break;
			case Calendar.TUESDAY : sb.append("화요일 "); break;
			case Calendar.WEDNESDAY : sb.append("수요일 "); break;
			case Calendar.THURSDAY : sb.append("목요일 "); break;
			case Calendar.FRIDAY : sb.append("금요일 "); break;
			case Calendar.SATURDAY : sb.append("토요일 "); break;
			case Calendar.SUNDAY : sb.append("일요일 "); break;
		}

		System.out.println(sb);

		Calendar today = new GregorianCalendar(); // 부모타입으로 변수를 선언하고 자식 객체를 대입한다
		System.out.println(
			today.get(Calendar.HOUR_OF_DAY) + "시 " +
			today.get(GregorianCalendar.MINUTE) + "분 "+
			today.get(Calendar.SECOND) + "초 " +
			today.get(Calendar.MILLISECOND) + "밀리초 " +
			(today.get(Calendar.AM_PM) == Calendar.AM ? "오전 " : "오후 ") 
			);



		
	}
}
