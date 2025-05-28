What does DOM stand for? a) Document Object Model https://developer.mozilla.org/en-US/docs/Web/API/Document_Object_Model

Which method is used to select an element by its ID? c) getElementById() https://developer.mozilla.org/en-US/docs/Web/API/Document/getElementById

What does document.querySelector(".box") select? b) The first element with class "box" https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector

How do you change the text of an element with ID "message"? d) document.getElementById("message").innerText = "Hello" https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/innerText

What is the purpose of innerHTML? c) To get or set the HTML content of an element https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML

JavaScript Events What is an event in JavaScript? b) A user or browser action https://javascript.info/introduction-browser-events

Which event occurs when a user clicks an HTML element? c) onclick https://developer.mozilla.org/en-US/docs/Web/API/Element/click_event

How can you add a click event to a button in JavaScript? b) addEventListener("click") https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener

What does event.preventDefault() do? b) Stops default action like form submission https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault

Which method attaches an event handler? c) addEventListener() https://www.freecodecamp.org/news/what-is-addeventlistener-in-javascript/

Math.random() & Numbers What does Math.random() return? c) A number between 0 and 1 https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random

How do you get a random integer from 1 to 10? c) Math.floor(Math.random() * 10) + 1 https://www.freecodecamp.org/news/javascript-random-number-how-to-generate-one/

What is the output range of Math.random()? c) 0 (inclusive) to 1 (exclusive) https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random

Which function converts a float to an integer? b) Math.floor() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/floor

What will Math.floor(4.9) return? b) 4 https://javascript.info/math

Variables How do you declare a variable in JavaScript? d) All of the above https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Grammar_and_types#declarations

Which variable type allows reassignment? b) let https://www.javascripttutorial.net/es6/javascript-let/

Which keyword declares a block-scoped variable? c) let https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/let

What happens if you use a variable without declaring it? b) It becomes a global variable https://www.tutorialspoint.com/what-happens-if-you-assign-a-value-to-a-variable-that-has-not-been-declared-in-javascript

Which keyword creates a constant? c) const https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/const

Functions What is a function? b) A reusable block of code https://www.codecademy.com/resources/docs/javascript/functions

How do you define a function named sayHello? a) function sayHello() {} https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Functions

How do you call a function? c) sayHello() https://www.javascripttutorial.net/javascript-function-call/

What is the keyword to return a value? c) return https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/return

What is a parameter in a function? b) A variable passed into a function https://javascript.info/function-basics

Mixed Concepts What will typeof "hello" return? a) string https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/typeof

What does console.log() do? c) Outputs messages to the browser console https://developer.mozilla.org/en-US/docs/Web/API/console/log

How do you write a comment in JavaScript? b) // comment https://www.tutorialspoint.com/javascript/javascript_comments.htm

Which is a valid function expression? b) let add = function(x, y) { return x + y; } https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/function

What does NaN mean? a) Not a Number https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NaN

Which method converts a string to a number? a) parseInt() https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseInt

Why is using let safer than var? let is block-scoped, meaning it's only accessible within the block it’s declared in. var is function-scoped and can lead to unexpected behavior due to hoisting. Using let prevents accidental redeclaration and scoping bugs. It helps make your code more predictable and clean. https://www.geeksforgeeks.org/difference-between-var-and-let-in-javascript/

What is the main benefit of separating JavaScript from HTML? Separating JavaScript improves code maintainability and readability. It allows HTML and JS to evolve independently. Promotes reusability and cleaner architecture. Improves performance with script caching. https://www.geeksforgeeks.org/how-to-link-an-external-javascript-file/

Why is Math.random() useful in games or UI effects? Math.random() helps generate unpredictable values. It adds variability to animations, colors, or game elements. Useful for dice rolls, enemy movement, or loot drops. Enhances user experience through randomness. https://www.geeksforgeeks.org/math-random-javascript/

What happens if two event listeners are attached to the same element? Both event listeners will execute when the event occurs. They run in the order they were added. Using addEventListener() allows multiple handlers. This promotes modular and reusable code. https://www.geeksforgeeks.org/javascript-addeventlistener-method/

Why should we use functions to organize code? Functions break code into reusable, logical blocks. They avoid repetition and simplify debugging. Improve code readability and structure. Allow easier testing and maintenance. https://www.geeksforgeeks.org/javascript-functions/