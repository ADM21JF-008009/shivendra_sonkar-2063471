function calculateEMI(){
    var per=document.getElementById("principalAmount").value;
    var r=document.getElementById("interestRate").value;
    var ten=document.getElementById("tenure").value;
    var R=(r/100)/12;
     var cal=per*R;
   var pe=Math.pow((1+R),ten);
   var e=Math.pow((1+R),ten)-1;
   var t=pe/e;
   cal=cal*t;
    document.getElementById("result").innerHTML="EMI is Rs."+cal.toFixed(2);
  return false;    
}