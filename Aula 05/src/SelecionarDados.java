import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.*;

public class SelecionarDados extends JFrame{

    private Connection con;
    private Statement st;

    public SelecionarDados() throws SQLException{
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

        try {
            st = con.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM produto");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Relação de pessoas cadastradas");
                for(int i=1; i<=numberOfColumns; i++){
                    System.out.printf("%-8s\t", metaData.getCatalogName(i));
                }
                while (resultSet.next()){
                    System.out.println();
                    String linha = "";
                    for(int x = 1; x <=numberOfColumns; x++){
                        System.out.printf("%-8s\t", resultSet.getObject(x));
                        linha = linha + " " + resultSet.getObject(x);
                        }
                    }
            } catch(SQLException eSql){
            JOptionPane.showMessageDialog(this, "Erro na expressão do SLECT!\n" + "Mensagem" + eSql.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Falha na conexão com o banco!\n" + "Mensagem" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            st.close();
            con.close();
        }catch (Exception exception){
            exception.printStackTrace();
            System.exit(2);
        }

        Container P =getContentPane();
        P.setLayout(new FlowLayout());
        JLabel mensagem1 = new JLabel("Você acabou de testar um exemplo usando SELECT!");
        JLabel mensagem2 = new JLabel("O resultado da consulta está no Console");
        P.add(mensagem1);
        P.add(mensagem2);
    }

    public static void main(String args[]) throws SQLException{
        SelecionarDados ex = new SelecionarDados();
        ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ex.setVisible(true);
        ex.setTitle("USANDO SELECT");
        ex.setSize(400,200);
    }
}
