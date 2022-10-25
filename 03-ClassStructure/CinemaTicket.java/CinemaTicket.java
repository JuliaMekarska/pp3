public class CinemaTicket {
    static String cinemaName = "Cinema city";
    String filmTitle;
    int rowNumber;
    int seatNumber;
    double ticketPrice;
    
    public void displayData() {
        System.out.println("Cinema name: " + cinemaName);
        System.out.println("Film title: " + filmTitle);
        System.out.println("Row number: " + rowNumber);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + ticketPrice);
    }

     public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket();
        ticket1.filmTitle = "Harry Potter";
        ticket1.rowNumber = 10;
        ticket1.seatNumber = 30;
        ticket1.ticketPrice = 13.7;
        
        CinemaTicket ticket2 = new CinemaTicket();
        ticket2.filmTitle = "Incepcja";
        ticket2.rowNumber = 12;
        ticket2.seatNumber = 7;
        ticket2.ticketPrice = 15.8;
        
        ticket1.displayData();
        ticket2.displayData();
    }
}