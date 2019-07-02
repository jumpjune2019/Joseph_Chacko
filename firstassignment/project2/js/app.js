$.ready(function () {
	// $.get('title').innerHTML = $.string.format("Quiz Game {0}", $.getVersion());
});


var controlButtonCurVal = "";

var myJsonObj = null;
var indexArr = [];
var correctAnswers = 0;

function oncontrolButtonClick() {
	console.log("someone clicked me");

//Triggering Page Data on Button Click

	if (controlButtonCurVal === "" || controlButtonCurVal === "Play") {
		loadQuizData();
		console.log("After loadQuizData");
		controlButtonCurVal = "End Game";
		timer();
	}
	else if (controlButtonCurVal === "End Game") {
		controlButtonCurVal = "Show Results";
		clearTimeout(t);
	}
	else if (controlButtonCurVal === "Show Results") {
		validateResults();
		resetAll(1);
		controlButtonCurVal = "Play Again";
	}
	else if (controlButtonCurVal === "Play Again") {
		controlButtonCurVal = "End Game";
		init();
		resetAll(2);
		loadQuizData();
		timer();
		
	}
	document.getElementById("controlButton").innerText = controlButtonCurVal;
}


//Timer Control
//https://jsfiddle.net/Daniel_Hug/pvk6p/

var timerDisp = document.getElementById("elapsedTime"),
	seconds = 0, minutes = 0, hours = 0,
	t;

function add() {
	seconds++;
	if (seconds >= 60) {
		seconds = 0;
		minutes++;
		if (minutes >= 60) {
			minutes = 0;
			hours++;
		}
	}
	var temp = (hours ? (hours > 9 ? hours : "0" + hours) : "00") + ":" + (minutes ? (minutes > 9 ? minutes : "0" + minutes) : "00") + ":" + (seconds > 9 ? seconds : "0" + seconds);
	document.getElementById("elapsedTime").innerText = temp;

	timer();
}
function timer() {
	t = setTimeout(add, 1000);
}

//Loading Quiz data from json File.

function loadQuizData() {
	console.log("In loadQuizData");
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.onreadystatechange = function () {
		if (this.readyState == 4 && this.status == 200) {
			myJsonObj = JSON.parse(this.responseText);
			console.log("test2 " + myJsonObj);
			console.log("test2 " + myJsonObj);
			console.log("test1 " + myJsonObj.quiz);
			console.log(myJsonObj.quiz[0]);

			var i = 0;
			var myModObj = [];

			while (myModObj.length < 5) {
				var randInd = Math.floor(Math.random() * 10);
				while (!arrayHasValue(randInd)) {
					randInd = Math.floor(Math.random() * 10);
				}
				console.log("myJsonObj.quiz[randInd].question " + myJsonObj.quiz[randInd].question);
				console.log(document.getElementById('termWidget' + i));
				//document.getElementById('termWidget' + i).nodeValue = myJsonObj.quiz[randInd].question;
				//var termsEl = document.createElement("div").id=termWidget+i;
				          // Create a <li> node
				    // Create a text node
				//node.appendChild(textnode); 
				//document.getElementById('termsContainer').appendChild(termsEl);
				document.getElementById('definitionTextVal' + i).innerText = myJsonObj.quiz[randInd].answer;
				document.getElementById('termWidget' + i).innerText = myJsonObj.quiz[randInd].question;

				myModObj.push(myJsonObj.quiz[randInd]);

				i = i + 1;
			}

		}
	};
	xmlhttp.open("GET", "questions.json", true);
	xmlhttp.send();


}

function arrayHasValue(index) {

	for (var i = 0; i < indexArr.length; i++) {
		if (indexArr[i] === index)
			return false;
	}
	indexArr.push(index);
	return true;
}

//Evaluating the number of correct answers

function validateResults() {
	console.log("In validateResults");

	console.log("correctAnswersbef " + correctAnswers);
	console.log("myObj len is " + myJsonObj.length);
	for (var i = 0; i < myJsonObj.quiz.length; i++) {
		for (var j = 0; j < 5; j++) {
			console.log("i and j are  " + i + "  " + j);
			console.log("comparing " + myJsonObj.quiz[i].question + "  " + document.getElementById('droppedTerm' + j).innerText);
			console.log("comparing " + myJsonObj.quiz[i].answer + "  " + document.getElementById('definitionTextVal' + j).innerText);
			if (myJsonObj.quiz[i].question === document.getElementById('droppedTerm' + j).innerText &&
				myJsonObj.quiz[i].answer === document.getElementById('definitionTextVal' + j).innerText) {
				correctAnswers = correctAnswers + 1;
				console.log("correctAnswers " + correctAnswers);
			}
		}

	}
	console.log("correctAnswersaft " + correctAnswers);
	if (correctAnswers === 5) {
		document.getElementById('results').innerText = "Perfect Score!";
	}
	else if (correctAnswers === 0 || correctAnswers === 2 || correctAnswers === 4) {
		document.getElementById('results').innerText = "you have " + correctAnswers + "correct answers";
	}
	else {
		document.getElementById('results').innerText = "you have " + correctAnswers + "correct answer";
	}
}


function resetAll(mode) {
	if(mode == 1){
	
	document.getElementById("elapsedTime").innerText = "00:00:00";
	seconds = 0; minutes = 0; hours = 0;

	for (var i = 0; i < 5; i++) {
		document.getElementById('termWidget' + i).innerText = "";
		document.getElementById('definitionTextVal' + i).innerText = "";
		document.getElementById('droppedTerm' + i).innerText ="";
	}
	indexArr = [];
	myJsonObj = null;
	
	}
	else{
		document.getElementById('results').innerText = "";
		correctAnswers = 0;
	}
	
}



/*function init() {

}*/


//Drag and Drop Functionality in the Quiz.

function dragstart(ev) {
	console.log("drag12324 " + ev);
	ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
	console.log("drop 12312312" + ev);
	ev.preventDefault();
	var data = ev.dataTransfer.getData("text");
	var cln = 	document.getElementById(data).cloneNode(true);

	ev.target.appendChild(cln);
	document.getElementById(data).innerText = "";
}

function drop_handler(ev) {
	console.log("Drop");
	ev.currentTarget.style.background = "lightyellow";

	ev.preventDefault();
	var data = ev.dataTransfer.getData("text");
	ev.target.appendChild(document.getElementById(data));
}

function dragover(ev) {
	console.log("dragOver");
	ev.preventDefault();
   }
   