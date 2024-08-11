// Example 13.5: Accessing objects in an ArrayList collection

import java.util.ArrayList;

public class AccessingArrayListObjects {
    public static void main(String[] args) {
        ArrayList<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " Companies in the world");
        System.out.println(topCompanies);

        // Retrieve and print specific elements
        String bestCompany = topCompanies.get(0);
        System.out.println("Best Company: " + bestCompany);
        String secondBestCompany = topCompanies.get(1);
        System.out.println("Second Best Company: " + secondBestCompany);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
