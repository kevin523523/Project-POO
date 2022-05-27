
package PConexiones;

import static PConexiones.ConexionBaseDatos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ConexionDao {
    private static final String SQL_SELECT = "SELECT SSID,clave FROM TvDemo";
                                                    //SSID,clave
    private static final String SQL_INSERT = "INSERT INTO sourceconexion (id,SSID,clave) VALUES (?, ?, ?)";
   // private static final String SQL_UPDATE = "";//unsupported
   // private static final String SQL_DELETE = "";//unsuported
    private Connection conexionTransaccional;
    private static int id=0;
    
    
    public ConexionDao(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    public ArrayList<Conexion> seleccionar() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Conexion conex = null;
        ArrayList<Conexion> conexiones = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String SSID = rs.getString("SSID");
                String password = rs.getString("clave");
                conex = new Conexion(SSID, password);
                conexiones.add(conex);
            }
        
        } finally {
            try {
                close(stmt);
                close(rs);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
            }
        }
        return conexiones;
    }
    
    
    public int insertar(Conexion conex) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,ConexionDao.id++);
            stmt.setString(2, conex.getSSID());
            stmt.setString(3, conex.getClave());
            registros = stmt.executeUpdate();
       
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
            }
        }
        return registros;
    }
    
}
