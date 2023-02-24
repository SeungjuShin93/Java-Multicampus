package Quiz2;


/* HashMap?„ ?‚¬?š©?•˜?—¬ ?•„?˜ ê¸°ëŠ¥?„ êµ¬í˜„ ?•˜?‹œ?˜¤.
 * ?‚¤ : ?‚¬?›ë²ˆí˜¸, ê°? : ?‚¬?›ê°ì²´
 * ë¬¸ì œ : ?‚¬?› ? •ë³´ë?? ?…? ¥ë°›ì•„ ?‚¬?› ? •ë³´ë?? ê´?ë¦¬í•˜?Š” ?”„ë¡œê·¸?¨?´?‹¤.
 * ì£¼ì–´ì§? ë©”ë‰´ ê¸°ëŠ¥?„ ?™„?„±?•˜?‹œ?˜¤.
 * 
 * ?´?˜?Š¤ëª? : Sawon
 * ?•„?“œëª? : 
 * ?‚¬?›ë²ˆí˜¸ : sabun
 * ë¶??„œëª? : deptname
 * ?´ë¦? : irum
 * ?„±ë³? : gender
 * ?´ë©”ì¼ : eamil
 * 
 * ë©”ì„œ?“œ : 
 * inputData() : ?‚¬?›? •ë³? ?…? ¥
 * outputData() : ?‚¬?›? •ë³? ì¶œë ¥ 
 * 
 * <?™”ë©?>
 * *** ?‚¬?›ê´?ë¦? ***
 * 1.?‚¬?›? •ë³? ?…? ¥
 * 2.?‚¬?›? •ë³? ì¶œë ¥
 * 3.?‚¬?›? •ë³? ì¡°íšŒ
 * 4.?‚¬?›? •ë³? ?ˆ˜? •
 * 5.?‚¬?›? •ë³? ?‚­? œ
 * 6.?”„ë¡œê·¸?¨ ì¢…ë£Œ
 * 
 * ë©”ë‰´ ?„ ?ƒ =>
 * 
 * <?…? ¥>
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Members_JungUk {
    public static final String RESTART_MENU_MESSAGE = "ë©”ë‰´ë¥? ?‹¤?‹œ ?„ ?ƒ?•´ì£¼ì„¸?š”.\n";
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
            System.out.print("\në©”ë‰´ ?„ ?ƒ => ");
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
                System.out.println("\n?”„ë¡œê·¸?¨ ì¢…ë£Œ...");
                break;
            }
            System.out.println("\në©”ë‰´ë¥? ?‹¤?‹œ ?…? ¥?•˜?„¸?š”.");
        }
    }

    /******************** PRINT ********************/
    private static void printMenu() {
        System.out.println("\n  *** ë©”ë‰´ ***");
        System.out.println("1. ?‚¬?›? •ë³? ?…? ¥");
        System.out.println("2. ?‚¬?›? •ë³? ì¶œë ¥");
        System.out.println("3. ?‚¬?›? •ë³? ê²??ƒ‰");
        System.out.println("4. ?‚¬?›? •ë³? ?ˆ˜? •");
        System.out.println("5. ?‚¬?›? •ë³? ?‚­? œ");
        System.out.println("6. ?”„ë¡œê·¸?¨ ì¢…ë£Œ");
    }

    private static void printByMember(String memberId, Member member) {
        System.out.printf("%-4s       %-50s%n", memberId, member);
    }

    /******************** INPUT ********************/
    private static void inputData(Map<String, Member> members) {
        System.out.print("\n?‚¬?›ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š” : ");
        String memberId = sc.next();
        Member member = getMember();
        if (isNotEmailFormat(member.getEmail())) {
            System.out.println("\n?•´?‹¹ ?‚¬?›?˜ ?´ë©”ì¼?˜•?‹?´ ?˜¬ë°”ë¥´ì§? ?•Š?Šµ?‹ˆ?‹¤.");
            System.out.println("?…? ¥?•œ ?´ë©”ì¼ : " + member.getEmail());
            System.out.println(RESTART_MENU_MESSAGE);
            return;
        }
        if (members.containsKey(memberId)) {
            System.out.println("?•´?‹¹ ?‚¬?›ë²ˆí˜¸ë¥? ê°?ì§? ?‚¬?›?´ ì¡´ì¬?•©?‹ˆ?‹¤.");
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
        // TODO ? •ë³? ì¶œë ¥
        System.out.println("\n?‚¬?›ë²ˆí˜¸   ë¶??„œëª?     ?´ë¦?       ?„±ë³?      ?´ë©”ì¼");
        printBar();
    }

    private static void printMembers(Map<String, Member> members) {
        if (members.isEmpty()) {
            System.out.println("\n?‚¬?›?´ ?•œëª…ë„ ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
            return;
        }
        printTopBar();
        members.keySet().forEach(memberId -> printByMember(memberId, members.get(memberId)));
        printBar();
    }

    private static void printMember(Map<String, Member> members) {
        System.out.print("\nê²??ƒ‰?•˜?‹¤ ?‚¬?›ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š” : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?‚¬?›ë²ˆí˜¸ë¥? ê°?ì§? ?‚¬?›?? ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.")) {
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
        System.out.println("?•´?‹¹ ?‚¬?›ë²ˆí˜¸ë¥? ê°?ì§? ?‚¬?›?? ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.");
        System.out.println(RESTART_MENU_MESSAGE);
        return null;
    }

    /******************** MODIFY ********************/
    private static void modify(Map<String, Member> members) {
        System.out.print("\n?ˆ˜? •?•˜?‹¤ ?‚¬?›ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š” : ");
        String memberId = sc.next();
        Member findMember = findByMemberId(members, memberId);
        if (findMember == null) {
            return;
        }
        Member newMember = getMember();
        members.put(memberId, newMember);
        printTopBar();
        System.out.printf("%-4s       %-50s ?ˆ˜? •? „%n", memberId, findMember);
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-4s       %-50s ?ˆ˜? •?›„%n", memberId, newMember);
        printBar();
    }

    /******************** REMOVE ********************/
    private static void removeMember(Map<String, Member> members) {
        System.out.print("\n?‚­? œ?•˜?‹¤ ?‚¬?›ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š” : ");
        String memberId = sc.next();
        if (hasMemberById(members, memberId, "?…? ¥?•˜?‹  ?‚¬?›?˜ ?‚¬ë²ˆì´ ì¡´ì¬?•˜ì§? ?•Š?Šµ?‹ˆ?‹¤.")) {
            return;
        }
        members.remove(memberId);
        System.out.println("?‚¬?›ë²ˆí˜¸ : [" + memberId + "] ?‚¬?›?„ ?‚­? œ?•˜???Šµ?‹ˆ?‹¤.");
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
        System.out.print("ë¶??„œëª…ì„ ?…? ¥?•´ì£¼ì„¸?š” : ");
        member.setDivision(sc.next());
        System.out.print("?´ë¦„ì„ ?…? ¥?•´ì£¼ì„¸?š” : ");
        member.setName(sc.next());
        System.out.print("?„±ë³„ì„ ?…? ¥?•´ì£¼ì„¸?š” : ");
        member.setGender(sc.next());
        System.out.print("?´ë©”ì¼?„ ?…? ¥?•´ì£¼ì„¸?š” : ");
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