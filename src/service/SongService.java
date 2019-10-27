package service;

import model.bean.Categories;
import model.bean.Song;
import model.dao.CategoriesDao;
import model.dao.SongDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongService {
    public List<Song> getLsSong() throws SQLException {
        SongDao songDao = new SongDao();
        List<Song> lsSong = new ArrayList<>();
        lsSong = songDao.getListSong();
        return lsSong;
    }
    public List<Categories> getLsCategories() throws SQLException {
        CategoriesDao categoriesDao = new CategoriesDao();
        List<Categories> lsCategories = categoriesDao.getListCategories();
        return lsCategories;
    }
}
