console.log("Community Portal Started");

window.onload = () => {
    alert("Welcome to Community Portal");
};

// Constructor Function
function Event(name, category, seats) {
    this.name = name;
    this.category = category;
    this.seats = seats;
}

// Prototype
Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

// Array of Events
let events = [
    new Event("Music Fest", "Music", 10),
    new Event("Dance Show", "Music", 5),
    new Event("Baking Workshop", "Workshop", 8),
    new Event("Coding Workshop", "Workshop", 0)
];

// Closure
function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        console.log("Total Registrations:", count);
    };
}

const counter = registrationCounter();

// Display Events
function displayEvents(eventList) {

    const container =
        document.getElementById("eventContainer");

    container.innerHTML = "";

    eventList.forEach(event => {

        const card =
            document.createElement("div");

        card.className = "card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Category: ${event.category}</p>
            <p>Seats: ${event.seats}</p>

            <button onclick="registerUser('${event.name}')">
                Register
            </button>
        `;

        container.appendChild(card);
    });
}

// Register User
function registerUser(eventName) {

    try {

        let event =
            events.find(e => e.name === eventName);

        if(event.seats <= 0){
            throw new Error("No Seats Available");
        }

        event.seats--;

        counter();

        alert("Registered Successfully");

        displayEvents(events);

    }
    catch(error){
        alert(error.message);
    }
}

// Filter Events
document
.getElementById("categoryFilter")
.addEventListener("change", function(){

    let category = this.value;

    if(category === "All"){
        displayEvents(events);
        return;
    }

    let filtered =
        events.filter(e =>
            e.category === category
        );

    displayEvents(filtered);
});

// Search Event
document
.getElementById("searchBox")
.addEventListener("keyup", function(){

    let search =
        this.value.toLowerCase();

    let result =
        events.filter(event =>
            event.name
            .toLowerCase()
            .includes(search)
        );

    displayEvents(result);
});

// Form Validation
document
.getElementById("registerForm")
.addEventListener("submit", function(e){

    e.preventDefault();

    let name =
        document.getElementById("username").value;

    let email =
        document.getElementById("email").value;

    if(name === "" || email === ""){
        alert("Fill all fields");
        return;
    }

    alert("Form Submitted Successfully");
});

// ES6 Features
const portal = {
    title: "Community Portal",
    city: "Tanjore"
};

const {title, city} = portal;

console.log(title);
console.log(city);

const copiedEvents = [...events];

console.log(copiedEvents);

// Async/Await + Fetch API
async function loadUsers(){

    try{

        const response =
            await fetch(
                "https://jsonplaceholder.typicode.com/users"
            );

        const data =
            await response.json();

        console.log("Users Loaded");

        console.log(data);

    }
    catch(error){

        console.log(error);

    }
}

loadUsers();

// jQuery
$(document).ready(function(){

    $(".card").hide();

    setTimeout(function(){

        $(".card").fadeIn();

    },1000);

});

displayEvents(events);