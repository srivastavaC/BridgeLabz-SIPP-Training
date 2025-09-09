List<Movie> topMovies = movies.stream()
        .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparing(Movie::getReleaseYear).reversed())
        .limit(5)
        .collect(Collectors.toList());
