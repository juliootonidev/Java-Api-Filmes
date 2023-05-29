package consumoapi;

import javax.swing.JOptionPane;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Principal {
	static Retrofit retrofit;

	public static void main(String[] args) {
		instanciaRetrofit();

		String title = "";
		while (true) {
			title = JOptionPane.showInputDialog("Digite o nome do filme, ou sair");
			if (title.equals("sair"))
				break;

			String year = JOptionPane
					.showInputDialog("Digite o ano do filme" + "Deixe em branco e virá o filme padrãoou sair");
			searchMovieByTitleAndYear(title, year);
		}
	}

	private static void searchMovieByTitleAndYear(String title, String year) {
		OmdbApiService apiService = retrofit.create(OmdbApiService.class);

		Call<MovieModel> call = apiService.searchMovirByTitle(title);
		Call<MovieModel> call1 = apiService.searchMovirByTitleAndYear(title, year);

		call1.enqueue(new Callback<MovieModel>() {

			public void onResponse(Call<MovieModel> call, Response<MovieModel> response) {
				if (response.isSuccessful()) {
					MovieModel movie = response.body();
					JOptionPane.showMessageDialog(null, movie);
					;
				}
				;
			}

			public void onFailure(Call<MovieModel> call, Throwable t) {
				System.out.println(t.toString());
				System.out.println("não foi");

			}
		});
	}

	private static void instanciaRetrofit() {
		retrofit = new Retrofit.Builder().baseUrl("https://www.omdbapi.com/")
				.addConverterFactory(GsonConverterFactory.create()).build();
	}
}
