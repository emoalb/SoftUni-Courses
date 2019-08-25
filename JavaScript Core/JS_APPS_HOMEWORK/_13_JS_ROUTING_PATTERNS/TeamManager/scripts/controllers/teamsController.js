let teamsController = (()=>{

    function loadCatalog(ctx) {
        ctx.loggedIn = auth.isAuthenticated();
        ctx.username = auth.getUserName();
        teamsService.loadTeams().then((userdata)=>
        {
            ctx.teams =  userdata.map(e=>{
                return{
                    _id:e._id,
                    name: e.name,
                    comment: e.description
                }
            });
            ctx.loadPartials({
                header: 'templates/common/header.hbs',
                team:   'TeamManager/templates/catalog/team.hbs',  //No idea why this happens
                footer: 'templates/common/footer.hbs'


            }).then(function () {
                this.partial('TeamManager/templates/catalog/teamCatalog.hbs');

            });

        });

    }
   function loadTeamDetails(ctx){
       ctx.loggedIn = auth.isAuthenticated();
       ctx.username = auth.getUserName();
       let teamId =ctx.params.id.substring(1);

       teamsService.loadTeamDetails(teamId).then((details)=>
       {
           ctx.name = details.name;
           ctx.comment = details.comment;
           ctx.teamId  = details._id;
          ctx.members = details.members == null ?
              null:(JSON.parse(details.members)).map(e => {
             return {
              username: e
   };

       });

           this.loadPartials({
               header: 'templates/common/header.hbs',
               team:   'TeamManager/templates/catalog/team.hbs',  //No idea why this happens
               teamControls: 'TeamManager/templates/catalog/teamControls.hbs',
               teamMember: 'TeamManager/templates/catalog/teamMember.hbs',
               footer: 'templates/common/footer.hbs'


           }).then(function () {
               this.partial('TeamManager/templates/catalog/details.hbs');

           });
       });

   }
    function join (ctx) {
        let teamId = this.params.id.substr(1);
        teamsService.joinTeam(teamId)
            .then((data) => {
                auth.saveSession(data);
                auth.showInfo('TEAM HAS BEEN JOINED!');
                teamsController.loadCatalog(ctx);
            });

    }
    return{
    loadCatalog,
        loadTeamDetails,
        join
}
})();
