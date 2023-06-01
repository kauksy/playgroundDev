// 자동으로 움직이기
var playerWidth = 20;
var playerHeight = 20;
var x = 0;
var y = 0;

var mainFrameRate = 500;  // 1000 = 1초

window.onload = function() {

    gCanvas = document.getElementById('main_cvs');
    gCtx = gCanvas.getContext('2d');

    gCtx.fillStyle = "yellow";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    gMainIntv = setInterval(move, mainFrameRate);

}

function move() {

    gCtx.fillStyle = "black";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    if (x < 15)
        x = x + 1;
    if (y < 15)
        y = y + 1;
    console.log("call move");

    gCtx.fillStyle = "yellow";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);
}