// 1. Variable assignment and console log
let language = "JavaScript";          
console.log(`I am learning ${language}!`); 

// 2. Greeting Function
function greet(name) {                
  return `Hello, ${name}!`;             
}                                      
console.log(greet("Swaraj"));          

// 3. Even or Odd Checker
let number = 7;                       
if (number % 2 === 0) {                 
  console.log("Even");                 
} else {                               
  console.log("Odd");                   
}                                      

// 4. Countdown Timer
for (let i = 5; i >= 1; i--) {          
  console.log(i);                       
}                                       
console.log("Boom!");                   

// 5. Print All Colors
let colors = ["Red", "Blue", "Green"];  
for (let i = 0; i < colors.length; i++) { 
  console.log(colors[i]);               
}    

// Task 8: Generate a Random Number
    let randomNumber = Math.floor(Math.random() * 100);
    console.log("Random Number (0-99):", randomNumber);

// Task 9: Simple Add Function
    function add(a, b) {
      return a + b;
    }
    console.log("Sum:", add(5, 7));

// Task 10: Login Status
    let isLoggedIn = true;
    if (isLoggedIn) {
      console.log("Welcome back!");
    }

// Task 11: String Length
    let word = "Superman";
    console.log("Length of word:", word.length);

// Task 12: Add to Fruits Array
    let fruits = ["Apple", "Banana"];
    fruits.push("Mango");
    console.log("Fruits:", fruits);

// Task 13: Break a Loop at 5
    for (let i = 0; i < 10; i++) {
      if (i === 5) {
        break;
      }
      console.log("Loop value:", i);
    }

 // Task 14: Find Variable Type
    let score = 42;
    console.log("Type of score:", typeof score);