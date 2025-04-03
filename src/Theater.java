import java.util.*;

public class Theater {

    private final DatabaseOperation db = new DatabaseOperation();

    public void insertTheater(String location,int SeatingCapacity){
        String sql = "INSERT INTO theaters (Location, SeatingCapacity) VALUES (?,?)";
        Object[] values = {location,SeatingCapacity};
        int rowsAffected = db.executeUpdate(sql, values);
        if(rowsAffected>0)
            System.out.println("Theater inserted successfully");
        else
            System.out.println("Something went wrong.Theater not inserted.");
    }

    public void showTheaters(){
        String sql = "SELECT * from theaters";
        List<Map<String,Object>> theaters = db.getRecords(sql);
        for (Map<String, Object> theater : theaters) {
            System.out.println("Theater ID: " + theater.get("TheaterID"));
            System.out.println("Location: " + theater.get("Location"));
            System.out.println("Seating Capacity: " + theater.get("SeatingCapacity"));
            System.out.println("-----------------------------");

        }

    }
}