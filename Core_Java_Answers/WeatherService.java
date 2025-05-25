// WeatherService.java
// This class is responsible for fetching weather data from the OpenWeatherMap API.
// Make sure to replace "YOUR_API_KEY" with your actual API key.

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {
    // Replace with your real OpenWeatherMap API key
    private static final String API_KEY = "YOUR_API_KEY";
    // Base URL for fetching weather data (current weather API)
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    /**
     * Fetches weather data for a given city.
     *
     * @param city the city name (e.g., "London")
     * @return the JSON response from the API as a String
     * @throws Exception if any error occurs while fetching the data
     */
    public static String getWeatherData(String city) throws Exception {
        // Build the API request URL in metric units
        String url = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";

        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();
        // Build the HTTP request for our URL
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();

        // Send the request and get the response as a String
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}