public class TestClass {
    public static void main(String[] args) {
        TicketBookService ts=new TicketBookService();
        Ticket t=ts.bookTicket("gold","joe","6pm",2);
        System.out.println(t);
    }


}
