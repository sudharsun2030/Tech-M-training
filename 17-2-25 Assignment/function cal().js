const cal=()=>{
    var op=prompt("Enter the operation to be performed:")
    var n1=parseInt(prompt("Enter the 1st num:"))
    var n2=parseInt(prompt("Enter the 2nd num:"))
    switch(op){
        case "add":
            var sum=function(a,b){
            return a+b;}
            console.log(Sum:${sum(n1,n2)})
            break
        case "subtract":
            var dif=function(a,b){
            return a-b;}
            console.log(Difference:${dif(n1,n2)})
            break
        case "product":
            var prd=function(a,b){
            return a*b;}
            console.log(Product:${prd(n1,n2)})
            break
        case "division":
            var dvd=function(a,b){
            return a/b;}
            console.log(Division:${dvd(n1,n2)})
            break
            
    }
}
cal()
Qno 4