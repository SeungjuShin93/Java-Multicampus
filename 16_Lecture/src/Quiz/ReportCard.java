package Quiz;

import java.util.ArrayList;
/*
 * Sungjuk 클래스 필드 : String hakbun, irum; int kor, eng, math, tot; double avg; String grade;
 * 
 * 메서드 : void input() void process() void output
 * 
 * 문제 : 성적 클래스를 이너 클래스로 하여 성적데이터를 관리하는 프로그램을 작성하시오
 */
import java.util.Scanner;

class ReportCard { // 장바구니 클래스
   ArrayList<Sungjuk> list = new ArrayList<Sungjuk>();

   ReportCard() {}

   void addSungjuk() {
      Sungjuk obj = new Sungjuk();
      obj.input();
      obj.process();
      list.add(obj);
   }

   int getSungjukNum() {
      return list.size();
   }

   Sungjuk getSungjuk(int index) {
      return list.get(index);
   }

   double getTotalAvg() {
      double tot_avg = 0;
      for (Sungjuk obj : list)
         tot_avg += obj.avg;
      return tot_avg;
   }

   class Sungjuk { // 성적표 클래스 // 이너 클래스
      String hakbun, irum;
      int kor, eng, math, tot;
      double avg;
      String grade;

      Sungjuk() {}

      void input() {
         Scanner scan = new Scanner(System.in);

         System.out.println("학번 입력 => ");
         this.hakbun = scan.next();
         System.out.println("이름 입력 => ");
         this.irum = scan.next();
         System.out.println("국어 입력 => ");
         this.kor = scan.nextInt();
         System.out.println("영어 입력 => ");
         this.eng = scan.nextInt();
         System.out.println("수학 입력 => ");
         this.math = scan.nextInt();
      }

      void process() {
         this.tot = this.kor + this.eng + this.math;
         this.avg = this.tot / 3.;

         switch ((int) this.avg / 10) {
            case 10:
            case 9:
               this.grade = "수";
               break;
            case 8:
               this.grade = "우";
               break;
            case 7:
               this.grade = "미";
               break;
            case 6:
               this.grade = "양";
               break;
            default:
               this.grade = "가";
               break;
         }
      }

      void output() {
         System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n", hakbun, irum, kor,
               eng, math, tot, avg, grade);
      }
   }
}
