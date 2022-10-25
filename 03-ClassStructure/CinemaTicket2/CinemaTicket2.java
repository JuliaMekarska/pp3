public class CinemaTicket2 {
    static String cinemaName = "Morning Star Cinema";
    static String filmTitle = "Gladiator";
    int rowNumber;
    int seatNumber;
    double ticketPrice;
    
    public CinemaTicket2(String t, int r, int s) {
        filmTitle = t;
        rowNumber = r;
        seatNumber = s;
        
        if (rowNumber <= 2) {
            ticketPrice = 10;
        } else {
            ticketPrice = 25;
        }
    }
    
    public void displayData() {
        System.out.println("Cinema name: " + cinemaName);
        System.out.println("Film title: " + filmTitle);
        System.out.println("Row number: " + rowNumber);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + ticketPrice);
    }

     public static void main(String[] args) {
        CinemaTicket2 ticket1 = new CinemaTicket2("Gladiator", 2, 1);
        CinemaTicket2 ticket2 = new CinemaTicket2("Gladiator", 7, 2);
        
        ticket1.displayData();
        ticket2.displayData();

    }
}