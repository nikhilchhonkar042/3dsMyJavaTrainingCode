/**
 * 
 */

 
			function validate() {
				var x=document.getElementById('uname').value;
				var y=document.getElementById('upass').value;
				
				console.log('value of x '+x);
				console.log('value of y '+y);

				if(x =="") {
					//alert('Username cannot be blank');	
					document.getElementById("nameErr").innerHTML="Username cannot be blank";
					return false;
				}		
				
				if(y =="") {
					//alert('Password cannot be blank');	return false
					document.getElementById("passErr").innerHTML="Password cannot be blank";
					return false;
				}			
				return true;
			}	
			
			function clearForm() {
				document.getElementById('uname').value="";
				document.getElementById('upass').value="";
				
			}
			
			function clearNameErrMsg() {
				document.getElementById('nameErr').innerHTML="";

			}
			
			function clearPassErrMsg() {
				document.getElementById('passErr').innerHTML="";

			}
			
			
			
			
   function validateEmail() {
    var emailInput = document.getElementById('email');
    var emailErrElement = document.getElementById('emailErr');
    var email = emailInput.value.trim();
    var emailPattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    if (email === "") {
        emailErrElement.innerHTML = "Email cannot be blank";
    } else if (!emailPattern.test(email)) {
        emailErrElement.innerHTML = "Invalid email format! Please enter a valid email address.";
    } else {
        emailErrElement.innerHTML = "";
    }
}



//This is my validateForm function where we are checking email , birthday , username , password 


function validateForm() {
    var email = document.getElementById('email').value;
    var birthdate = document.getElementById('birthdate').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Email validation using the emailPattern from validation.js
    var emailPattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (!emailPattern.test(email)) {
        alert("Invalid email format! Please enter a valid email address. Please Try again");
        return false;
    }

    // Username validation: minimum 8 characters
    if (username.length < 8) {
        alert("Username must be at least 8 characters long.Please Try again");
        return false;
    }

    // Password validation using the passwordPattern from validation.js
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    //(?=.*[a-z]) to check any number of small char (?=.*[A-Z]) to check any no of capital char (?=.*\d) to check at lest one digit (?=.*[@$!%*?&]) to check any number of special char [A-Za-z\d@$!%*?&] to check all this make at lest 8 letter sting {8,}
    if (!passwordPattern.test(password)) {
        alert("Invalid password format! Password must be at least 8 characters long and contain uppercase, lowercase, digits, and symbols.Please update your password And Try again");
        return false;
    }

    // Age validation: minimum 18 years old
    var today = new Date();// this is todays date in present time by computer
    var birthdateObj = new Date(birthdate); // data of birth enter by user
    var ageInMilliseconds = today - birthdateObj;// calculating age difference in milli sec
    var ageInYears = ageInMilliseconds / (1000 * 60 * 60 * 24 * 365); // changing age from mili sec to year
    
    
    if (ageInYears < 18) {
        alert("User must be at least 18 years old to register.Please Try again");
        return false;
    }

    return true;
}
// clearform function to clear written data , so USer can try again 
function clearForm() {
    document.getElementById('email').value = '';
    document.getElementById('birthdate').value = '';
    document.getElementById('username').value = '';
    document.getElementById('password').value = '';
    document.getElementById('emailErr').innerHTML = '';
}
