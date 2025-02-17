var day=prompt("Enter the day:")
day.toLowerCase()
switch(day){
    case "monday":
        console.log("Its the start ofthe week!")
        break
    case "tuesday" || "wednesday" || "thursday":
        console.log("Middle of the week")
        break
    case "friday":
        console.log("Last working day of the week")
        break
    case "saturday" || "sunday":
        console.log("Its weekend")
    default:
    console.log("invalid Input")
}
