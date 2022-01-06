/**
 *
 */

const url = window.location.origin("");

let button = document.getElementById("btn");

button.addEventListener("click", addUser);

function addUser() {
  const postUrl = url + "/users/add";

  let ifirstName = document.getElementById("firstName").value;
  let ilastName = document.getElementById("lastName").value;
  let iusername = document.getElementById("username").value;
  let ipassword = documetn.getElementById("password").value;
  let iemail = document.getElementById("email").value;

  //build the object

  let user = {
    firstName: ifirstName,
    lastName: ilastName,
    username: iusername,
    password: ipassword,
    email: iemail,
  };
}
