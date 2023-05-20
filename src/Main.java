import java.time.LocalDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String cnp = "2850516323690";

        System.out.println(cnp.charAt(0));
        // In Romania, the first character of the social security number
        // represents the biological sex of a person.
        // Below, we take from the social security number the first character
        // and check whether they are male or female.
        char gender = ' ';
        switch (cnp.charAt(0)){
            case '1', '3', '5', '7' -> gender = 'M';
            case '2', '4', '6', '8' -> gender = 'F';
        }

        String prefix = "";
        switch (cnp.charAt(0)) {
            case '1', '2' -> prefix = "19";
            case '3', '4' -> prefix = "18";
            case '5', '6' -> prefix = "20";
        }


        System.out.println(cnp.substring(1, 7));
        int year = Integer.parseInt(prefix + cnp.substring(1,3));
        int month = Integer.parseInt(cnp.substring(3,5));
        int day = Integer.parseInt(cnp.substring(5,7));
        String birthDate = year + "-" + month + "-" + day;

        // Here we take the current date and time and whe calculate exact age of the social security number owner
        LocalDateTime now = LocalDateTime.now();
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();
        int currentDay = now.getDayOfMonth();
        int age = currentYear - year;


        if (month > currentMonth){
            --age;
        } else if (month == currentMonth) {
            if (day >= currentDay) {
                // TODO: Solve the issue when current day is equal to birthday
                --age;
            }
        }

        int county = Integer.parseInt(cnp.substring(7,9));
        String stringCounty = "";
        switch (county) {
            case 1 -> stringCounty = "Alba";
            case 2 -> stringCounty = "Arad";
            case 3 -> stringCounty = "Arges";
            case 4 -> stringCounty = "Bacau";
            case 5 -> stringCounty = "Bihor";
            case 6 -> stringCounty = "Bistrita";
            case 7 -> stringCounty = "Botosani";
            case 8 -> stringCounty = "Brasov";
            case 9 -> stringCounty = "Braila";
            case 10 -> stringCounty = "Buzau";
            case 11 -> stringCounty = "Caras Severin";
            case 12 -> stringCounty = "Cluj";
            case 13 -> stringCounty = "Constanta";
            case 14 -> stringCounty = "Covasna";
            case 15 -> stringCounty = "Dambovita";
            case 16 -> stringCounty = "Dolj";
            case 17 -> stringCounty = "Galati";
            case 18 -> stringCounty = "Gorj";
            case 19 -> stringCounty = "Harghita";
            case 20 -> stringCounty = "Hunedoara";
            case 21 -> stringCounty = "Ialomita";
            case 22 -> stringCounty = "Iasi";
            case 23 -> stringCounty = "Ilfov";
            case 24 -> stringCounty = "Maramures";
            case 25 -> stringCounty = "Mehedinti";
            case 26 -> stringCounty = "Mures";
            case 27 -> stringCounty = "Neamt";
            case 28 -> stringCounty = "Olt";
            case 29 -> stringCounty = "Prahova";
            case 30 -> stringCounty = "Satu Mare";
            case 31 -> stringCounty = "Salaj";
            case 32 -> stringCounty = "Sibiu";
        }

        System.out.println("Your CNP is: " + cnp);
        System.out.println("Gender: " + gender);
        System.out.println("Birt date: " + birthDate);
        System.out.println("Age: " + age);
        System.out.println("County: " + stringCounty);
    }
}
