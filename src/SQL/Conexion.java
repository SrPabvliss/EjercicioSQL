package SQL;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection cx = null;
    public PreparedStatement ps;
    public ResultSet rs;
    public ResultSetMetaData rsm;

    public void conection() {
        String bd = "empresa";
        String URL = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String clave = "Villacres_04";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(URL + bd, usuario, clave);
            System.out.println("Se ha conectado exitosamente");
        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println("No se ha podido conectar");
        }
    }

    public void consultar(String w, JComboBox combo, JList lista) {
        ResultSet rs;
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT * FROM  empleado where " + w + "='" + combo.getSelectedItem() + "';");

            while (rs.next()) {
                dato = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    //Metodo para llenar JList con un dato solicitado, incluye repetidos
    public void consultar(String p, JList lista, String tabla) {
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + ";");

            while (rs.next()) {
                dato = rs.getString(1);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //metodo para consultar varios campos
    public void consultar(String p, JList lista, String tabla, int cantidad) {
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {

            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + ";");

            while (rs.next()) {
                dato = getLineaCodigo(cantidad);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //Editar en caso de necesitar mas campos (pateado) pero funciona
    private String getLineaCodigo(int i) {
        String codigo = null;
        try {

            switch (i) {
                case 1 ->
                    codigo = rs.getString(1);
                case 2 ->
                    codigo = rs.getString(1) + "   " + rs.getString(2);
                case 3 ->
                    codigo = rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3);
                case 4 ->
                    codigo = rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "   " + rs.getString(4);
                case 5 ->
                    codigo = rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "   " + rs.getString(4) + "   " + rs.getString(5);
                default ->
                    throw new AssertionError();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }

    //Metodo para llenar con todos los datos
    public void consultar(JList lista, String tabla) {

        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {

            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT * FROM " + tabla + ";");

            while (rs.next()) {
                //Modificar segun la cantidad de campos que tenga su tabla
                dato = rs.getString(1) + "    " + rs.getString(2) + "    " + rs.getString(3) + "    " + rs.getString(4);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //Metodo para llenar JList con un dato solicitado sin repetidos
    public void consultar(String p, JList lista, String tabla, String grupo) {
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();
        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + " group by " + grupo + ";");

            while (rs.next()) {
                dato = rs.getString(1);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //Metodo para ordenar un dato, elegir si es ascendente (asc) o descendente (desc)
    public void ordenar(String p, JList lista, String tabla, String orden) {
        //p selecciona los campos que se quiere obtener 
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + " order by " + p + " " + orden + ";");

            while (rs.next()) {

                dato = rs.getString(1);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //Metodo para ordenar un dato, elegir si es ascendente (asc) o descendente (desc) cuando se ordena segun una columna pero se necesita los datos de otra
    //Efectivamente este metodo podria cumplir la funcion que el de arriba pero no me dio la gana, les dejo las 2 opciones tqm 
    public void ordenar(String p, String q, JList lista, String tabla, String orden) {
        //p selecciona los campos que se quiere obtener y q segun el dato que se quiere ordenar
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + " order by " + q + " " + orden + ";");

            while (rs.next()) {

                dato = rs.getString(1);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }
    
    //Este metodo existe para cuando se requiere ordenar y obtener una cantidad especifica de filas o registros
    public void ordenar(String p, String q, JList lista, String tabla, String orden, int limite) {
        //p selecciona los campos que se quiere obtener y q segun el dato que se quiere ordenar
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {
            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT " + p + " FROM " + tabla + " order by " + q + " " + orden + " LIMIT "+limite+";");

            while (rs.next()) {
                //modificar segun la cantidad de campos que se necesite
                dato = rs.getString(1)+ "   " + rs.getString(2);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }

    //Metodo para obtener la cantidad filas que se soliciten
    public void obtenerFilas(JList lista, String tabla, int limite) {
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {

            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT * FROM " + tabla + " LIMIT " + limite + ";");

            while (rs.next()) {
                //Modificar segun la cantidad de campos que tenga su tabla
                dato = rs.getString(1) + "    " + rs.getString(2);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }
    
    //Metodo para encontrar los registros que tengan algo en comun
    public void obtenerFilas (String campoAobtener, JList lista, String tabla,String campoAcomparar, String similitud){
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {

            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT "+campoAobtener+ " FROM " + tabla + " WHERE " + campoAcomparar+" = "+ similitud+ ";");

            while (rs.next()) {
                //Modificar segun la cantidad de campos que tenga su tabla
                dato = rs.getString(1) + "    " + rs.getString(2);
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }
    //Metodo para encontrar los registros con la condicion que se de >, <, =
    public void obtenerFilas (String campoAobtener, JList lista, String tabla,String campoAcomparar, String condicion, int similitud ){
        //p selecciona los campos que se quiere obtener (no funciona con *)
        String dato;
        DefaultListModel<String> modelo = new DefaultListModel<>();

        try {

            Statement leer = cx.createStatement();
            rs = leer.executeQuery("SELECT "+campoAobtener+ " FROM " + tabla + " WHERE " + campoAcomparar+" "+ condicion+" "+ similitud+ ";");

            while (rs.next()) {
                //Modificar segun la necesidad
                dato = rs.getString(1) ;
                modelo.addElement(dato);
            }
            lista.setModel(modelo);

        } catch (SQLException ex) {
            System.out.println("Error = " + ex);
        }
    }
    
}
