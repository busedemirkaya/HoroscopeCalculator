import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Birth Month: ");
        month = input.nextInt();
        System.out.print("Birth Day: ");
        day = input.nextInt();

        if ((day >= 1) && (day <= 31)) {

            switch (month) {
                //January
                case 1:
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                    break;

                //February
                case 2:
                    if (day < 20) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                    break;

                //March
                case 3:
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                    break;

                //April
                case 4:
                    if (day < 21) {
                        horoscope = "Aries";
                    } else {
                        horoscope = "Taurus";
                    }
                    break;

                //May
                case 5:
                    if (day < 22) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                    break;

                //June
                case 6:
                    if (day < 23) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                    break;

                //July
                case 7:
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                    break;

                //August
                case 8:
                    if (day < 23) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                    break;

                //September
                case 9:
                    if (day < 23) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                    break;

                //October
                case 10:
                    if (day < 23) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                    break;


                //November
                case 11:
                    if (day < 22) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                    break;


                //December
                case 12:
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                    break;

            }
            System.out.println("Your Horoscope: " + horoscope);
        } else {
            System.out.print("Invalid Month or Day");
        }
    }
}