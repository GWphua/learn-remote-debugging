class Alphabet
{
  public static void run(String[] args)
  {
    System.out.println("Starting");
    for (char c = 'A'; c < 'Z'; c++) {
      try {
        Thread.sleep(2500);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(c);
    }
    System.out.println("Complete");
  }
}
