
$(document).ready(function() {

    $("#boton1").click(function(){
        $("*").hide();
    });

    $("#boton2").click(function() {
        $("img").toggle();
    })

    $("#boton3").click(function() {
        $("img").hide();
    })

    $("#boton4").click(function() {
        $("img").show();
    })

    $("#boton5").click(function() {
        $("img").fadeIn();
        $("img").fadeIn("slow");
        $("img").fadeIn(5000);
    })

    $("#boton6").click(function() {
        $("img").fadeOut();
        $("img").fadeOut("slow");
        $("img").fadeOut(5000);
    })

    $("#boton7").click(function() {
        $("img").fadeToggle();
        $("img").fadeToggle("slow");
        $("img").fadeToggle(5000);
    })

    $("#boton8").click(function() {
        $("img").slideDown();
    })

    $("#boton9").click(function() {
        $("img").slideUp();
    })

    $("#boton10").click(function() {
        $("img").slideToggle();
    })

    $("#boton11").click(function() {
        $("img").animate({ marginLeft : '100%'});
    })

    $("#boton12").click(function() {
        $("img").animate({ width: '100%' });
    })

    $("#boton13").click(function() {
        $("img").animate(
        {
            opacity: '0.5',
            width: '100%'
        }
        );
    })

    $("#boton14").click(function() {
        $("img").animate({
            height: 'toggle'
        });
    })

});


