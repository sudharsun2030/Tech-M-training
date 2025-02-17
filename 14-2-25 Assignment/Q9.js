var yr=parseInt(prompt("Enter year:"))
var mon=parseInt(prompt("Enter month in number:"))
var res=0
if(yr%400==0){
    res=1
}    
else if(yr%4==0 && yr%100!=0){
    res=1
}
if(res==1 && mon==2){
    console.log("Year is leap year and month is feb ")
}
else if(res==1 && mon!=2){
    console.log("year is leap year and month is not feb")
}
else
console.log("Given year is not a leap year")
