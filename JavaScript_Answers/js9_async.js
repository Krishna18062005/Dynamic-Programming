async function fetchEvents() {
  try {
    const response = await fetch("https://api.example.com/events");
    const data = await response.json();
    console.log("Events:", data);
  } catch (err) {
    console.error("Error fetching events:", err);
  }
}
fetchEvents();