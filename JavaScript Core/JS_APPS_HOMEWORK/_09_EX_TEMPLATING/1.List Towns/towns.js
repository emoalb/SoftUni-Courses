function createEvent() {
   let townsArr= $('#towns').val().split(", ");
   let towns = [];

    townsArr.forEach((town)=>towns.push({city:town}));

let source = $("#towns-template").html();
let template = Handlebars.compile(source);
let context = {towns:towns};
console.log(towns);
let liTown = template(context);
$("#root").append(liTown);
}

function attachEvents() {
    $('#btnLoadTowns').on('click',createEvent);
}