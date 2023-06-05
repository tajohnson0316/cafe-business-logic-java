import java.util.ArrayList;

public class CafeUtil {
  public int getStreakGoal() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  public int getStreakGoal(int numWeeks) {
    int sum = 0;
    for (int i = 1; i <= numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  public double getOrderTotal(double[] prices) {
    double sum = 0.0;
    for (int i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    return sum;
  }

  public void displayMenu(ArrayList<String> menuItems) {
    for (String item : menuItems) {
      System.out.println((menuItems.indexOf(item) + 1) + " " + item);
    }
  }

  public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name...");

    String userName = System.console().readLine();

    System.out.printf("%nHello, %s!%n", userName);
    customers.add(userName);
    System.out.printf("There are %d people ahead of you:%n%n", (customers.size() - 1));

    for (String customer : customers) {
      System.out.println(customer);
    }
  }

  public ArrayList<String> addCustomers() {
    ArrayList<String> customers = new ArrayList<String>();

    System.out.println("Please enter all customer names. Enter 'q' when finished:");
    String customerName = System.console().readLine();

    while(!customerName.equals("q")) {
      customers.add(customerName);
      customerName = System.console().readLine();
    }

    System.out.printf("%d new customer(s) added to the queue!%n", customers.size());
    return customers;
  }

  public void printPriceChart(String product, double price, int maxQuantity) {
    System.out.printf("%s%n", product);

    for (int i = 1; i <= maxQuantity; i++) {
      double discount = (i - 1) * .5;
      double newPrice = (price * i) - discount;
      System.out.printf("%d - $%0,3.2f%n", i, (newPrice));
    }
  }

  public void displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
    if (menuItems.size() != prices.size()) {
      return;
    }

    for (int i = 0; i < menuItems.size(); i++) {
      System.out.printf("%d %s -- $%0,3.2f%n", i + 1, menuItems.get(i), prices.get(i));
    }
  }
}