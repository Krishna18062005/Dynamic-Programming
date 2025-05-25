document.getElementById("registerBtn").addEventListener("click", () => {
  alert("Registered for event!");
});
document.getElementById("filterSelect").addEventListener("change", (e) => {
  console.log("Selected category:", e.target.value);
});