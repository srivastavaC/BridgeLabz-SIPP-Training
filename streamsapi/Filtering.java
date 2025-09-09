LocalDate today = LocalDate.now();

List<Member> expiringSoon = members.stream()
        .filter(m -> !m.getExpiryDate().isBefore(today) &&
                     !m.getExpiryDate().isAfter(today.plusDays(30)))
        .collect(Collectors.toList());
