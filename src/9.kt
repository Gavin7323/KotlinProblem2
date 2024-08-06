fun main(){
    compare(31, 24)
}

fun compare(timeSpentToday: Int, timeSpentYesterday: Int) : Boolean{
    if (timeSpentToday > timeSpentYesterday){
        return true
    } else{
        return false
    }
}

