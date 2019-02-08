package sdp;

class GradeProcessor {
  final GradeAdder gradeAdder = new GradeAdder();

  public void addGrades(Iterable<Grade> grades) {
    for (Grade grade : grades)
      adjustCourseCountAndPointsIfNeeded(grade);

    gradeAdder.computeGradePointAverage();
  }

  private void adjustCourseCountAndPointsIfNeeded(Grade grade) {
    if (grade.countsForGPA())
      gradeAdder.add(grade);
  }

  String prepareReport() {
    return gradeAdder.prepareReport();
  }

}
