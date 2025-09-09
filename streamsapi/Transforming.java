List<String> transformedNames = customers.stream()
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toList());
