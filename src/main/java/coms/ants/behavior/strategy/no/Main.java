package coms.ants.behavior.strategy.no;

public class Main {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(100);
        movieTicket.setType("vip");
        System.out.println(movieTicket.curTicketPrice());
    }
}
