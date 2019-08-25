
$(() => {
    const app = Sammy('#main', function () {
        let appCtx = this;
        appCtx.use('Handlebars', 'hbs');

        appCtx.get('#/home', homeController.loadHome);



        appCtx.get('#/about', homeController.loadAbout);

        appCtx.get('#/login', accountController.loadLogInPage);
        appCtx.post('#/login',accountController.loginUser);

        appCtx.get('#/register', accountController.loadRegisterPage);
        appCtx.post('#/register',accountController.registerUser);
        appCtx.get('#/catalog',teamsController.loadCatalog);
    appCtx.get('#/catalog/:id',teamsController.loadTeamDetails);

        appCtx.get('#/logout', accountController.logout);


        this.get('#/join/:id',teamsController.join);

        });




    app.run();
})


