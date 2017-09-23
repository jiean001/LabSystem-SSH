window.onload = function () {
	
    $('#year').selectpicker({
        'selectedText': '2017'
    });

    // $('.selectpicker').selectpicker('hide');  
}
$(function () {
    $("ul li .leftbutton").each(function () {
        $(this).css("background-color", getRandomColor());
    });
})
function getRandomColor() {
    var c = '#';
    var cArray = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'];
    for (var i = 0; i < 6; i++) {
        var cIndex = Math.round(Math.random() * 15);
        c += cArray[cIndex];
    }
    return c;
}

