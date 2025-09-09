Map<String, Double> avgClaimAmountByType = claims.stream()
        .collect(Collectors.groupingBy(Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)));
