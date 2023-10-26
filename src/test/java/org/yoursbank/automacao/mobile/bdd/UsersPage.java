package org.yoursbank.automacao.mobile.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersPage {
    // ...

    // Método para atualizar o status "verified" do usuário
    public void atualizarStatusUsuario(String Email) {
        String dbUrl = "jdbc:postgresql://dpg-ckdbi16ct0pc73f4bm60-a.oregon-postgres.render.com/stouch_free";
        String username = "stouch_free_user";
        String password = "XmIdJ5GZtIvh7ERAnJRiEIaM5wRKPMJJ";

        try (Connection connection = DriverManager.getConnection(dbUrl, username, password)) {
            if (connection != null) {
                System.out.println("Conexão com o banco de dados PostgreSQL bem-sucedida!");

                String sql = "UPDATE public.users SET verified = true WHERE email = ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, Email);
                    int rowsUpdated = preparedStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        System.out.println("Atualização realizada com sucesso para o userEmail: " + Email);
                    } else {
                        System.out.println("Nenhum registro encontrado para o userEmail: " + Email);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
