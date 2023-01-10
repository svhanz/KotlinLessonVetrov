# УРОК 6: ЦИКЛЫ В KOTLIN. WHILE, DO-WHILE

---

## Что такое циклы?

Циклы позволяют многократно исполнять один и тот же код при определенных условиях.<br>
Во-первых, мы избегаем дублирования кода, что в принципе считается хорошим тоном.<br>
Во-вторых, количество итераций может быть бесконечно многим и повторять работу<br>
какого-либо компонента они должны, например, на протяжении всего жизненного цикла программы.<br>
В таких случаях не обойтись без конструкций для регулярного повторения исполнения кода.<br>
Я расскажу про несколько видов циклов: `while` и `do-while`.

Представим, что в нашем приложении перед открытием определенного экрана необходимо показать баннер с рекламой.<br>
А под баннером будет отображаться надпись – “Реклама закончится через 5, 4, 3… и так далее”.<br>
Экраном со счетчиком сегодня будет выступать наша консоль.

Продемонстрирую проблему: чтобы реализовать счетчик без циклов, необходимо 5 раз подряд вызвать сообщение, <br>
при этом каждый раз меняя строку с оставшимся временем:
```
println("Реклама закончится через 5")
println("Реклама закончится через 4")
println("Реклама закончится через 3")
println("Реклама закончится через 2")
println("Реклама закончится через 1")
```
## Цикл while в Котлин

Громоздко и много повторений.<br>
Реализуем это более изящно с помощью цикла `while` и одной дополнительной переменной в качестве счетчика.<br>
Создаем изменяемую переменную с именем `counter` и проинициализируем ее числом, с которого хотим начать обратный отсчет – 5.<br>
Далее пишем ключевое слово `while`, а в круглых скобках условие `(counter > 0)` “Пока counter больше 0”.<br>
Далее пишем фигурные скобки – это тело цикла.<br>
Тот самый код, который будет исполняться, пока условие в круглых скобках является `true`.<br>
Мы будем изменять значение переменной, отнимая по единице каждую секунду и когда `counter` станет равным 0, <br>
условие вернет `false` и программа не зайдет внутрь цикла и не выполнит написанный код.

В теле цикла мы будем выводить наше информационное сообщение с помощью вызова `println()`, <br>
а в качестве значения счетчика подставим переменную `$counter`, используя интерполяцию строк:
```
var counter = 5

while (counter > 0) {
		println("Реклама закончится через $counter")
}
```
Если сейчас запустить цикл, он будет бесконечно выполнять инструкцию, потому что `counter`<br>
никогда не станет 0. То же самое будет, если написать `while(true)`.<br>
Чтобы работа цикла закончилась через 5 итераций, нужно отнимать от счетчика единицу в каждой его итерации.<br>
Поэтому применим к переменной постфиксную операцию декремента.<br>
Мы разбирали их в теме по арифметическим операциям.<br>
Обратите внимание, что сейчас два минуса окрашены в серый цвет строки.<br>
Все потому, что теперь это стало выражением, а при применении шаблонных строк выражения <br>
необходимо дополнительно оборачивать в фигурные скобки, сохраняя знак доллара перед ними.<br>
Таким образом мы обозначили границы:
```
var counter = 5

while (counter > 0) {
		println("Реклама закончится через ${counter--}")
}
```
Что теперь будет происходить в программе: объявленная переменная содержит число 5.<br>
На 5 строчке проверяется условие в круглых скобках – 5 больше 0 – это истина.<br>
Программа заходит в тело цикла и вызывает вывод в консоль сообщения.<br>
В `counter` по-прежнему остается 5 без изменений.<br>
Затем срабатывает операция декремента и от 5 отнимается единица.<br>
Далее программа упирается в конец тела цикла и заново возвращается проверять условие.<br>
В переменной `counter` уже 4 и это также `true`.<br>
Так повторяется, пока `counter` не станет 0 и при очередной проверке условия, оно вернет `false`.<br>
После чего программа не зайдет в тело цикла и не обнаружив дополнительных инструкций завершит свое выполнение.

Что теперь будет происходить в программе: объявленная переменная содержит число 5.<br>
На 5 строчке проверяется условие в круглых скобках – 5 больше 0 – это истина.<br>
Программа заходит в тело цикла и вызывает вывод в консоль сообщения.<br>
В `counter` по-прежнему остается 5 без изменений.<br>
Затем срабатывает операция декремента и от 5 отнимается единица.<br>
Далее программа упирается в конец тела цикла и заново возвращается проверять условие.<br>
В переменной `counter` уже 4 и это также `true`.<br>
Так повторяется, пока `counter` не станет 0 и при очередной проверке условия, оно вернет `false`.<br>
После чего программа не зайдет в тело цикла и не обнаружив дополнительных инструкций завершит свое выполнение:
```
while (counter > 0) {
		println("Реклама закончится через ${--counter}")
}
```
Наш счетчик распечатал и 0 тоже, потому что на момент проверки условия там все еще была единица.<br>
Но это все еще не похоже на посекундный счетчик.<br>
Для правдоподобности добавим еще одну инструкцию в цикл, <br>
а именно после каждого сообщения будем ставить на паузу программу на 1 секунду.
```
while (counter > 0) {
		println("Реклама закончится через ${counter--}")
		Thread.sleep(1000)
```
В общих словах.<br>
Запустив метод main(), мы запустили определенный процесс.<br>
В любом процессе присутствует поток для его выполнения.<br>
За поток отвечает класс `Thread` и внутри этого класса есть метод `sleep()`, который мы и вызвали.<br>
Он позволяет приостановить поток, в котором выполняется программа на определенное время.<br>
Время устанавливается в миллисекундах в качестве параметра, то есть записывается в круглые скобки.<br>
1000 миллисекунд – это 1 секунда.<br>
Запустим программу и убедимся, что паузы работают и сообщение ежесекундно обновляется.
---
## Цикл do-while

Великолепно. Посмотрим на еще один вид цикла do-while:
```
do {
	println("${counter--}")
    Thread.sleep(1000)
} while (counter > 0)
```
Конструкция выглядит вот так.<br>
Скопируем данные из первого цикла и запустим.<br>
Поведение полностью идентичное, за исключением одного.<br>
Тело цикла `do-while` сначала выполнит один раз код внутри себя при любых обстоятельствах, <br>
а только потом будет проверять условие на `true` или `false` и определять надо ли входить в цикл еще раз.<br>
Даже если мы намеренно выставим `false` в проверке условия, цикл все равно сначала отработает одну итерацию.
```
do {
	println("${counter--}")
    Thread.sleep(1000)
} while (false)
```