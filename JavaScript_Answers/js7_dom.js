document.addEventListener("DOMContentLoaded", () => {
  const container = document.querySelector("#eventContainer");
  const card = document.createElement("div");
  card.textContent = "New Event Card";
  container.appendChild(card);
});