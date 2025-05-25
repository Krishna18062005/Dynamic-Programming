// WeatherDashboard.java
// This class creates a simple Swing-based user interface to input a city name,
// fetch and display weather data using the WeatherService. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeatherDashboard extends JFrame {
    // UI components for city input and displaying results
    private JTextField cityInputField;
    private JButton fetchWeatherButton;
    private JTextArea weatherResultArea;

    public WeatherDashboard() {
        setTitle("Weather Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI(); // set up UI components
    }

    private void initUI() {
        // Main panel layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // --- Input panel at the top for city name and fetch button ---
        JPanel inputPanel = new JPanel();
        cityInputField = new JTextField(20);
        fetchWeatherButton = new JButton("Get Weather");
        inputPanel.add(new JLabel("Enter City:"));
        inputPanel.add(cityInputField);
        inputPanel.add(fetchWeatherButton);
        
        // --- Result area in center for displaying fetched weather data ---
        weatherResultArea = new JTextArea();
        weatherResultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(weatherResultArea);
        
        // Add input panel and result area to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Attach main panel to the frame
        add(mainPanel);
        
        // Add action listener to the fetch button
        fetchWeatherButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String cityName = cityInputField.getText().trim();
                if (cityName.isEmpty()) {
                    JOptionPane.showMessageDialog(WeatherDashboard.this, "Please enter a city name.");
                    return;
                }
                // Clear previous result and start fetching weather data
                weatherResultArea.setText("Fetching weather data for " + cityName + "...\n");
                fetchWeather(cityName);
            }
        });
    }

    /**
     * Uses a new thread to fetch weather data so the UI stays responsive.
     * @param city the city name provided by the user
     */
    private void fetchWeather(String city) {
        new Thread(() -> {
            try {
                // Get weather data as JSON string from WeatherService
                String weatherData = WeatherService.getWeatherData(city);
                // Update the result area on the Event Dispatch Thread
                SwingUtilities.invokeLater(() -> {
                    weatherResultArea.append("Weather Data:\n" + weatherData);
                });
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> {
                    weatherResultArea.append("Error fetching data: " + ex.getMessage());
                });
            }
        }).start();
    }

    public static void main(String[] args) {
        // Create and display the dashboard on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            WeatherDashboard dashboard = new WeatherDashboard();
            dashboard.setVisible(true);
        });
    }
}