package Quiz2;


/* HashMap? ?¬?©??¬ ?? κΈ°λ₯? κ΅¬ν ???€.
 * ?€ : ?¬?λ²νΈ, κ°? : ?¬?κ°μ²΄
 * λ¬Έμ  : ?¬? ? λ³΄λ?? ?? ₯λ°μ ?¬? ? λ³΄λ?? κ΄?λ¦¬ν? ?λ‘κ·Έ?¨?΄?€.
 * μ£Όμ΄μ§? λ©λ΄ κΈ°λ₯? ??±???€.
 * 
 * ?΄??€λͺ? : Sawon
 * ??λͺ? : 
 * ?¬?λ²νΈ : sabun
 * λΆ??λͺ? : deptname
 * ?΄λ¦? : irum
 * ?±λ³? : gender
 * ?΄λ©μΌ : eamil
 * 
 * λ©μ? : 
 * inputData() : ?¬?? λ³? ?? ₯
 * outputData() : ?¬?? λ³? μΆλ ₯ 
 * 
 * <?λ©?>
 * *** ?¬?κ΄?λ¦? ***
 * 1.?¬?? λ³? ?? ₯
 * 2.?¬?? λ³? μΆλ ₯
 * 3.?¬?? λ³? μ‘°ν
 * 4.?¬?? λ³? ?? 
 * 5.?¬?? λ³? ?­? 
 * 6.?λ‘κ·Έ?¨ μ’λ£
 * 
 * λ©λ΄ ? ? =>
 * 
 * <?? ₯>
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Members_JungUk {
    public static final String RESTART_MENU_MESSAGE = "λ©λ΄λ₯? ?€? ? ??΄μ£ΌμΈ?.\n";
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
            System.out.print("\nλ©λ΄ ? ? => ");
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
                System.out.println("\n?λ‘κ·Έ?¨ μ’λ£...");
                break;
            }
            System.out.println("\nλ©λ΄λ₯? ?€? ?? ₯??Έ?.");
        }
    }

    /******************** PRINT ********************/
    private static void printMenu() {
        System.out.println("\n  *** λ©λ΄ ***");
        System.out.println("1. ?¬?? λ³? ?? ₯");
        System.out.println("2. ?¬?? λ³? μΆλ ₯");
        System.out.println("3. ?¬?? λ³? κ²??");
        System.out.println("4. ?¬?? λ³? ?? ");
        System.out.println("5. ?¬?? λ³? ?­? ");
        System.out.println("6. ?λ‘κ·Έ?¨ μ’λ£");
    }

    private static void printByMember(String memberId, Member member) {
        System.out.printf("%-4s       %-50s%n", memberId, member);
    }

    /******************** INPUT ********************/
    private static void inputData(Map<String, Member> members) {
        System.out.print("\n?¬?λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ? : ");
        String memberId = sc.next();
        Member member = getMember();
        if (isNotEmailFormat(member.getEmail())) {
            System.out.println("\n?΄?Ή ?¬?? ?΄λ©μΌ???΄ ?¬λ°λ₯΄μ§? ??΅??€.");
            System.out.println("?? ₯? ?΄λ©μΌ : " + member.getEmail());
            System.out.println(RESTART_MENU_MESSAGE);
            return;
        }
        if (members.containsKey(memberId)) {
            System.out.println("?΄?Ή ?¬?λ²νΈλ₯? κ°?μ§? ?¬??΄ μ‘΄μ¬?©??€.");
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
        // TODO ? λ³? μΆλ ₯
        System.out.println("\n?¬?λ²νΈ   λΆ??λͺ?     ?΄λ¦?       ?±λ³?      ?΄λ©μΌ");
        printBar();
    }

    private static void printMembers(Map<String, Member> members) {
        if (members.isEmpty()) {
            System.out.println("\n?¬??΄ ?λͺλ μ‘΄μ¬?μ§? ??΅??€.");
            return;
        }
        printTopBar();
        members.keySet().forEach(memberId -> printByMember(memberId, members.get(memberId)));
        printBar();
    }

    private static void printMember(Map<String, Member> members) {
        System.out.print("\nκ²????€ ?¬?λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ? : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?¬?λ²νΈλ₯? κ°?μ§? ?¬??? μ‘΄μ¬?μ§? ??΅??€.")) {
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
        System.out.println("?΄?Ή ?¬?λ²νΈλ₯? κ°?μ§? ?¬??? μ‘΄μ¬?μ§? ??΅??€.");
        System.out.println(RESTART_MENU_MESSAGE);
        return null;
    }

    /******************** MODIFY ********************/
    private static void modify(Map<String, Member> members) {
        System.out.print("\n?? ??€ ?¬?λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ? : ");
        String memberId = sc.next();
        Member findMember = findByMemberId(members, memberId);
        if (findMember == null) {
            return;
        }
        Member newMember = getMember();
        members.put(memberId, newMember);
        printTopBar();
        System.out.printf("%-4s       %-50s ?? ? %n", memberId, findMember);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-4s       %-50s ?? ?%n", memberId, newMember);
        printBar();
    }

    /******************** REMOVE ********************/
    private static void removeMember(Map<String, Member> members) {
        System.out.print("\n?­? ??€ ?¬?λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ? : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?? ₯??  ?¬?? ?¬λ²μ΄ μ‘΄μ¬?μ§? ??΅??€.")) {
            return;
        }
        members.remove(memberId);
        System.out.println("?¬?λ²νΈ : [" + memberId + "] ?¬?? ?­? ????΅??€.");
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
        System.out.print("λΆ??λͺμ ?? ₯?΄μ£ΌμΈ? : ");
        member.setDivision(sc.next());
        System.out.print("?΄λ¦μ ?? ₯?΄μ£ΌμΈ? : ");
        member.setName(sc.next());
        System.out.print("?±λ³μ ?? ₯?΄μ£ΌμΈ? : ");
        member.setGender(sc.next());
        System.out.print("?΄λ©μΌ? ?? ₯?΄μ£ΌμΈ? : ");
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