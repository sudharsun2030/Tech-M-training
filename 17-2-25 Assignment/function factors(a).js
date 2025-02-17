function factors(a){
    let res=""
    for(let i=1;i<a;i++){
        if(a%i==0)
        res+=i+" "
    }
    return res
}
console.log(factors(6))
Qno:2