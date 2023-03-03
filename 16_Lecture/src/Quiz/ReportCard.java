package Quiz;

import java.util.ArrayList;
/*
 * Sungjuk Ŭ���� �ʵ� : String hakbun, irum; int kor, eng, math, tot; double avg; String grade;
 * 
 * �޼��� : void input() void process() void output
 * 
 * ���� : ���� Ŭ������ �̳� Ŭ������ �Ͽ� ���������͸� �����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
import java.util.Scanner;

class ReportCard { // ��ٱ��� Ŭ����
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

   class Sungjuk { // ����ǥ Ŭ���� // �̳� Ŭ����
      String hakbun, irum;
      int kor, eng, math, tot;
      double avg;
      String grade;

      Sungjuk() {}

      void input() {
         Scanner scan = new Scanner(System.in);

         System.out.println("�й� �Է� => ");
         this.hakbun = scan.next();
         System.out.println("�̸� �Է� => ");
         this.irum = scan.next();
         System.out.println("���� �Է� => ");
         this.kor = scan.nextInt();
         System.out.println("���� �Է� => ");
         this.eng = scan.nextInt();
         System.out.println("���� �Է� => ");
         this.math = scan.nextInt();
      }

      void process() {
         this.tot = this.kor + this.eng + this.math;
         this.avg = this.tot / 3.;

         switch ((int) this.avg / 10) {
            case 10:
            case 9:
               this.grade = "��";
               break;
            case 8:
               this.grade = "��";
               break;
            case 7:
               this.grade = "��";
               break;
            case 6:
               this.grade = "��";
               break;
            default:
               this.grade = "��";
               break;
         }
      }

      void output() {
         System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n", hakbun, irum, kor,
               eng, math, tot, avg, grade);
      }
   }
}
