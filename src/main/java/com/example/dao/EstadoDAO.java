package com.example.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.example.model.Estado;

public class EstadoDAO extends DAO {

    public EstadoDAO(Connection conn) {
        super(conn);
        //TODO Auto-generated constructor stub
    }
    
    public List<Estado> listar(){
        List<Estado> retorno = new LinkedList<>();
        try {
            String sql = "select * from estado";
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);
            while(result.next()){
                Estado estado = new Estado(result.getLong("id"), result.getString("nome"), result.getString("uf"));
                retorno.add(estado);
            }
        } catch (Exception e) {
            System.out.println("Não foi possivel executar a consulta de ESTADO.");
        }
        return retorno;
       
    }

    public Estado listarPorUF(String uf) {
        Estado estado = null;
        try {
            String sql = "select * from estado where uf = ? limit 1";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            while(result.next()){
                estado = new Estado(result.getLong("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
       
        return estado;
    }

}
