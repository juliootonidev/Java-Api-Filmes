package consumoapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OmdbApiService {
	
	final String KEY = "?apikey=8e8bd0de";

	@GET(KEY)
	public Call<MovieModel> searchMovirByTitle(@Query("t") String title);
	
	@GET(KEY)
	public Call<MovieModel> searchMovirByTitleAndYear(@Query("t") String title, @Query("y") String year);
}
