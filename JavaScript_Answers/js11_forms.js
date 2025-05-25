document.querySelector("form").addEventListener("submit", (e) => {
  e.preventDefault();
  const name = e.target.elements.name.value;
  const email = e.target.elements.email.value;
  if(name && email) {
    console.log("Form submitted:", name, email);
  } else {
    console.error("Missing inputs");
  }
});