public class Main {
    public static String printTicketDetails(Ticket ticket) {
        return ticket.getPnrNumber();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Travel Reservation System");

        Flight f1 = new Flight(01, "AirIndia", 250);
        String locations[] = {"Odisha", "Hyderabad", "Gateway Of India", "Red Fort", "Bangalore"};

        TouristTickets ticket1 = new TouristTickets(f1, "337866", "Mumbai", "Delhi", "18:00", "19:00", "7/09/2021", "7/09/2021", 45, 5000, "Hotel Paramount", locations);
        RegularTickets ticket2 = new RegularTickets(f1, "423247", "Mumbai", "Delhi", "18:00", "19:00", "7/09/2021", "7/09/2021", 45, 5000, "Food, Water, Snacks");

        System.out.println(Main.printTicketDetails(ticket1));
        System.out.println(Main.printTicketDetails(ticket2));
    }
}