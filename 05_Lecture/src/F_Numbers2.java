
public class F_Numbers2 {
	int num[];
	
	F_Numbers2(int num[]) { // 생성자
		this.num = num;
	}
	
	int getTotal() { // 배열의 합계를 구하는 메소드
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
			total += num[cnt];
		return total;
	}
	
	int getAverage() { // 평균을 구하는 메소드
		int total;
		total = getTotal(); // 위에 만든 메소드를 재활용
		int average = total / num.length; 
		return average;
	}
}
