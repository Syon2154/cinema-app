package org.cinema.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.cinema.dao.MovieSessionDao;
import org.cinema.lib.Inject;
import org.cinema.lib.Service;
import org.cinema.model.MovieSession;
import org.cinema.service.MovieSessionService;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {
    @Inject
    private MovieSessionDao sessionDao;

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return sessionDao.findAvailableSessions(movieId, date);
    }

    @Override
    public MovieSession get(Long id) {
        return sessionDao.get(id).get();
    }

    @Override
    public MovieSession add(MovieSession session) {
        return sessionDao.add(session);
    }
}
