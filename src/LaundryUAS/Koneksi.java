package LaundryUAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection getKoneksi() {
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/laundry", "root", "");
            System.out.println("Koneksi berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return koneksi;
    }

    public static void main(String[] args) {
        Connection conn = getKoneksi();
        if (conn != null) {
            // Koneksi berhasil, lanjutkan dengan operasi database lainnya
        } else {
            // Koneksi gagal
        }
    }
}
