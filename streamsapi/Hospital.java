List<Doctor> weekendDoctors = doctors.stream()
        .filter(Doctor::isAvailableOnWeekend)
        .sorted(Comparator.comparing(Doctor::getSpecialty))
        .collect(Collectors.toList());
