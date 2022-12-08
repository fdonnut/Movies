package com.donnut.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("?token=09YME5T-R4EM7VZ-QCXKR7Y-RQ7Y26Y&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=1&limit=5")
    Single<MovieResponse> loadMovies();
}
