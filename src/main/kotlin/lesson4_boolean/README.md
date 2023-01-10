## УРОК 4: BOOLEAN – ЛОГИЧЕСКИЙ ТИП ДАННЫХ В KOTLIN. ОПЕРАТОРЫ СРАВНЕНИЯ.
Эта информация призвана разложить по полочкам значения терминов, связанных с логическим типом данных. 
Конкретно рассмотрим: логические операторы, операторы сравнения и присваивания.
Начнем с последнего. Раз и навсегда определим, что оператор присваивания,
как вы уже знаете – обозначается знаком равно. 
Он присваивает данные справа от знака равно данным слева.
А оператор “двойное равно” является оператором сравнения. 
Он сравнивает два значения между собой.
Все операторы сравнения языка Котлин:
`<, >, >=, <=, ==, !=`
Все, кроме последних двух используются в классической математике.
Оставшиеся это оператор сравнения (равенства) и неравенства значений.
Все эти операторы сравнивают между собой данные различных типов. 
Результатом сравнения всегда могут быть только два значения: истина (обозначается как true)
или ложь (обозначается как false). 
Такие операции еще называют “Операции отношения”.
И есть еще операторы ссылочного сравнения. 
О них поговорим отдельно, просто знайте, что они есть. 
Оператор ссылочного сравнения “равно” и “не равно” соответственно:
`===, !==`
Результат сравнения будет истиной, если обе сравниваемые переменные ссылаются на один объект и наоборот.
Следующие примеры наглядно покажут, как операторы могут возвращать результат сравнения.
Представим, что в вашем разрабатываемом приложении есть скрытый контент который доступен, 
только если пользователю исполнилось 18 лет. Пользователь вводит свой возраст и в определенном месте
ваша программа должна обработать введенное число и выдать положительный или отрицательный результат.
Добавим возрастной порог, с которым будем сравнивать возраст пользователя. 
Объявим переменную, которая будет константой. 
То есть ее значение не должно поменяться ни при каких обстоятельствах. 
Константы нельзя объявлять локально, поэтому вынесем ее за пределы метода. 
Также константы принято писать большими буквами, разделяя слова нижним подчеркиванием. 
Официально этот стиль написания называется UPPER CASE в сочетании со snake_case:<br>
`const val AGE_OF_MAJORITY = 18`<br>
Введенный пользователем возраст будет храниться в переменной `userAge`.<br>
Допустим, это будет 42 года:<br>
`val userAge = 42`<br>
Теперь будем сравнивать полученный возраст с блокирующим и сохранять результат сравнения в переменную `comparisonResult`.
Создадим эту переменную с явным указанием логического типа `Boolean`. 
Теперь в нее можно поместить одно из двух значений: `true` или `false`:<br>
`val comparisonResult: Boolean`<br>
Первый момент, который нужно отметить. 
Созданную переменную уже можно проинициализировать значением `true` или `false` и она будет его хранить.<br> 
Для демонстрации присвоим ей значение false и выведем значение переменной в консоль:
```
val comparisonResult: Boolean = false
println(comparisonResult)
```
Выведет `false`<br>
Зафиксировали.<br> 
Второй ключевой момент – в переменную можно положить результат сравнения какого-либо выражения
(простого или составного).<br> 
Именно этот кейс мы будем использовать в нашей программе по распознаванию возраста.<br> 
Начнем сравнивать возраст пользователя с константным возрастом:
```
val comparisonResult: Boolean
comparisonResult = userAge >= AGE_OF_MAJORITY
println(comparisonResult)
```
Выведет `true`
Да, 42 больше или равно, чем число 18.<br>
Поэтому нашему пользователю откроется страница со скрытым контентом.<br> 
Помним, что данные сначала сравниваются, затем результат присваивается переменной слева от знака равно.<br> 
Но давайте оформим результат более красиво, используя интерполяцию строк, о которых мы говорили ранее:<br>
`println("Результат проверки возраста пользователя: $comparisonResult")`<br>
Так гораздо лучше.<br> 
Если подставить в качестве возраста пользователя другие значения, изменится и результат, 
например, пусть это будет подросток 15 лет.<br> 
В консоли выведется результат сравнения `false`.<br>
Для пущей наглядности вот еще пара простейших примеров:
```
println(0 < -1) // false
println(1 == 1) // true
println(2 == 3) // false
println(7 != 8) // true
```
## Логические операторы в Kotlin
Идем дальше, рассмотрим логические операторы.<br> 
Они помогут нам создать составное выражение сравнения, когда нужно сравнивать несколько условий одновременно.<br>
Логические операторы выглядят и произносятся так: ‘и’, ‘или’, ‘не’<br>
`&&, ||, !`
Чтобы понять, как их использовать, давайте дополним бизнес требования к нашей программе.<br> 
От них будем отталкиваться.<br> 
Представим, что скрытый контент доступен пользователям от 18 лет (это мы уже реализовали)
и пользователям до 65 лет, например.<br>
То есть будет промежуток от 18 до 65.<br> 
Это означает, что у нас появляется уже два условия, которые нужно проверять.<br> 
Что возраст больше или равен 18 и меньше или равен 65.<br>
Добавим новую необходимую для работы константу и напишем это:
```
const val RETIREMENT_AGE = 65
comparisonResult = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
```
Здесь мы используем логический оператор `&&`. 
Он гарантирует, что результат будет формироваться исходя из двух сравнений.<br> 
Если одно из сравнений вернет `false`, то конечный результат comparisonResult будет `false`.<br> 
И еще момент.<br> 
Здесь я не занес операции отношения в круглые скобки, потому что это не обязательно
(это связано с приоритетами выполнения операций).<br> 
Но рекомендую ставить такие скобки для повышения читабельности в более сложных составных выражениях.<br> 
Кроме того, скобки обязательны, если вы хотите использовать инфиксные функции `and` или `or`, 
вместо символов ‘И’ и ‘ИЛИ’.<br>
Не будем заострять на них внимание сейчас, но выглядит это вот так:<br>
`comparisonResult = (userAge >= AGE_OF_MAJORITY) and (userAge <= RETIREMENT_AGE)`<br>
Далее. Оператор `||` позволяет также делать комбинированные условия.<br> 
В этом случае `comparisonResult` будет `true`, если хотя бы одно из сравнений вернет `true`.<br> 
Первое или второе. Если возраст больше или равен совершеннолетию, или если возраст равен или менее пенсионного возраста:<br>
`comparisonResult = (userAge >= AGE_OF_MAJORITY) || (userAge <= RETIREMENT_AGE)`<br>
Хорошо, далее. Логический оператор отрицания.<br> 
Если поставить его перед Boolean-переменной
или перед выражением в скобках – он инвертирует значение с `true` на `false` и наоборот.<br>
Вот простой пример для переменных. Объявили Boolean-переменную `a` и присвоили ей `true`.<br> 
Объявили переменную `b` и присвоили ей переменную a, с отрицанием.<br> 
Таким образом в переменную `b` записался результат `false`:
```
val a = true
val b = !a
println(b)
```
Чтобы показать на примере нашего выражения, модернизируем его следующим образом.<br> 
Добавим отрицание перед вторым сравнением и изменим знак на “больше или равно”:<br>
`comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)`<br>
Звучит полностью это так:<br> 
Конечный результат будет `true`, если возраст пользователя больше или равен совершеннолетию и, 
если возраст пользователя НЕ больше или равен пенсионному возрасту.<br>
Наконец хотел бы приоткрыть ширму изящных сокращений в языке Котлин.<br> 
Текущее выражение сравнения – это ничто иное, как диапазон допустимых чисел между 18 и 65.<br>
Мы можем написать так, практически дословно:<br>
`comparisonResult = userAge in BLOCKING_AGE..PENSIA_AGE`<br>
И звучит это следующим образом: результат будет `true`, когда `userAge` находится в `in` промежутке от 18 до 65.<br> 
А если мы поставим перед `in` знак отрицания – то будет означать, что выражение также вернет `true`, 
если число находится ВНЕ заданного диапазона:<br>
`comparisonResult = userAge !in BLOCKING_AGE..PENSIA_AGE`<br>
## Тест
Вопрос 1<br>
В чем разница между операторами “=” и “==” ?<br>
1️⃣ Разницы нет, это один и тот же оператор<br>
2️⃣ Оператор “=” – это оператор проверки на равенство, а оператор “==” – оператор сравнения на ссылочное равенство<br>
3️⃣ Оператор “=” – это оператор присваивания, а оператор “==” – оператор равенства<br>
4️⃣ Оператор “==” – это оператор равенства, а оператор “==” – оператор присваивания<br>
Ответ 3:<br>
Оператор “=” – это оператор присваивания, он присваивает переменной слева от “=” значение справа от “=”.<br>
Оператор “==” – это оператор проверки на равенство по значению, он сравнивает равны ли значения в двух переменных.<br>
----
Вопрос 2<br>
Какая переменная соответствует стилю написания, принятому для констант?<br>
1️⃣ ageOfMajority<br>
2️⃣ age_of_majority<br>
3️⃣ AGEOFMAJORITY<br>
4️⃣ AGE_OF_MAJORITY<br>
Ответ 4:<br>
Названия констант в Kotlin принято записывать используя сочетание стилей upper case и snake case,
то есть слова пишутся большими буквами, а разделяет слова нижнее подчеркивание.<br>
----
Вопрос 3<br>
Какой вариант инициализации константы правильный?<br>
1️⃣ 
```
fun main() {
const val AGE_OF_MAJORITY = 18
}
```
2️⃣
`const val AGE_OF_MAJORITY = 18`<br>
3️⃣ 
```
fun main() {
val AGE_OF_MAJORITY = 18
}
```
4️⃣
`val AGE_OF_MAJORITY = 18`<br>
Ответ 2:
Константы в Kotlin можно объявлять только вне классов и функций, они объявляются при помощи ключевого слова `const`.
----
Вопрос 4<br>
Какого варианта инициализации Boolean переменной нет в Kotlin?<br>
1️⃣ var b = 1 = 1<br>
2️⃣ var b: Boolean = 1 &gt; 2<br>
3️⃣ var b = false<br>
4️⃣ var b: Boolean = true && false<br>
Ответ 1:
В варианте 1 используется не оператор проверки на равенство, а оператор присваивания.
----
Вопрос 5<br>
Какого логического оператора нет в Kotlin?<br>
1️⃣ &&<br>
2️⃣ =&gt;<br>
3️⃣ !<br>
4️⃣ ||<br>
Ответ 3:<br>
Оператора `=&gt;` (следствие) нет в Kotlin. Даже среди операторов сравнения его нет,
“больше или равно” обозначается оператором `&gt;=`.
---
Вопрос 6<br>   
Какой тип данных возвращают логические операторы?<br>
1️⃣ Int<br>
2️⃣ Char<br>
3️⃣ Short<br>
4️⃣ Boolean<br>
Ответ 4:<br>
Логические операторы возвращают логический тип данных, то есть `Boolean`.
---
Вопрос 7<br>
Для чего из перечисленных вариантов можно использовать логические операторы в Kotlin?<br>
1️⃣ Чтобы сравнивать переменные Boolean<br>
2️⃣ Чтобы проводить побитовые операции над числами<br>
3️⃣ Чтобы создавать составные выражения с операторами сравнения (с несколькими условиями)<br>
4️⃣ Чтобы складывать переменные Boolean<br>
Ответ 1:<br>
Логические оператора нельзя использовать для сравнения переменных Boolean, 
их можно только сравнить на равенство оператором “==”.<br>
Для побитовых операций над числами в Kotlin есть свои операторы.<br>
Переменные Boolean нельзя складывать.<br>
А вот создать составное выражения по типу 1 &lt; a && a &lt; 5 можно спокойно.
---
Вопрос 8<br>
Какой вариант написания неправильный?<br>
1️⃣ val b = (1 &lt; a) && (a &lt; 5)<br>
2️⃣ val b = 1 &lt; a && a &lt; 5<br>
3️⃣ val b = (1 &lt; a) and (a &lt; 5)<br>
4️⃣ val b = 1 &lt; a and a &lt; 5<br>
Ответ 4:<br>
При использовании `and` вместо `&&` или `or` вместо `||`  необходимо заключать операции отношения в круглые скобки
(это связано с приоритетом выполнения операций).
---
Вопрос 9<br>
Какой вариант записи условия для двойного неравенства 1 &lt;= a &lt;= 5 неверен?<br>
1️⃣ 1 &lt;= a && a &lt;= 5<br>
2️⃣ 1 &lt;= a &lt;= 5<br>
3️⃣ a in 1..5<br>
4️⃣ (1 &lt;= a) and (a &lt;= 5)<br>
Ответ 3:<br>
В Kotlin нельзя записывать двойные неравенства как например в Python.<br> 
Нужно разбивать на два неравенства и записывать их через “и” либо же использовать диапазон.
---
Вопрос 10<br>
Какая из операций является унарной?<br>
1️⃣ !<br>
2️⃣ &&<br>
3️⃣ &lt;<br>
4️⃣ &gt;<br>
Ответ 1:<br>
Унарной (то есть не принимающей два значения, как например &&, а работающей с одним значением)
операцией является только операция “не”, которая инвертирует Boolean значение.