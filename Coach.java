class Coach {
  static String tip(int s) {
    if (s >= 10000)
      return "Goal crushed!";
    if (s >= 5000)
      return "Halfway there!";
    return "Take a walk now!";
  }
}
