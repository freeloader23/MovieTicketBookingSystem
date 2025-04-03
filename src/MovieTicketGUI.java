 
import javax.swing.*;

public class MovieTicketGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Movie Ticket Booking System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create buttons
        JButton bookTicketButton = new JButton("Book Ticket");
        bookTicketButton.setBounds(120, 50, 150, 30);
        
        JButton viewMoviesButton = new JButton("View Movies");
        viewMoviesButton.setBounds(120, 100, 150, 30);

        JButton viewTheatersButton = new JButton("View Theaters");
        viewTheatersButton.setBounds(120, 150, 150, 30);

        // Add buttons to frame
        frame.add(bookTicketButton);
        frame.add(viewMoviesButton);
        frame.add(viewTheatersButton);

        // Make frame visible
        frame.setVisible(true);
    }
}
