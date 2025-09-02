import java.time.*;

class Member {
    private String name;
    private LocalDate expiryDate;
    public Member(String name, LocalDate expiryDate) {
        this.name = name; this.expiryDate = expiryDate;
    }
    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String toString() { return name + " - expires " + expiryDate; }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(25)),
            new Member("David", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        members.stream()
            .filter(m -> !m.getExpiryDate().isBefore(today) && !m.getExpiryDate().isAfter(threshold))
            .forEach(System.out::println);
    }
}
