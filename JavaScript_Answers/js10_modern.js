const displayEvent = ({ name, date }) => {
  console.log(`Event: ${name} on ${date}`);
};
const event = { name: "Seminar", date: "2025-09-10" };
displayEvent(event);