
fun main(){

  
}

/*
Дан список интов, повторяющихся элементов в списке нет. 
Нужно преобразовать это множество в строку, сворачивая соседние по числовому ряду числа в диапазоны. Примеры:
[1,4,5,2,3,9,8,11,0] => »0–5,8–9,11»
[1,4,3,2] => »1–4»
[1,4] => »1,4»
*/

fun IntArray.compress() {
    var arr = this.sorted()   
    var flag = false
    var resulr : String = arr[0].toString()
        for(j in 1 until arr.size){
            if(equals(arr[j - 1] , arr[j])){
                flag = true
            }else {
                if(!flag){
                    flag = true
                    resulr += ",${arr[j]}"
                 }else {
                    resulr += "-${arr[j-1]},${arr[j]}"
                    flag = false
                  } 
                }
            }  
println(resulr)
}

fun equals(mLeft : Int, mRight: Int): Boolean = ((mLeft - mRight) == -1)



/*-------------------------------------------------------------------------------- */

/*
Даны два массива: [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2]
Надо вернуть [1, 2, 2, 3] (порядок неважен)
Фактически нам нужно вернуть пересечение множеств, но с повторением элементов. 

*/
fun intersectionOfMany(){
    val s1 = listOf(0, 1, 2, 2, 3).sorted()
    val s2 = listOf(1, 2, 2, 3, 5, 7).sorted()
    var group  = mutableListOf<Int>()
    for(i in 0 until s1.size){
        for(j in 0 until s2.size){
            if(s1[i] == s2[j]){
                group.add(s2[j])
                break
            }
        }
    }
    
println(group)

}

/*-------------------------------------------------------------------------------- */

//Сортировка пузырьком под капотом
fun bubbleSort(arr : MutableList<Int>){

    for(i in 0 until arr.size){
        for(j in 0 until arr.size){
            if(arr[i] < arr[j] ){
                val m  = arr[i]
                arr[i] = arr[j]
                arr[j ] = m
            }else{
                continue
            }    
        }

    }
    println(arr)
    }

/* -------------------------------------------------------------------------------------- */
/*
Дана строка (возможно, пустая), состоящая из букв A-Z: AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB
Нужно написать функцию RLE, которая на выходе даст строку вида: A4B3C2XYZD4E3F3A6B28
И сгенерирует ошибку, если на вход пришла невалидная строка.
Пояснения: Если символ встречается 1 раз, он остается без изменений; 
Если символ повторяется более 1 раза, к нему добавляется количество повторений.
*/

    fun encodeRLE() {
        var str = "AAAABBBCCXYZDDDDEEEFFFAAAAAAbbbbbbbbbbbbbbbbbbbbb"
        var result = StringBuilder()
        val n = str.length
        var i = 0
        while (i < n) {
            // Подсчет вхождений текущего символа
            var count = 1
            while (i < n - 1 && str[i] == str[i + 1]) {
                count++
                i++
            }
          // Печатаем символ и его количество
            if(count in 0..2){
                result.append(str[i])
            }else{
                result.append(str[i]).append(count)
            }
            i++
        }
        println(result)
    }


/*--------------------------------------------------------------------------------------- */

    fun maxValue(){
        val arr = intArrayOf( 3, 5, 6, 1, 2,)
        var max = Integer.MIN_VALUE
        //Идём по массиву с лева на право
         for (result in arr) {
        //на каждой итерации проверяем текушее значение и предыдущее 
        //где предыдущее значение храним в не цикла и по умолчанию оно равно 0.
        //если на какой либо итарации текущее значение больше предыдущего максимума 
        // то перезаписываем предыдущее значение которое находится в не цикла .
        // и так до конца массива. Сложность N.
             if(result > max){
                 max = result
                 continue
             }
            
         }
 
         println(max) 
     }

/*--------------------------------------------------------------------------------------- */

     fun mainN(){
        val n = 20
           for (i in 2..n) {
        
               if (resultN(i)){
                    println(i)
               }
                
        }
         
    }
        

        //Алгоритм вложенного цикла
            fun  resultN(n : Int) : Boolean{
                //вводим N 
                //Переменная sum по умолчанию равна 0, в ней храним число делителей 
                var sum = 0
                // пробегаем по числам от 2 до текущего N
                for (j in 2..n) {
                    //Делим без остатка число N на индекс , если делится то увеличиваем sum++
                    if(n % j == 0){
                        sum++
                        // Если сумма оказалась больше 1 — цикл можно прервать
                        if(sum > 1){
                            break
                        }
                    }
                    
                }
                 // Возвращаем результат сравнивая переменную sum с числом 1 (true || false)    
            return sum == 1
            }
        