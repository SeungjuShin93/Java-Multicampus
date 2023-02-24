package Quiz2;


/* HashMap?�� ?��?��?��?�� ?��?�� 기능?�� 구현 ?��?��?��.
 * ?�� : ?��?��번호, �? : ?��?��객체
 * 문제 : ?��?�� ?��보�?? ?��?��받아 ?��?�� ?��보�?? �?리하?�� ?��로그?��?��?��.
 * 주어�? 메뉴 기능?�� ?��?��?��?��?��.
 * 
 * ?��?��?���? : Sawon
 * ?��?���? : 
 * ?��?��번호 : sabun
 * �??���? : deptname
 * ?���? : irum
 * ?���? : gender
 * ?��메일 : eamil
 * 
 * 메서?�� : 
 * inputData() : ?��?��?���? ?��?��
 * outputData() : ?��?��?���? 출력 
 * 
 * <?���?>
 * *** ?��?���?�? ***
 * 1.?��?��?���? ?��?��
 * 2.?��?��?���? 출력
 * 3.?��?��?���? 조회
 * 4.?��?��?���? ?��?��
 * 5.?��?��?���? ?��?��
 * 6.?��로그?�� 종료
 * 
 * 메뉴 ?��?�� =>
 * 
 * <?��?��>
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Members_JungUk {
    public static final String RESTART_MENU_MESSAGE = "메뉴�? ?��?�� ?��?��?��주세?��.\n";
    public static final String INSERT_MEMBER = "1";
    public static final String PRINT_MEMBERS = "2";
    public static final String SEARCH_MEMBER = "3";
    public static final String MODIFY_MEMBER = "4";
    public static final String DELETE_MEMBER = "5";
    public static final String EXIT_MENU = "6";
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Member> members = new HashMap<>();
        String menu;
        while (true) {
            printMenu();
            System.out.print("\n메뉴 ?��?�� => ");
            menu = sc.next();
            if (menu.equals(INSERT_MEMBER)) {
                inputData(members);
                continue;
            }
            if (menu.equals(PRINT_MEMBERS)) {
                printMembers(members);
                continue;
            }
            if (menu.equals(SEARCH_MEMBER)) {
                printMember(members);
                continue;
            }
            if (menu.equals(MODIFY_MEMBER)) {
                modify(members);
                continue;
            }
            if (menu.equals(DELETE_MEMBER)) {
                removeMember(members);
                continue;
            }
            if (menu.equals(EXIT_MENU)) {
                System.out.println("\n?��로그?�� 종료...");
                break;
            }
            System.out.println("\n메뉴�? ?��?�� ?��?��?��?��?��.");
        }
    }

    /******************** PRINT ********************/
    private static void printMenu() {
        System.out.println("\n  *** 메뉴 ***");
        System.out.println("1. ?��?��?���? ?��?��");
        System.out.println("2. ?��?��?���? 출력");
        System.out.println("3. ?��?��?���? �??��");
        System.out.println("4. ?��?��?���? ?��?��");
        System.out.println("5. ?��?��?���? ?��?��");
        System.out.println("6. ?��로그?�� 종료");
    }

    private static void printByMember(String memberId, Member member) {
        System.out.printf("%-4s       %-50s%n", memberId, member);
    }

    /******************** INPUT ********************/
    private static void inputData(Map<String, Member> members) {
        System.out.print("\n?��?��번호�? ?��?��?��주세?�� : ");
        String memberId = sc.next();
        Member member = getMember();
        if (isNotEmailFormat(member.getEmail())) {
            System.out.println("\n?��?�� ?��?��?�� ?��메일?��?��?�� ?��바르�? ?��?��?��?��.");
            System.out.println("?��?��?�� ?��메일 : " + member.getEmail());
            System.out.println(RESTART_MENU_MESSAGE);
            return;
        }
        if (members.containsKey(memberId)) {
            System.out.println("?��?�� ?��?��번호�? �?�? ?��?��?�� 존재?��?��?��.");
            printTopBar();
            System.out.println(members.get(memberId));
            printBar();
            System.out.println(RESTART_MENU_MESSAGE);
            return;
        }
        members.put(memberId, member);
    }

    /******************** OUTPUT ********************/
    private static void printBar() {
        System.out.println("====================================================================");
    }

    private static void printTopBar() {
        // TODO ?���? 출력
        System.out.println("\n?��?��번호   �??���?     ?���?       ?���?      ?��메일");
        printBar();
    }

    private static void printMembers(Map<String, Member> members) {
        if (members.isEmpty()) {
            System.out.println("\n?��?��?�� ?��명도 존재?���? ?��?��?��?��.");
            return;
        }
        printTopBar();
        members.keySet().forEach(memberId -> printByMember(memberId, members.get(memberId)));
        printBar();
    }

    private static void printMember(Map<String, Member> members) {
        System.out.print("\n�??��?��?�� ?��?��번호�? ?��?��?��주세?�� : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?��?��번호�? �?�? ?��?��?? 존재?���? ?��?��?��?��.")) {
            return;
        }
        printTopBar();
        System.out.println(members.get(memberId));
        printBar();
    }

    /******************** SEARCH ********************/
    private static Member findByMemberId(Map<String, Member> members, String memberId) {
        if (members.containsKey(memberId)) {
            return members.get(memberId);
        }
        System.out.println("?��?�� ?��?��번호�? �?�? ?��?��?? 존재?���? ?��?��?��?��.");
        System.out.println(RESTART_MENU_MESSAGE);
        return null;
    }

    /******************** MODIFY ********************/
    private static void modify(Map<String, Member> members) {
        System.out.print("\n?��?��?��?�� ?��?��번호�? ?��?��?��주세?�� : ");
        String memberId = sc.next();
        Member findMember = findByMemberId(members, memberId);
        if (findMember == null) {
            return;
        }
        Member newMember = getMember();
        members.put(memberId, newMember);
        printTopBar();
        System.out.printf("%-4s       %-50s ?��?��?��%n", memberId, findMember);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-4s       %-50s ?��?��?��%n", memberId, newMember);
        printBar();
    }

    /******************** REMOVE ********************/
    private static void removeMember(Map<String, Member> members) {
        System.out.print("\n?��?��?��?�� ?��?��번호�? ?��?��?��주세?�� : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?��?��?��?�� ?��?��?�� ?��번이 존재?���? ?��?��?��?��.")) {
            return;
        }
        members.remove(memberId);
        System.out.println("?��?��번호 : [" + memberId + "] ?��?��?�� ?��?��?��???��?��?��.");
    }

    private static boolean hasMemberById(Map<String, Member> members, String memberId, String message) {
        if (!members.containsKey(memberId)) {
            System.out.println(message);
            System.out.println(RESTART_MENU_MESSAGE);
            return true;
        }
        return false;
    }

    private static boolean isNotEmailFormat(String email) {
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return !m.matches();
    }

    /******************** ETC ********************/
    private static Member getMember() {
        Member member = new Member();
        System.out.print("�??��명을 ?��?��?��주세?�� : ");
        member.setDivision(sc.next());
        System.out.print("?��름을 ?��?��?��주세?�� : ");
        member.setName(sc.next());
        System.out.print("?��별을 ?��?��?��주세?�� : ");
        member.setGender(sc.next());
        System.out.print("?��메일?�� ?��?��?��주세?�� : ");
        member.setEmail(sc.next());
        return member;
    }

    static class Member {
        private String division;
        private String name;
        private String gender;
        private String email;

        public Member() {
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%-5s   %-5s   %-5s   %-25s", division, name, gender, email);
        }
    }
}