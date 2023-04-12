public class Staff {
    StaffMember[] staffList;// Declare an array to hold the staff members


    public Staff() {
        staffList = new StaffMember[8];
// Initialize the staffList array with 8 slots
// Populate the staffList with different types of StaffMember objects

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        staffList[6] = new Commission("John", "10 High St", "555-1234", "123-45-6789", 6.25, 0.20);
        staffList[7] = new Commission("Jane", "20 Low St", "555-5678", "987-65-4321", 9.75, 0.15);
        // Modify some of the staff members' attributes
        
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);
        ((Commission) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);
    }

    public void payday() {
        double amount;
         // Iterate over all the staff members and print their information and pay amount
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);// print the staff member information
            amount = staffList[count].pay();// calculate the amount to be paid to the staff member
            // print the pay amount, or "Thanks!" if the staff member is a volunteer
            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }
            // print a separator
            System.out.println("-----------------------------------");
        }
    }
}
