package com.nbcinemas.offlineManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Film;
import com.nbcinemas.entities.WatchList;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.WatchListRepository;

@Default
@Stateless
public class WatchListRepositoryOffline implements WatchListRepository {
	
	@Inject
	private InitialData initialdata;

	@Override
	public void persistWatchList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Film> getFilmsInWatchList(int id) {
		for (WatchList w : initialdata.watchLists){
			if (w.getWatchListID() == id){
				return w.getFilms();
			}
		}
		return null;
	}

	@Override
	public void addFilm(Film film, int id) {
		for (WatchList w : initialdata.watchLists){
			if(w.getWatchListID() == id){
				w.addFilm(film);
			}
		}
		
	}

	@Override
	public void removeFilm(Film film, int id) {
		for (WatchList w : initialdata.watchLists){
			if(w.getWatchListID() == id){
				w.getFilms().remove(film);
			}
		}		
	}

	@Override
	public void deleteWatchList(int id) {
		for(WatchList w: initialdata.watchLists){
			if (w.getWatchListID() == id){
				w.setDeleted(true);
			}
		}
		
	}

}
