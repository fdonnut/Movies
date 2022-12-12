package com.donnut.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("?token=09YME5T-R4EM7VZ-QCXKR7Y-RQ7Y26Y&field=rating.kp&search=4-8&sortField=votes.kp&sortType=-1&limit=100")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
