import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/departments";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public void saveDepartment(Department department) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, department.getId());
            statement.setString(2, department.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Department department = new Department(1, "HR");
        DepartmentDAO departmentDAO = new DepartmentDAO();
        departmentDAO.saveDepartment(department);
        System.out.println("Department saved successfully.");
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}