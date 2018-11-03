int howManySundays(int n, String startDay) {

  String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday",
                   "Thursday", "Friday", "Saturday"};
  int startIndex = 0;

  for (int i = 0; i < week.length; i++) {
    if (week[i].equals(startDay)) {
      startIndex = i;
      break;
    }
  }

  return (int) Math.ceil((double)(n + startIndex) / week.length);
}
