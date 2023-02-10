package Quiz;

public class Sungjuk_using {

	public static void main(String[] args) {
		Sungjuk obj = new Sungjuk();
		obj.input_Sungjuk();
		obj.process_Sungjuk();

	// 성적표랑 ==== 이 내용을 output에 하지 않은 이유는, 데이터가 여러 개 일경우 대비
	System.out.println("\n\t\t *** 성적표 ***");
	System.out.println("================================================");
	System.out.println("학번    이름    국어    영어   수학   총점   평균     등급");
	obj.output_Sungjuk();
	System.out.println("================================================");
	}
}
