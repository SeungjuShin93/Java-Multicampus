package Quiz;

class ReportCardEx01 {
   public static void main(String args[]) {
      ReportCard Sungjuk = new ReportCard();
      Sungjuk.addSungjuk();
      Sungjuk.addSungjuk();
      printSungjuk(Sungjuk);
   }

   static void printSungjuk(ReportCard Sungjuk) {
      int num = Sungjuk.getSungjukNum();
      double tot_avg = 0.0;

      System.out.println("\n\t\t *** 성적표 ***");
      System.out.println("===============================================");
      System.out.println("학번    이름    국어    영어   수학   총점   평균     등급");
      System.out.println("===============================================");
      for (int cnt = 0; cnt < num; cnt++) {
         ReportCard.Sungjuk obj = Sungjuk.getSungjuk(cnt);
         System.out.printf("%3d %5s %5d %7d %7d %n", cnt + 1, obj.hakbun, obj.irum, obj.kor,
               obj.eng, obj.math, obj.tot, obj.avg, obj.grade);
      }
      System.out.println("===============================================");
      System.out.printf("\t학생수 = %d, 전체평균 = %5.2f\n", num, tot_avg / num);
   }
}
