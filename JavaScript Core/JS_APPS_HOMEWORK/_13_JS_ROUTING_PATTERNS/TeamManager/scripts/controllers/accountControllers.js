accountController = (()=>{
    function loadLogInPage(ctx) {
        this.loadPartials({
            header: 'templates/common/header.hbs',
            footer: 'templates/common/footer.hbs',
            loginForm:'templates/login/loginForm.hbs'
        }).then(function () {
            this.partial('templates/login/loginPage.hbs');

        })


    }
    function logout(ctx) {
        auth.logout()
            .then(function () {
                sessionStorage.clear();
                auth.showInfo('Logged out!');
                ctx.redirect('/#/home');
            })

    }
    function loadRegisterPage() {
        this.loadPartials({
            header: 'templates/common/header.hbs',
            footer: 'templates/common/footer.hbs',
            registerForm:'templates/register/registerForm.hbs'
        }).then(function () {
            this.partial('templates/register/registerPage.hbs');

        });

    }

    function registerUser(ctx) {
        const  userName = ctx.params.username;
        const password =  ctx.params.password;
        const repeatPassword = ctx.params.repeatPassword;
        if(password===repeatPassword){

            auth.register(userName,password,repeatPassword).then(function (userData) {
                auth.saveSession(userData);
                auth.showInfo("You have registered successfully");
                ctx.redirect('/#/home');

            }) ;

        }

    }

    function loginUser(ctx) {
        const  userName = ctx.params.username;
        const password =  ctx.params.password;


        auth.login(userName,password).then(function (userData) {
            auth.saveSession(userData);
            auth.showInfo("You have logged in successfully");
            ctx.redirect('/#/home');

        }) ;


    }
   return{
   registerUser,
   loginUser,
   loadLogInPage,
   loadRegisterPage,logout
   }
})();
