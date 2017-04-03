function createBackButton() {
	var backDiv = document.createElement('div');
	var faDiv = document.createElement('div');
	var faI = '<i class="fa fa-chevron-circle-left"></i>';
	backDiv.style.cssText = 'position:fixed;top:12px;left:12px;width:30px;height:30px;border-radius:100%;z-index:100000;background-color:#FFF; over-flow: hidden;';
	backDiv.addEventListener('touchstart', function(e){
    	texta_close();
    }, false)
	faDiv.style.cssText = 'font-size: 33px; line-height: 32px; text-align: center; margin-top: -1px; color: #888;';
	faDiv.innerHTML = faI;
	backDiv.appendChild(faDiv);
	document.getElementsByTagName('body')[0].appendChild(backDiv);
}

function loadStyleSheet(src){
    if (document.createStyleSheet) {
    	document.createStyleSheet(src);
    } else {
        var stylesheet = document.createElement('link');
        stylesheet.href = src;
        stylesheet.rel = 'stylesheet';
        stylesheet.type = 'text/css';
        document.getElementsByTagName('head')[0].appendChild(stylesheet);
    }
    createBackButton();
}

function texta_win() {
	window.location.href = "../win.html";
}

function texta_close() {
	window.location.href = "../blank.html";
}

loadStyleSheet('../../css/font-awesome.css');
