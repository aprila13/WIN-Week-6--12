
function sayHello() {
  let header = document.querySelector("#greeting");
  let hello = ("<h1> hello world </h1>");
  header.innerHTML = hello;
}

module.exports = sayHello();