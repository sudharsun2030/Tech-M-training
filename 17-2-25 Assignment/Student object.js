const std={
    id:276,
    name:"Jessy Pinkman",
    department:"Chemistry",
    college:"Panimalar",
    email:"Jessy@gmail.com",
    displayDetails:function(){
        console.log(ID : ${this.id})
        console.log(Name : ${this.name})
        console.log(Dept : ${this.department})
        console.log(College : ${this.college})
        console.log(Email : ${this.email})},
    address:{
        doorno:7,
        street:"Kumar Nagar",
        area:"Alburquerque",
        pincode:148669
    },
    display2:function(){
        console.log(ID : ${this.id})
        console.log(Name : ${this.name})
        console.log(Dept : ${this.department})
        console.log(College : ${this.college})
        console.log(Email : ${this.email})
        console.log(Door No : ${this.address.doorno})
        console.log(Street : ${this.address.street})
        console.log(Area : ${this.address.area})
        console.log(Pincode : ${this.address.pincode})
    }
}
std.displayDetails();
std.func1=function(){
    console.log(`id : ${this.id} `)
    console.log(Name : ${this.name})
    console.log(Email : ${this.email})
}
std.func1()
std.display2()
Qno:5
