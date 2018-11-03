ArrayList<Integer> arrayCenter(ArrayList<Integer> a) {

  int n = a.size();
  int suma = a.get(0),
      mina =  a.get(0) ;
  for (int i = 1; i < n; i++) {
    suma += a.get(i);
    mina = Math.min(mina, a.get(i));
  }

  ArrayList<Integer> b = new ArrayList<>();
  for (int i = 0; i < n; i++) {
    if (Math.abs(n * a.get(i) - suma) < n * mina) {
      b.add(a.get(i));
    }
  }

  return b;
}
