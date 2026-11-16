class Tracker {
  int steps;

  void add(int s) { steps += s; }

  double km() { return steps * 0.0008; }

  double kcal() { return steps * 0.04; }
}
