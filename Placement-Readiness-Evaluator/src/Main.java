public class Main {
    public static void main(String[] args) {
        String studentName = "Ananya";
        double academicPercentage = 72.5;
        double attendancePercentage = 81;
        int activeBacklogs = 0;
        boolean projectCompleted = true;
        int communicationScore = 68;
        int aptitudeScore = 74;

        // String studentName = "Kiran";
        // double academicPercentage = 70.0;
        // double attendancePercentage = 68.0;
        // int activeBacklogs = 0;
        // boolean projectCompleted = false;
        // int communicationScore = 65;
        // int aptitudeScore = 55;

        System.out.println("PLACEMENT READINESS REPORT");
        System.out.println();

        System.out.println("Student Name: " + studentName);
        System.out.println("Academic Status: " + (academicPercentage >= 60 ? "Eligible" : "Not Eligible"));
        System.out.println("Attendance Status: " + (attendancePercentage >= 75 ? "Eligible" : "Not Eligible"));
        System.out.println("Backlog Status: " + (activeBacklogs == 0 ? "Eligible" : "Not Eligible"));
        System.out.println("Project Status: " + (projectCompleted ? "Completed" : "Not Completed"));
        System.out.println("Communication Status: " + (communicationScore >= 60 ? "Eligible" : "Not Eligible"));
        System.out.println("Aptitude Status: " + (aptitudeScore >= 60 ? "Eligible" : "Not Eligible"));

        if (academicPercentage >= 60 && attendancePercentage >= 75 && activeBacklogs == 0 && projectCompleted
                && communicationScore >= 60 && aptitudeScore >= 60) {
            System.out.println("");
            System.out.println("Final Result: PLACEMENT READY");
            System.out.println("Message: All placement requirements are satisfied.");
        } else {
            System.out.println("");
            System.out.println("Final Result: NOT PLACEMENT READY");
            System.out.println("Message: Not all placement requirements are satisfied.");

            System.out.println("\nAreas to Improve:");
            if (academicPercentage < 60)
                System.out.println("Academics");
            if (attendancePercentage < 75)
                System.out.println("Attendance");
            if (activeBacklogs != 0)
                System.out.println("Backlogs");
            if (!projectCompleted)
                System.out.println("Project Completion");
            if (communicationScore < 60)
                System.out.println("Communication Skills");
            if (aptitudeScore < 60)
                System.out.println("Aptitude");
        }
    }
}