package com.example;

import java.sql.SQLException;
import java.util.List;

import com.example.dao.ConnectManager;
import com.example.dao.EstadoDAO;
import com.example.model.Estado;

public class App {

    public static void main(String[] args) {
        new App();
    }

    public App(){
        try(var conn = ConnectManager.getConnection()){
            //carregarDriverJDBC();
            
            EstadoDAO estadoDAO = new EstadoDAO(conn);
            //estadoDAO.listarConsole("estado");
            List<Estado> estados = estadoDAO.listar();
            for (Estado estado : estados) {
                System.out.println(estado);
            }
            
            Estado estado = estadoDAO.listarPorUF("DF");
            if(estado != null){
                System.out.println(estado);
            }


        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }        
    }

    
    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
        }
    }
}
