public class Room {
    int number;
    int beds;
    boolean isOccupied;
    String guestName = "";

    Room(int number) {
        this.beds = 2;
        this.number = number;
    }

    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public void CheckIn(String guestName) {
        this.guestName = guestName;
        this.isOccupied = true;
    }

    public void CheckOut() {
        this.guestName = "";
        this.isOccupied = false;
    }

    public void IsOccupied() {
        System.out.println("Is room occupied?: " + this.isOccupied);
    }

    public void DisplayStatus() {
        System.out.print("Number: " + this.number);
        System.out.print(", Beds: " + this.beds);
        System.out.print(", Is occupied: " + this.isOccupied);
        System.out.print(", Guest: " + this.guestName + ".");
        System.out.println("");
    }

    public String toString(){
        return 
            "Room Number : " + this.number + 
            ", Number of beds : " + this.beds + 
            ", is Occupied? : " + this.isOccupied + 
            ", Guest name : " + this.guestName;
    }

    public static void DisplayReport(Room[] rooms) {
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

    public static void DisplayReportSpecifiedBeds(Room[] rooms, int beds) {
        for (Room room : rooms) {
            if (room.beds == beds) {
                System.out.println(room.toString());
            }
        }
    }

    public static void DisplayReportVacantAndOccupied(Room[] rooms) {
        int vacant = 0;
        int occupied = 0;
        for (Room room : rooms) {
            if (room.isOccupied == true) {
                occupied += 1;
            } else {
                vacant += 1;
            }
        }

        System.out.println("Number of vacant rooms: " + vacant);
        System.out.println("Number of occupied rooms: " + occupied);
        System.out.println("-----------");
    }

    public static void DisplayReportHowManyBeds(Room[] rooms) {
        int vacantBeds=0;
        for (Room room : rooms) {
            if (room.isOccupied == false) {
                vacantBeds += room.beds;
            }
        }

        System.out.println("There are " + vacantBeds + " beds available.");
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4,3);
        Room r5 = new Room(5,3);
        Room r6 = new Room(6,1);

        Room[] rooms = {r1, r2, r3, r4, r5, r6};

        System.out.println(rooms[3].toString());
        System.out.println("-----------");
        DisplayReport(rooms);
        System.out.println("-----------");
        DisplayReportSpecifiedBeds(rooms, 2);
        System.out.println("-----------");
        DisplayReportVacantAndOccupied(rooms);
        DisplayReportHowManyBeds(rooms);

    }
}