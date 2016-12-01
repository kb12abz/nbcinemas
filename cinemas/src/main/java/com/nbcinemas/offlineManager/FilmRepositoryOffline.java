package com.nbcinemas.offlineManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Film;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.FilmRepository;

@Default
@Stateless
public class FilmRepositoryOffline implements FilmRepository {

	@Inject
	private InitialData initialData;

	@Override
	public void persistFilm(String filmName, int rating, String description, String imagePath, Date lastViewingDate) {
		Film f = new Film(filmName, rating, description, imagePath, lastViewingDate);
		f.setFilmID(initialData.films.size() + 1);
		initialData.addFilm(f);

	}

	@Override
	public List<Film> getFilmByKeyword(String keyword) {
		ArrayList<Film> foundFilms = new ArrayList<Film>();
		for (Film f : initialData.films) {
			if (f.getFilmName().toLowerCase().contains(keyword.toLowerCase())) {
				foundFilms.add(f);
			}
		}
		return foundFilms;
	}

	@Override
	public Film getFilmByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film getFilmByID(int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				return f;
			}
		}
		return null;
	}

	@Override
	public Date getLastViewing(int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				return f.getLastViewingDate();
			}
		}
		return null;
	}

	@Override
	public List<Film> findAll() {
		return initialData.films;
	}

	@Override
	public void updateFilmName(String name, int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				f.setFilmName(name);
			}
		}

	}

	@Override
	public void updateFilmDescription(String description, int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				f.setDescription(description);
			}
		}

	}

	@Override
	public void updateFilmImagePath(String imagePath, int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				f.setImagePath(imagePath);
			}
		}
	}

	@Override
	public void deleteFilm(int id) {
		for (Film f : initialData.films) {
			if (f.getFilmID() == id) {
				f.setDeleted(true);
			}
		}

	}
}
