$(()=> {
    const app = Sammy('#container', function () {
        //init
        this.use('Handlebars', 'hbs');
        this.get('#/home', getWelcomePage);
        this.get('index.html', getWelcomePage);

        //Register
        this.post('#/register', (ctx) => {
            let username = ctx.params.username;
            let password = ctx.params.password;
            let repeatPass = ctx.params.repeatPass;
            if (!/^[A-Za-z]{3,}$/.test(username)) {
                notify.showError('Username should be at least 3 characters long and contain english letters')
            }//username REGEX
            else if (!/^[A-Za-z\d]{6,}$/.test(password)) {
                notify.showError('Password should be at least 6 characters long and contain letters and numbers')
            }//password REGEX
            else if (repeatPass !== password) {
                notify.showError("passwords should match");

            } else {
                auth.register(username, password).then((userData) => {
                    auth.saveSession(userData);
                    notify.showInfo('User successfully registerd');
                    getWelcomePage(ctx);
                }).catch(notify.handleError);
            }

        });
        //Login
        this.post('#/login', (ctx) => {
            let username = ctx.params.username;
            let password = ctx.params.password;
            auth.login(username, password).then((userData) => {
                auth.saveSession(userData);
                notify.showInfo('Login successful...');
                getWelcomePage(ctx);
            }).catch(notify.handleError)
        });

        //Logout
        this.get('#/logout', (ctx) => {
            auth.logout().then(() => {
                    sessionStorage.clear();
                    notify.showInfo("Logout successful...");
                    getWelcomePage(ctx);

                }
            ).catch(notify.handleError);

        });

this.get('#/catalog',(ctx)=>{
    if(!auth.isAuth()){ //We protect from unauthenticated users typung in url ..../#/catalog !!!
        ctx.redirect('#/home');

    }else{
        posts.getAllPosts()
            .then((posts)=>{
                posts.forEach((p,i)=>{
                    p.rank = i+1;
                    p.date = calcTime(p._kmd.ect);
                    p.isAuthor =  p._acl.creator === sessionStorage.getItem('userId'); //This is for edit delete section we use #if in the template

                });

                ctx.isAuth = auth.isAuth();
                ctx.username = sessionStorage.getItem('username');
                ctx.posts = posts;

                ctx.loadPartials({
                    header: './templates/common/header.hbs',
                    footer: './templates/common/footer.hbs',
                    navigation: './templates/common/navigation.hbs',
                    postList: './templates/posts/postsList.hbs',
                    post: './templates/posts/post.hbs'
                    }

                ).then(function () {
                    this.partial('./templates/posts/catalogPage.hbs');
                });

            }).catch(notify.handleError);

    }
});

this.get('#/create/post', (ctx)=>{
    if(!auth.isAuth()){ //We protect from unauthenticated users typung in url ..../#/catalog !!!
        ctx.redirect('#/home');

    }else{
        ctx.isAuth = auth.isAuth();
        ctx.username = sessionStorage.getItem('username');
        ctx.loadPartials({
            header: './templates/common/header.hbs',
            footer: './templates/common/footer.hbs',
            navigation: './templates/common/navigation.hbs',

        }).then(function () {
            this.partial('./templates/posts/createPostPage.hbs');
        })
    }
});
this.post('#/create/post',(ctx)=>{
    let author = sessionStorage.getItem('username');
    let url = ctx.params.url;
    let imageUrl = ctx.params.imageUrl;
    let title = ctx.params.title;
    let description  = ctx.params.description;
    if(title ===''){
        notify.showError('Title is required...');

    }else if (url ===''){
        notify.showError('Url is required...');

    }else if(!url.startsWith('http')){
        notify.showError('Url must be valid link');

    }else{
        posts.createPost(author,title,description,url,imageUrl).then(()=>{
            notify.showInfo('Post created...');
            ctx.redirect('#/catalog')
        }).catch(notify.handleError);

    }
});

this.get('#/edit/post/:postId',(ctx)=>{
    if(!auth.isAuth()){ //We protect from unauthenticated users typung in url ..../#/catalog !!!
        ctx.redirect('#/home');

    }else{
     let postId = ctx.params.postId;
     posts.getPostsByID(postId).then((post)=>{
         ctx.isAuth = auth.isAuth();
         ctx.username = sessionStorage.getItem('username');
         ctx.post = post;
         ctx.loadPartials({
             header: './templates/common/header.hbs',
             footer: './templates/common/footer.hbs',
             navigation: './templates/common/navigation.hbs',

         }).then(function () {
             this.partial('./templates/posts/editPostPage.hbs');
         });
     });


    }
});
this.post('#/edit/post',(ctx)=>{
    let postId = ctx.params.postId;
    let author = sessionStorage.getItem('username');
    let url = ctx.params.url;
    let imageUrl = ctx.params.imageUrl;
    let title = ctx.params.title;
    let description  = ctx.params.description;
    if(title ===''){
        notify.showError('Title is required...');

    }else if (url ===''){
        notify.showError('Url is required...');

    }else if(!url.startsWith('http')){
        notify.showError('Url must be valid link');

    }else{
        posts.editPost(postId,author,title,description,url,imageUrl).then(()=>{
            notify.showInfo(`Post ${title} edited...`);
            ctx.redirect('#/catalog')
        }).catch(notify.handleError);

    }
});
this.get('#/delete/post/:postId',(ctx)=>{
    let postId = ctx.params.postId;
    posts.deletePost(postId).then(()=>{
    notify.showInfo(`Post ${ctx.params.title} deleted..`);
    ctx.redirect('#/catalog')
}).catch(notify.handleError);

});
this.get('#/posts', (ctx)=>{
    if(!auth.isAuth()){ //We protect from unauthenticated users typung in url ..../#/catalog !!!
        ctx.redirect('#/home');

    }else{
        posts.getMyPosts(sessionStorage.getItem('username')).then((posts)=>{
            posts.forEach((p,i)=>{
                p.rank = i+1;
                p.date = calcTime(p._kmd.ect);
                p.isAuthor =  p._acl.creator === sessionStorage.getItem('userId'); //This is for edit delete section we use #if in the template
                ctx.posts = posts;
                ctx.loadPartials({
                        header: './templates/common/header.hbs',
                        footer: './templates/common/footer.hbs',
                        navigation: './templates/common/navigation.hbs',
                        postList: './templates/posts/postsList.hbs',
                        post: './templates/posts/post.hbs'
                    }

                ).then(function () {
                    this.partial('./templates/posts/catalogPage.hbs');
                });
            });

        }).catch(notify.handleError);
    }
});

this.get('#/details/:postId',(ctx)=>{
    let postId = ctx.params.postId;
    const postPromise = posts.getPostsByID(postId);
    const  allCommentsPromise = comments.getPostComments(postId);
    Promise.all([postPromise,allCommentsPromise])
        .then(([post,comments])=>{
          console.log([post ,comments]);
          post.date = calcTime(post._kmd.ect);
          post.isAuthor = post._acl.creator===sessionStorage.getItem('userId');
          comments.forEach((c)=>{
              c.date = calcTime(c._kmd.ect);
              c.commentAuthor = c._acl.creator === sessionStorage.getItem('userId');
          });
          ctx.url = post.url;
          ctx.imageUrl = post.imageUrl;
          ctx.isAuth = auth.isAuth();

          ctx.username = sessionStorage.getItem('username');
          ctx.post = post;
          ctx.comments = comments;
            ctx.loadPartials({
                header: './templates/common/header.hbs',
                footer: './templates/common/footer.hbs',
                navigation: './templates/common/navigation.hbs',
                comment: './templates/details/comment.hbs',
                postDetails:'./templates/details/postDetails.hbs'


            }).then(function () {
                this.partial('./templates/details/postDetailsPage.hbs');

            })
            }).catch(notify.handleError);
});

this.post('#/create/comment',(ctx)=>{
    let author = sessionStorage.getItem('username');
    let content = ctx.params.content;
    let postId = ctx.params.postId;
    if(content===''){
        notify.showError('cannot add comment...');

    }else{
   comments.createComment(postId,content,author).then(()=>{
       notify.showInfo('Comment created...');
       ctx.redirect(`#/details/${postId}`);
   }).catch(notify.handleError);
    }
});
this.get('#/delete/comment/:commentId/post/:postId',(ctx)=>{
   let commentId = ctx.params.commentId;
   let postId = ctx.params.postId;
   comments.deleteComment(commentId).then(()=>{
       notify.showInfo('Comment deleted.');
       ctx.redirect(`#/details/${postId}`);
   }).catch(notify.handleError);


});

        //Redirect to home
        function getWelcomePage(ctx) {
            if (!auth.isAuth()) {

                ctx.loadPartials({
                    header: './templates/common/header.hbs',
                    footer: './templates/common/footer.hbs',
                    loginForm: './templates/forms/loginForm.hbs',
                    registerForm: './templates/forms/registerForm.hbs'
                }).then(function () {
                    this.partial('./templates/welcome-anonymous.hbs')

                });
                ctx.redirect('#/home');
            } else {
                ctx.redirect('#/catalog');
            }

        }
        //Auxiliary functions
        function calcTime(dateIsoFormat) {
            let diff = new Date - (new Date(dateIsoFormat));
            diff = Math.floor(diff / 60000);
            if (diff < 1) return 'less than a minute';
            if (diff < 60) return diff + ' minute' + pluralize(diff);
            diff = Math.floor(diff / 60);
            if (diff < 24) return diff + ' hour' + pluralize(diff);
            diff = Math.floor(diff / 24);
            if (diff < 30) return diff + ' day' + pluralize(diff);
            diff = Math.floor(diff / 30);
            if (diff < 12) return diff + ' month' + pluralize(diff);
            diff = Math.floor(diff / 12);
            return diff + ' year' + pluralize(diff);

            function pluralize(value) {
                if (value !== 1) return 's'; else return '';
            }
        }

    });




    app.run();
});
