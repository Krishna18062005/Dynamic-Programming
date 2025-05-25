class Event {
  constructor(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
  }
  checkAvailability() {
    return this.seats > 0;
  }
}
const event = new Event("Concert", "2025-08-05", 100);
console.log(event.checkAvailability());