document.getElementById('register').addEventListener('submit', register);
document.getElementById('login').addEventListener('submit', login);


function login(e){
    e.preventDefault();
    email = document.getElementById('email').value;
    password = document.getElementById('password').value;
    phone = document.getElementById('phone').value;
    value = validate(email,phone)
    if(value){
        alert('Registration succesfull');
    } else {
        alert('invalid')
    }
}

function register(e){
    e.preventDefault();
    email = document.getElementById('email').value;
    password = document.getElementById('password').value;
    phone = document.getElementById('phone').value;
    value = validate(email,phone)
    if(value){
        alert('Registration succesfull');
    } else {
        alert('invalid')
    }
}

function validate(email,phone){
   x = validateEmail(email);
   y = validatePhone(phone);
   if(x && y){
    return true;
   } else {
    return false;
   }
}

function validateEmail(email) {
    var emailRegex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return emailRegex.test(email);
}

function validatePhone(phone) {
    var phoneRegex = /^(\+91-|\+91|0)?\d{10}$/;
    return phoneRegex.test(phone);
}
