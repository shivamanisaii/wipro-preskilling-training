public class DatabaseConnection implements AutoCloseable {

    public void connect() {

        System.out.println("Connecting to database...");
    }

    @Override
    public void close() {

        System.out.println("Closing database connection...");
    }

    public static void main(String[] args) {

        try(DatabaseConnection db = new DatabaseConnection()) {

            db.connect();

            System.out.println("Performing operations...");
        }

        catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}