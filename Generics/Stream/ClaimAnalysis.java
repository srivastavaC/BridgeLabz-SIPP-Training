class Claim {
    private String type;
    private double amount;
    public Claim(String type, double amount) {
        this.type = type; this.amount = amount;
    }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1200),
            new Claim("Car", 5000),
            new Claim("Health", 1500),
            new Claim("Car", 4500),
            new Claim("Home", 8000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)
            ));

        System.out.println(avgClaims);
    }
}
