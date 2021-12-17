const ar=[];
var i=0;
function addFeedback(){
    var st=document.getElementById("feedback").value;
    ar.push(st);
    document.getElementById("feedback").value="";
    document.getElementById("result").innerHTML="<h2>"+"Feedback Details "+"</h2>"+"Successfully Added Feedback Details!";
    
}
function displayFeedback(){
      var h="";
      h+="<h2>"+"Feedback Details "+"</h2>";
      for(var j=0;j<ar.length;j++){
        h+="Feedback "+(j+1)+"<br>"+ar[j]+"<br>";
    }
    document.getElementById("result").innerHTML=h;
}