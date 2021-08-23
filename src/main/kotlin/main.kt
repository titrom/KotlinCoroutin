import kotlinx.coroutines.*


fun main(args: Array<String>) = runBlocking {

    val result = async {
        var  sum = 0
        for (i in 0..100){
            sum += i
            delay(10)
        }
        sum
    }
    println(result)
    println(result.await())

    /*val job = launch(Dispatchers.IO) {
    for (i in 1..1000){
        println("$i ball")
        delay(100)
    }
}
delay(3000)
job.cancel()
val job1 = launch {
    for (i in 1..1000){
        println("$i ghost")
        delay(1)
    }
}*/
}