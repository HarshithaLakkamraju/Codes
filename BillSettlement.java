//Code 4

import java.util.*;

public class BillSettlement {
    public static void main(String[] args) {
        Map<String, Integer> balances = new HashMap<>();
        List<Bill> bills = new ArrayList<>();

        // Add bills to the list
        bills.add(new Bill("Lunch", 2000, "Balaji", Arrays.asList("Anand", "Balaji", "Chaitanya", "Divya")));
        bills.add(new Bill("Movie ticket", 1000, "Anand", Arrays.asList("Anand", "Balaji", "Chaitanya", "Divya")));
        bills.add(new Bill("Snacks", 500, "Chaitanya", Arrays.asList("Anand", "Balaji", "Chaitanya")));

        // Calculate balances
        for (Bill bill : bills) {
            String paidBy = bill.getPaidBy();
            int totalAmount = bill.getTotalAmount();
            List<String> sharedBy = bill.getSharedBy();
            int sharePerPerson = totalAmount / sharedBy.size();

            // Add amount to paidBy person
            if (!balances.containsKey(paidBy)) {
                balances.put(paidBy, totalAmount);
            } else {
                balances.put(paidBy, balances.get(paidBy) + totalAmount);
            }

            // Subtract amount from sharedBy persons
            for (String person : sharedBy) {
                if (!person.equals(paidBy)) {
                    if (!balances.containsKey(person)) {
                        balances.put(person, -sharePerPerson);
                    } else {
                        balances.put(person, balances.get(person) - sharePerPerson);
                    }
                }
            }
        }

        // Print balances
        for (Map.Entry<String, Integer> entry : balances.entrySet()) {
            String person = entry.getKey();
            int balance = entry.getValue();
            System.out.println(person + " owes " + (-balance) + " to others.");
        }
    }
}

class Bill {
    private String description;
    private int totalAmount;
    private String paidBy;
    private List<String> sharedBy;

    public Bill(String description, int totalAmount, String paidBy, List<String> sharedBy) {
        this.description = description;
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.sharedBy = sharedBy;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public List<String> getSharedBy() {
        return sharedBy;
    }
}




