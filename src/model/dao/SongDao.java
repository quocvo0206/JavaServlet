package model.dao;

import model.bean.Song;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongDao {
    public List<Song> getListSong() throws SQLException {
        List<Song> lsSong = new ArrayList<>();
        ConnectDB connectDB = new ConnectDB();
        Connection connect = connectDB.connect();
        Statement stm = connect.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM asong.songs");
        while (rs.next()){
            Song song = new Song();
            song.setCatId(rs.getInt("cat_id"));
            song.setCounter(rs.getInt("counter"));
            song.setDateCreate(rs.getDate("date_create"));
            song.setDetailText(rs.getString("detail_text"));
            song.setName(rs.getString("name"));
            song.setId(rs.getInt("id"));
            song.setPicture(rs.getString("picture"));
            song.setPreviewText(rs.getString("preview_text"));
            lsSong.add(song);
        }
        return lsSong;
    }
}
