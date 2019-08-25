$(() => {
    renderCatTemplate();

    function renderCatTemplate() {
        console.log(window.cats);
        let source = $("#cat-template").html();
let template = Handlebars.compile(source);
for (cat of window.cats){
    let catHTML = template(cat);
    $("#allCats").append(catHTML);
}
        // TODO: Render cat template and attach events
    }
    $('button').on('click', (event) => {
        let targetBtn = $(event.target);
        let divInfo = targetBtn.next();
        let textBtn = targetBtn.text();

        if (textBtn.includes('Show')) {
            targetBtn.text(textBtn.replace('Show', 'Hide'))
        } else {
            targetBtn.text(textBtn.replace('Hide', 'Show'))
        }

        divInfo.toggle();
    })
});
