import java.util.Scanner;

class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String inputBloodType = scanner.nextLine().trim();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String inputRhFactor = scanner.nextLine().trim();

        BloodData bd;
        if (!inputBloodType.isEmpty() && !inputRhFactor.isEmpty()) {
            bd = new BloodData(inputBloodType, inputRhFactor);
        } else {
            bd = new BloodData();
        }

        bd.display();
        
        scanner.close();
    }
}
