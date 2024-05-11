Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:

a. Рассчитывает среднее значение каждого списка.

b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.

  *Формат и требования к сдаче:*
Отчет о выполнении этого задания должен включать в себя следующие элементы:
- Код программы
- Код тестов
- Отчет pylint/Checkstyle
- Отчет о покрытии тестами
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

**Решение**
Тесты testCreatedList, testFindAverage юнит-тесты, проверяющие правильность работы методов создания списков и нахождения среднего значения списка.

В тестах класса CompareAverageTest используются mock-объекты, подменяющие объект findAverage класса FindAverage, т.к. класс CompareAverages имеет зависимость от класса FindAverage.

Тесты класса CompareAverageIntegrationTest - интеграционные тесты, т.к. проверяется зависимость класса CompareAverages от выполнения класса FindAverage