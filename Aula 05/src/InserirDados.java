import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.*;

public class InserirDados extends JFrame {

    private Connection con;
    private Statement st;

    public InserirDados() throws SQLException {
        String driver = "org.postgresql.Driver";
        String sUser = "postgres";
        String sSenha = "1234";
        String sFonte = "jdbc:postgresql://localhost:5432/postgres";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(sFonte, sUser, sSenha);
            JOptionPane.showMessageDialog(this,"Banco conectado com sucesso!", "Mensagem", JOptionPane.WARNING_MESSAGE);
        }catch (SQLException eSql){
            eSql.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco!\n" + "Mensagem" + eSql.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco!\n" + "Mensagem: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        try{
            st = con.createStatement();
            st.executeUpdate("INSERT INTO Produto values (1, 'Arroz');");
            st.executeUpdate("INSERT INTO Produto values (2, 'Feijão');");
            st.executeUpdate("INSERT INTO Produto values (3, 'Macarrão');");
            } catch (SQLException eSQL) {
            JOptionPane.showMessageDialog(this, "Erro na expressão do INSERT! \n" + "Mensagem" + eSQL.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        try {
            st.close();
            con.close();
        }catch (Exception exception){
            exception.printStackTrace();
            System.exit(2);
        }

        Container P = getContentPane();
        P.setLayout(new FlowLayout());
        JLabel mensagem = new JLabel("Você acabou de testa um exemplo usando INSERT!");
        P.add(mensagem);
    }
    public static void main(String args[]) throws SQLException{
        InserirDados ex = new InserirDados();
        ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ex.setVisible(true);
        ex.setTitle("USANDO INSERT");
        ex.setSize(400,200);
    }
}

