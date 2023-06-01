// 방향키로 움직이기
var playerWidth = 20;
var playerHeight = 20;
var x = 0;
var y = 0;

var enermyWidth = 20;
var enermyHeight = 20;

var eX = 7;
var eY = 10;

var mainFrameRate = 500;  // 1000 = 1초

// 자동으로 찾아가서 만나면 게임오바되게
// 1. 일단 파랑이를 잡아라! 최적경로 아님. 자동으로만 가면 됨 (autogame.js로 여기까지 완성)
// 2. 내가 도망가면 쫓아오게해라 (방향은 랜덤으로한다/ 대각선 금지) => 과제
window.onload = function() {

    gCanvas = document.getElementById('main_cvs');
    gCtx = gCanvas.getContext('2d');

    gCtx.fillStyle = "yellow";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    gCtx.fillStyle = "blue";
    gCtx.fillRect(playerWidth*eX, playerHeight*eY, playerWidth, playerHeight);

    gMainIntv = setInterval(move, mainFrameRate);

}

function move() {
    gCtx.fillStyle = "black";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    if (x < eX)
        x = x + 1;
    if (y < eY)
        y = y + 1;
    console.log("call move");

    gCtx.fillStyle = "yellow";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    if (x == eX && y == eY){
        alert('만났다');
        clearInterval(gMainIntv); // clearInterval을 해야 alert이 한번뜸 
    }
}

window.onkeydown = function(e) {

    // console.log('Key down = ' + e.keyCode);
    // up: 38, down: 40, right: 39, left: 37

    gCtx.fillStyle = "black";
    gCtx.fillRect(playerWidth*x, playerHeight*y, playerWidth, playerHeight);

    switch(e.keyCode) {
        case 38: //up
            if ( y > 0)
                y = y -1;
            break;
        case 40: //down
            if( y < 15)
                y = y + 1;
            break;
        case 39: //right
            if( x < 15)
                x = x + 1;
            break;
        case 37: //left
            if(x > 0)
                x = x - 1;
            break;
        default:
            break;
    }

    // if (x == eX && y == eY){
    //     alert('Game Over');
    // }

    move();
}