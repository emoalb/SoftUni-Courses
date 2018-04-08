

function attachEvents() {
    $("#linkRegister").on("click",showRegisterView);
    $("#buttonRegisterUser").on("click", registerUser);


    $("#linkLogin").on('click', showLoginView);
    $("#buttonLoginUser").on('click', loginUser);



    $("#linkLogout").on('click', logoutUser);


    $("#linkHome").on('click', showHomeView);

    $("#linkListAds").on('click', listAds);
    $("#linkCreateAd").on('click', showCreateAdView);
    $("#buttonCreateAd").on('click',createAdd);


    $("#buttonEditAd").on('click',editAdd);

    $("#infoBox, #errorBox").on('click', function() {
        $(this).fadeOut()
    });

}