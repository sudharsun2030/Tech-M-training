function sumofdigits(a){
   A=a+""
   let res=0
   for(let i=0;i<A.length;i++){
       res+=parseInt(A[i])
   }
   if(res%2==0){
       return "Even"
   }
   else
   return "Odd"
}
console.log(sumofdigits(1234))
Qno:3