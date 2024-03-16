package Database_Connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {

        // Veritabanı bağlantı parametreleri
        String url = "jdbc:mysql://localhost:3306/veritabani_adi";
        String user = "kullanici_adi";
        String password = "sifre";

        // JDBC bağlantısı için Connection referansı
        Connection conn = null;

        try {
            // JDBC sürücüsü yükleniyor
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Veritabanına bağlantı sağlanıyor
            conn = DriverManager.getConnection(url, user, password);

            // SQL sorgusu hazırlanıyor
            String sql = "SELECT * FROM tablo_adi";
            PreparedStatement statement = conn.prepareStatement(sql);

            // Sorgu çalıştırılıyor ve sonuçlar alınıyor
            ResultSet resultSet = statement.executeQuery();

            // Sonuçlar işleniyor
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Diğer sütunlar da bu şekilde alınabilir
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC sürücüsü bulunamadı");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Veritabanı bağlantı hatası");
            e.printStackTrace();
        } finally {
            // Bağlantı kapatılıyor
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }






    }
}
