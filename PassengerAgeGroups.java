//Code-3
public class PassengerAgeGroups {
    public static void main(String[] args) {
        int[] ageGroups = new int[6]; // to store count of passengers in each age group
        
        // sample data
        int[] passengerAges = {23, 45, 12, 36, 17, 8, 54, 31, 28, 41, 60};
        
        for(int age: passengerAges) {
            if(age <= 10) {
                ageGroups[0]++;
            }
            else if(age > 10 && age <= 20) {
                ageGroups[1]++;
            }
            else if(age > 20 && age <= 30) {
                ageGroups[2]++;
            }
            else if(age > 30 && age <= 40) {
                ageGroups[3]++;
            }
            else if(age > 40 && age <= 50) {
                ageGroups[4]++;
            }
            else {
                ageGroups[5]++;
            }
        }
        
        // print the count of passengers in each age group
        System.out.println("Age group\tCount");
        System.out.println("0-10\t\t" + ageGroups[0]);
        System.out.println("10-20\t\t" + ageGroups[1]);
        System.out.println("20-30\t\t" + ageGroups[2]);
        System.out.println("30-40\t\t" + ageGroups[3]);
        System.out.println("40-50\t\t" + ageGroups[4]);
        System.out.println("50+\t\t" + ageGroups[5]);
    }
}