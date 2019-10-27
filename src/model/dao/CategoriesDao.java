package model.dao;

import model.bean.Categories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriesDao {

    public List<Categories> getListCategories() throws SQLException {
        List<Categories> lsCategories = new ArrayList<>();
        ConnectDB connectDB = new ConnectDB();
        Connection connection = connectDB.connect();
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM asong.categories");
        while (rs.next()){
            Categories categories = new Categories();
            categories.setId(rs.getInt("id"));
            categories.setName(rs.getString("name"));
            lsCategories.add(categories);
        }
        return lsCategories;
    }
}
